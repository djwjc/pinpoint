/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.plugin.editor;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.navercorp.pinpoint.bootstrap.instrument.InstrumentClass;
import com.navercorp.pinpoint.bootstrap.instrument.InstrumentException;
import com.navercorp.pinpoint.bootstrap.instrument.MethodInfo;
import com.navercorp.pinpoint.bootstrap.plugin.editor.MethodEditorExceptionHandler;

public class DedicatedMethodEditor implements MethodEditor {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    private final String targetMethodName;
    private final String[] targetMethodParameterTypes;
    private final List<MethodRecipe> recipes;
    private final MethodEditorExceptionHandler exceptionHandler;
    private final boolean ignoreIfNotExist;

    public DedicatedMethodEditor(String targetMethodName, String[] targetMethodParameterTypes, List<MethodRecipe> recipes, MethodEditorExceptionHandler handler, boolean ignoreIfNotExist) {
        this.targetMethodName = targetMethodName;
        this.targetMethodParameterTypes = targetMethodParameterTypes;
        this.recipes = recipes;
        this.exceptionHandler = handler;
        this.ignoreIfNotExist = ignoreIfNotExist;
    }

    @Override
    public void edit(ClassLoader classLoader, InstrumentClass target) throws Throwable {
        MethodInfo targetMethod = target.getDeclaredMethod(targetMethodName, targetMethodParameterTypes);
        
        if (targetMethod == null) {
            if (ignoreIfNotExist) {
                return;
            } else {
                Exception e = new NoSuchMethodException("No such method: " + targetMethodName + "(" + Arrays.deepToString(targetMethodParameterTypes) + ")");
                
                if (exceptionHandler != null) {
                    exceptionHandler.handle(target.getName(), targetMethodName, targetMethodParameterTypes, e);
                    logger.info("Cannot find target method" + targetMethodName + "(" + Arrays.deepToString(targetMethodParameterTypes) + ") but MethodEditorExceptionHandler handled it.");
                } else {
                    throw new InstrumentException("Fail to edit method", e);
                }
            }
        }
        
        for (MethodRecipe recipe : recipes) {
            try {
                recipe.edit(classLoader, target, targetMethod);
            } catch (Throwable t) {
                if (exceptionHandler != null) {
                    exceptionHandler.handle(target.getName(), targetMethodName, targetMethodParameterTypes, t);
                    logger.info("Exception thrown while editing" + targetMethod.getDescriptor().getApiDescriptor() + " but MethodEditorExceptionHandler handled it.", t);
                } else {
                    throw new InstrumentException("Fail to edit method " + targetMethod.getDescriptor().getApiDescriptor(), t);
                }
            }
        }
    }
}
