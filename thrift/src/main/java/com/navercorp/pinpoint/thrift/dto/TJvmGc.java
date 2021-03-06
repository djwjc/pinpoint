/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TJvmGc implements org.apache.thrift.TBase<TJvmGc, TJvmGc._Fields>, java.io.Serializable, Cloneable, Comparable<TJvmGc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJvmGc");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JVM_MEMORY_HEAP_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmMemoryHeapUsed", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField JVM_MEMORY_HEAP_MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmMemoryHeapMax", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField JVM_MEMORY_NON_HEAP_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmMemoryNonHeapUsed", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField JVM_MEMORY_NON_HEAP_MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmMemoryNonHeapMax", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField JVM_GC_OLD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmGcOldCount", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField JVM_GC_OLD_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmGcOldTime", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TJvmGcStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TJvmGcTupleSchemeFactory());
  }

  private TJvmGcType type; // required
  private long jvmMemoryHeapUsed; // required
  private long jvmMemoryHeapMax; // required
  private long jvmMemoryNonHeapUsed; // required
  private long jvmMemoryNonHeapMax; // required
  private long jvmGcOldCount; // required
  private long jvmGcOldTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TJvmGcType
     */
    TYPE((short)1, "type"),
    JVM_MEMORY_HEAP_USED((short)2, "jvmMemoryHeapUsed"),
    JVM_MEMORY_HEAP_MAX((short)3, "jvmMemoryHeapMax"),
    JVM_MEMORY_NON_HEAP_USED((short)4, "jvmMemoryNonHeapUsed"),
    JVM_MEMORY_NON_HEAP_MAX((short)5, "jvmMemoryNonHeapMax"),
    JVM_GC_OLD_COUNT((short)6, "jvmGcOldCount"),
    JVM_GC_OLD_TIME((short)7, "jvmGcOldTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // JVM_MEMORY_HEAP_USED
          return JVM_MEMORY_HEAP_USED;
        case 3: // JVM_MEMORY_HEAP_MAX
          return JVM_MEMORY_HEAP_MAX;
        case 4: // JVM_MEMORY_NON_HEAP_USED
          return JVM_MEMORY_NON_HEAP_USED;
        case 5: // JVM_MEMORY_NON_HEAP_MAX
          return JVM_MEMORY_NON_HEAP_MAX;
        case 6: // JVM_GC_OLD_COUNT
          return JVM_GC_OLD_COUNT;
        case 7: // JVM_GC_OLD_TIME
          return JVM_GC_OLD_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JVMMEMORYHEAPUSED_ISSET_ID = 0;
  private static final int __JVMMEMORYHEAPMAX_ISSET_ID = 1;
  private static final int __JVMMEMORYNONHEAPUSED_ISSET_ID = 2;
  private static final int __JVMMEMORYNONHEAPMAX_ISSET_ID = 3;
  private static final int __JVMGCOLDCOUNT_ISSET_ID = 4;
  private static final int __JVMGCOLDTIME_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TJvmGcType.class)));
    tmpMap.put(_Fields.JVM_MEMORY_HEAP_USED, new org.apache.thrift.meta_data.FieldMetaData("jvmMemoryHeapUsed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JVM_MEMORY_HEAP_MAX, new org.apache.thrift.meta_data.FieldMetaData("jvmMemoryHeapMax", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JVM_MEMORY_NON_HEAP_USED, new org.apache.thrift.meta_data.FieldMetaData("jvmMemoryNonHeapUsed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JVM_MEMORY_NON_HEAP_MAX, new org.apache.thrift.meta_data.FieldMetaData("jvmMemoryNonHeapMax", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JVM_GC_OLD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("jvmGcOldCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JVM_GC_OLD_TIME, new org.apache.thrift.meta_data.FieldMetaData("jvmGcOldTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJvmGc.class, metaDataMap);
  }

  public TJvmGc() {
    this.type = com.navercorp.pinpoint.thrift.dto.TJvmGcType.UNKNOWN;

  }

  public TJvmGc(
    TJvmGcType type,
    long jvmMemoryHeapUsed,
    long jvmMemoryHeapMax,
    long jvmMemoryNonHeapUsed,
    long jvmMemoryNonHeapMax,
    long jvmGcOldCount,
    long jvmGcOldTime)
  {
    this();
    this.type = type;
    this.jvmMemoryHeapUsed = jvmMemoryHeapUsed;
    setJvmMemoryHeapUsedIsSet(true);
    this.jvmMemoryHeapMax = jvmMemoryHeapMax;
    setJvmMemoryHeapMaxIsSet(true);
    this.jvmMemoryNonHeapUsed = jvmMemoryNonHeapUsed;
    setJvmMemoryNonHeapUsedIsSet(true);
    this.jvmMemoryNonHeapMax = jvmMemoryNonHeapMax;
    setJvmMemoryNonHeapMaxIsSet(true);
    this.jvmGcOldCount = jvmGcOldCount;
    setJvmGcOldCountIsSet(true);
    this.jvmGcOldTime = jvmGcOldTime;
    setJvmGcOldTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJvmGc(TJvmGc other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.jvmMemoryHeapUsed = other.jvmMemoryHeapUsed;
    this.jvmMemoryHeapMax = other.jvmMemoryHeapMax;
    this.jvmMemoryNonHeapUsed = other.jvmMemoryNonHeapUsed;
    this.jvmMemoryNonHeapMax = other.jvmMemoryNonHeapMax;
    this.jvmGcOldCount = other.jvmGcOldCount;
    this.jvmGcOldTime = other.jvmGcOldTime;
  }

  public TJvmGc deepCopy() {
    return new TJvmGc(this);
  }

  @Override
  public void clear() {
    this.type = com.navercorp.pinpoint.thrift.dto.TJvmGcType.UNKNOWN;

    setJvmMemoryHeapUsedIsSet(false);
    this.jvmMemoryHeapUsed = 0;
    setJvmMemoryHeapMaxIsSet(false);
    this.jvmMemoryHeapMax = 0;
    setJvmMemoryNonHeapUsedIsSet(false);
    this.jvmMemoryNonHeapUsed = 0;
    setJvmMemoryNonHeapMaxIsSet(false);
    this.jvmMemoryNonHeapMax = 0;
    setJvmGcOldCountIsSet(false);
    this.jvmGcOldCount = 0;
    setJvmGcOldTimeIsSet(false);
    this.jvmGcOldTime = 0;
  }

  /**
   * 
   * @see TJvmGcType
   */
  public TJvmGcType getType() {
    return this.type;
  }

  /**
   * 
   * @see TJvmGcType
   */
  public void setType(TJvmGcType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long getJvmMemoryHeapUsed() {
    return this.jvmMemoryHeapUsed;
  }

  public void setJvmMemoryHeapUsed(long jvmMemoryHeapUsed) {
    this.jvmMemoryHeapUsed = jvmMemoryHeapUsed;
    setJvmMemoryHeapUsedIsSet(true);
  }

  public void unsetJvmMemoryHeapUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMMEMORYHEAPUSED_ISSET_ID);
  }

  /** Returns true if field jvmMemoryHeapUsed is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmMemoryHeapUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMMEMORYHEAPUSED_ISSET_ID);
  }

  public void setJvmMemoryHeapUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMMEMORYHEAPUSED_ISSET_ID, value);
  }

  public long getJvmMemoryHeapMax() {
    return this.jvmMemoryHeapMax;
  }

  public void setJvmMemoryHeapMax(long jvmMemoryHeapMax) {
    this.jvmMemoryHeapMax = jvmMemoryHeapMax;
    setJvmMemoryHeapMaxIsSet(true);
  }

  public void unsetJvmMemoryHeapMax() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMMEMORYHEAPMAX_ISSET_ID);
  }

  /** Returns true if field jvmMemoryHeapMax is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmMemoryHeapMax() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMMEMORYHEAPMAX_ISSET_ID);
  }

  public void setJvmMemoryHeapMaxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMMEMORYHEAPMAX_ISSET_ID, value);
  }

  public long getJvmMemoryNonHeapUsed() {
    return this.jvmMemoryNonHeapUsed;
  }

  public void setJvmMemoryNonHeapUsed(long jvmMemoryNonHeapUsed) {
    this.jvmMemoryNonHeapUsed = jvmMemoryNonHeapUsed;
    setJvmMemoryNonHeapUsedIsSet(true);
  }

  public void unsetJvmMemoryNonHeapUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMMEMORYNONHEAPUSED_ISSET_ID);
  }

  /** Returns true if field jvmMemoryNonHeapUsed is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmMemoryNonHeapUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMMEMORYNONHEAPUSED_ISSET_ID);
  }

  public void setJvmMemoryNonHeapUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMMEMORYNONHEAPUSED_ISSET_ID, value);
  }

  public long getJvmMemoryNonHeapMax() {
    return this.jvmMemoryNonHeapMax;
  }

  public void setJvmMemoryNonHeapMax(long jvmMemoryNonHeapMax) {
    this.jvmMemoryNonHeapMax = jvmMemoryNonHeapMax;
    setJvmMemoryNonHeapMaxIsSet(true);
  }

  public void unsetJvmMemoryNonHeapMax() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMMEMORYNONHEAPMAX_ISSET_ID);
  }

  /** Returns true if field jvmMemoryNonHeapMax is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmMemoryNonHeapMax() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMMEMORYNONHEAPMAX_ISSET_ID);
  }

  public void setJvmMemoryNonHeapMaxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMMEMORYNONHEAPMAX_ISSET_ID, value);
  }

  public long getJvmGcOldCount() {
    return this.jvmGcOldCount;
  }

  public void setJvmGcOldCount(long jvmGcOldCount) {
    this.jvmGcOldCount = jvmGcOldCount;
    setJvmGcOldCountIsSet(true);
  }

  public void unsetJvmGcOldCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMGCOLDCOUNT_ISSET_ID);
  }

  /** Returns true if field jvmGcOldCount is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmGcOldCount() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMGCOLDCOUNT_ISSET_ID);
  }

  public void setJvmGcOldCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMGCOLDCOUNT_ISSET_ID, value);
  }

  public long getJvmGcOldTime() {
    return this.jvmGcOldTime;
  }

  public void setJvmGcOldTime(long jvmGcOldTime) {
    this.jvmGcOldTime = jvmGcOldTime;
    setJvmGcOldTimeIsSet(true);
  }

  public void unsetJvmGcOldTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JVMGCOLDTIME_ISSET_ID);
  }

  /** Returns true if field jvmGcOldTime is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmGcOldTime() {
    return EncodingUtils.testBit(__isset_bitfield, __JVMGCOLDTIME_ISSET_ID);
  }

  public void setJvmGcOldTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JVMGCOLDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TJvmGcType)value);
      }
      break;

    case JVM_MEMORY_HEAP_USED:
      if (value == null) {
        unsetJvmMemoryHeapUsed();
      } else {
        setJvmMemoryHeapUsed((Long)value);
      }
      break;

    case JVM_MEMORY_HEAP_MAX:
      if (value == null) {
        unsetJvmMemoryHeapMax();
      } else {
        setJvmMemoryHeapMax((Long)value);
      }
      break;

    case JVM_MEMORY_NON_HEAP_USED:
      if (value == null) {
        unsetJvmMemoryNonHeapUsed();
      } else {
        setJvmMemoryNonHeapUsed((Long)value);
      }
      break;

    case JVM_MEMORY_NON_HEAP_MAX:
      if (value == null) {
        unsetJvmMemoryNonHeapMax();
      } else {
        setJvmMemoryNonHeapMax((Long)value);
      }
      break;

    case JVM_GC_OLD_COUNT:
      if (value == null) {
        unsetJvmGcOldCount();
      } else {
        setJvmGcOldCount((Long)value);
      }
      break;

    case JVM_GC_OLD_TIME:
      if (value == null) {
        unsetJvmGcOldTime();
      } else {
        setJvmGcOldTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case JVM_MEMORY_HEAP_USED:
      return Long.valueOf(getJvmMemoryHeapUsed());

    case JVM_MEMORY_HEAP_MAX:
      return Long.valueOf(getJvmMemoryHeapMax());

    case JVM_MEMORY_NON_HEAP_USED:
      return Long.valueOf(getJvmMemoryNonHeapUsed());

    case JVM_MEMORY_NON_HEAP_MAX:
      return Long.valueOf(getJvmMemoryNonHeapMax());

    case JVM_GC_OLD_COUNT:
      return Long.valueOf(getJvmGcOldCount());

    case JVM_GC_OLD_TIME:
      return Long.valueOf(getJvmGcOldTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case JVM_MEMORY_HEAP_USED:
      return isSetJvmMemoryHeapUsed();
    case JVM_MEMORY_HEAP_MAX:
      return isSetJvmMemoryHeapMax();
    case JVM_MEMORY_NON_HEAP_USED:
      return isSetJvmMemoryNonHeapUsed();
    case JVM_MEMORY_NON_HEAP_MAX:
      return isSetJvmMemoryNonHeapMax();
    case JVM_GC_OLD_COUNT:
      return isSetJvmGcOldCount();
    case JVM_GC_OLD_TIME:
      return isSetJvmGcOldTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TJvmGc)
      return this.equals((TJvmGc)that);
    return false;
  }

  public boolean equals(TJvmGc that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_jvmMemoryHeapUsed = true;
    boolean that_present_jvmMemoryHeapUsed = true;
    if (this_present_jvmMemoryHeapUsed || that_present_jvmMemoryHeapUsed) {
      if (!(this_present_jvmMemoryHeapUsed && that_present_jvmMemoryHeapUsed))
        return false;
      if (this.jvmMemoryHeapUsed != that.jvmMemoryHeapUsed)
        return false;
    }

    boolean this_present_jvmMemoryHeapMax = true;
    boolean that_present_jvmMemoryHeapMax = true;
    if (this_present_jvmMemoryHeapMax || that_present_jvmMemoryHeapMax) {
      if (!(this_present_jvmMemoryHeapMax && that_present_jvmMemoryHeapMax))
        return false;
      if (this.jvmMemoryHeapMax != that.jvmMemoryHeapMax)
        return false;
    }

    boolean this_present_jvmMemoryNonHeapUsed = true;
    boolean that_present_jvmMemoryNonHeapUsed = true;
    if (this_present_jvmMemoryNonHeapUsed || that_present_jvmMemoryNonHeapUsed) {
      if (!(this_present_jvmMemoryNonHeapUsed && that_present_jvmMemoryNonHeapUsed))
        return false;
      if (this.jvmMemoryNonHeapUsed != that.jvmMemoryNonHeapUsed)
        return false;
    }

    boolean this_present_jvmMemoryNonHeapMax = true;
    boolean that_present_jvmMemoryNonHeapMax = true;
    if (this_present_jvmMemoryNonHeapMax || that_present_jvmMemoryNonHeapMax) {
      if (!(this_present_jvmMemoryNonHeapMax && that_present_jvmMemoryNonHeapMax))
        return false;
      if (this.jvmMemoryNonHeapMax != that.jvmMemoryNonHeapMax)
        return false;
    }

    boolean this_present_jvmGcOldCount = true;
    boolean that_present_jvmGcOldCount = true;
    if (this_present_jvmGcOldCount || that_present_jvmGcOldCount) {
      if (!(this_present_jvmGcOldCount && that_present_jvmGcOldCount))
        return false;
      if (this.jvmGcOldCount != that.jvmGcOldCount)
        return false;
    }

    boolean this_present_jvmGcOldTime = true;
    boolean that_present_jvmGcOldTime = true;
    if (this_present_jvmGcOldTime || that_present_jvmGcOldTime) {
      if (!(this_present_jvmGcOldTime && that_present_jvmGcOldTime))
        return false;
      if (this.jvmGcOldTime != that.jvmGcOldTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TJvmGc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmMemoryHeapUsed()).compareTo(other.isSetJvmMemoryHeapUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmMemoryHeapUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmMemoryHeapUsed, other.jvmMemoryHeapUsed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmMemoryHeapMax()).compareTo(other.isSetJvmMemoryHeapMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmMemoryHeapMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmMemoryHeapMax, other.jvmMemoryHeapMax);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmMemoryNonHeapUsed()).compareTo(other.isSetJvmMemoryNonHeapUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmMemoryNonHeapUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmMemoryNonHeapUsed, other.jvmMemoryNonHeapUsed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmMemoryNonHeapMax()).compareTo(other.isSetJvmMemoryNonHeapMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmMemoryNonHeapMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmMemoryNonHeapMax, other.jvmMemoryNonHeapMax);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmGcOldCount()).compareTo(other.isSetJvmGcOldCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmGcOldCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmGcOldCount, other.jvmGcOldCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJvmGcOldTime()).compareTo(other.isSetJvmGcOldTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmGcOldTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmGcOldTime, other.jvmGcOldTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TJvmGc(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmMemoryHeapUsed:");
    sb.append(this.jvmMemoryHeapUsed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmMemoryHeapMax:");
    sb.append(this.jvmMemoryHeapMax);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmMemoryNonHeapUsed:");
    sb.append(this.jvmMemoryNonHeapUsed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmMemoryNonHeapMax:");
    sb.append(this.jvmMemoryNonHeapMax);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmGcOldCount:");
    sb.append(this.jvmGcOldCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jvmGcOldTime:");
    sb.append(this.jvmGcOldTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TJvmGcStandardSchemeFactory implements SchemeFactory {
    public TJvmGcStandardScheme getScheme() {
      return new TJvmGcStandardScheme();
    }
  }

  private static class TJvmGcStandardScheme extends StandardScheme<TJvmGc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJvmGc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = TJvmGcType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JVM_MEMORY_HEAP_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmMemoryHeapUsed = iprot.readI64();
              struct.setJvmMemoryHeapUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JVM_MEMORY_HEAP_MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmMemoryHeapMax = iprot.readI64();
              struct.setJvmMemoryHeapMaxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JVM_MEMORY_NON_HEAP_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmMemoryNonHeapUsed = iprot.readI64();
              struct.setJvmMemoryNonHeapUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JVM_MEMORY_NON_HEAP_MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmMemoryNonHeapMax = iprot.readI64();
              struct.setJvmMemoryNonHeapMaxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // JVM_GC_OLD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmGcOldCount = iprot.readI64();
              struct.setJvmGcOldCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // JVM_GC_OLD_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jvmGcOldTime = iprot.readI64();
              struct.setJvmGcOldTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJvmGc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(JVM_MEMORY_HEAP_USED_FIELD_DESC);
      oprot.writeI64(struct.jvmMemoryHeapUsed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JVM_MEMORY_HEAP_MAX_FIELD_DESC);
      oprot.writeI64(struct.jvmMemoryHeapMax);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JVM_MEMORY_NON_HEAP_USED_FIELD_DESC);
      oprot.writeI64(struct.jvmMemoryNonHeapUsed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JVM_MEMORY_NON_HEAP_MAX_FIELD_DESC);
      oprot.writeI64(struct.jvmMemoryNonHeapMax);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JVM_GC_OLD_COUNT_FIELD_DESC);
      oprot.writeI64(struct.jvmGcOldCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JVM_GC_OLD_TIME_FIELD_DESC);
      oprot.writeI64(struct.jvmGcOldTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJvmGcTupleSchemeFactory implements SchemeFactory {
    public TJvmGcTupleScheme getScheme() {
      return new TJvmGcTupleScheme();
    }
  }

  private static class TJvmGcTupleScheme extends TupleScheme<TJvmGc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJvmGc struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetJvmMemoryHeapUsed()) {
        optionals.set(1);
      }
      if (struct.isSetJvmMemoryHeapMax()) {
        optionals.set(2);
      }
      if (struct.isSetJvmMemoryNonHeapUsed()) {
        optionals.set(3);
      }
      if (struct.isSetJvmMemoryNonHeapMax()) {
        optionals.set(4);
      }
      if (struct.isSetJvmGcOldCount()) {
        optionals.set(5);
      }
      if (struct.isSetJvmGcOldTime()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetJvmMemoryHeapUsed()) {
        oprot.writeI64(struct.jvmMemoryHeapUsed);
      }
      if (struct.isSetJvmMemoryHeapMax()) {
        oprot.writeI64(struct.jvmMemoryHeapMax);
      }
      if (struct.isSetJvmMemoryNonHeapUsed()) {
        oprot.writeI64(struct.jvmMemoryNonHeapUsed);
      }
      if (struct.isSetJvmMemoryNonHeapMax()) {
        oprot.writeI64(struct.jvmMemoryNonHeapMax);
      }
      if (struct.isSetJvmGcOldCount()) {
        oprot.writeI64(struct.jvmGcOldCount);
      }
      if (struct.isSetJvmGcOldTime()) {
        oprot.writeI64(struct.jvmGcOldTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJvmGc struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.type = TJvmGcType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jvmMemoryHeapUsed = iprot.readI64();
        struct.setJvmMemoryHeapUsedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.jvmMemoryHeapMax = iprot.readI64();
        struct.setJvmMemoryHeapMaxIsSet(true);
      }
      if (incoming.get(3)) {
        struct.jvmMemoryNonHeapUsed = iprot.readI64();
        struct.setJvmMemoryNonHeapUsedIsSet(true);
      }
      if (incoming.get(4)) {
        struct.jvmMemoryNonHeapMax = iprot.readI64();
        struct.setJvmMemoryNonHeapMaxIsSet(true);
      }
      if (incoming.get(5)) {
        struct.jvmGcOldCount = iprot.readI64();
        struct.setJvmGcOldCountIsSet(true);
      }
      if (incoming.get(6)) {
        struct.jvmGcOldTime = iprot.readI64();
        struct.setJvmGcOldTimeIsSet(true);
      }
    }
  }

}

