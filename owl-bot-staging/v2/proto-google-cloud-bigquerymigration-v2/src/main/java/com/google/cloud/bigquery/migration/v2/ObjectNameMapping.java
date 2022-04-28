// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2/translation_config.proto

package com.google.cloud.bigquery.migration.v2;

/**
 * <pre>
 * Represents a key-value pair of NameMappingKey to NameMappingValue to
 * represent the mapping of SQL names from the input value to desired output.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2.ObjectNameMapping}
 */
public final class ObjectNameMapping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2.ObjectNameMapping)
    ObjectNameMappingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectNameMapping.newBuilder() to construct.
  private ObjectNameMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectNameMapping() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectNameMapping();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ObjectNameMapping(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder subBuilder = null;
            if (source_ != null) {
              subBuilder = source_.toBuilder();
            }
            source_ = input.readMessage(com.google.cloud.bigquery.migration.v2.NameMappingKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(source_);
              source_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder subBuilder = null;
            if (target_ != null) {
              subBuilder = target_.toBuilder();
            }
            target_ = input.readMessage(com.google.cloud.bigquery.migration.v2.NameMappingValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(target_);
              target_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto.internal_static_google_cloud_bigquery_migration_v2_ObjectNameMapping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto.internal_static_google_cloud_bigquery_migration_v2_ObjectNameMapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2.ObjectNameMapping.class, com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.migration.v2.NameMappingKey source_;
  /**
   * <pre>
   * The name of the object in source that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return source_ != null;
  }
  /**
   * <pre>
   * The name of the object in source that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
   * @return The source.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.NameMappingKey getSource() {
    return source_ == null ? com.google.cloud.bigquery.migration.v2.NameMappingKey.getDefaultInstance() : source_;
  }
  /**
   * <pre>
   * The name of the object in source that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.NameMappingKeyOrBuilder getSourceOrBuilder() {
    return getSource();
  }

  public static final int TARGET_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.migration.v2.NameMappingValue target_;
  /**
   * <pre>
   * The desired target name of the object that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
   * @return Whether the target field is set.
   */
  @java.lang.Override
  public boolean hasTarget() {
    return target_ != null;
  }
  /**
   * <pre>
   * The desired target name of the object that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
   * @return The target.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.NameMappingValue getTarget() {
    return target_ == null ? com.google.cloud.bigquery.migration.v2.NameMappingValue.getDefaultInstance() : target_;
  }
  /**
   * <pre>
   * The desired target name of the object that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder getTargetOrBuilder() {
    return getTarget();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (source_ != null) {
      output.writeMessage(1, getSource());
    }
    if (target_ != null) {
      output.writeMessage(2, getTarget());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (source_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSource());
    }
    if (target_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTarget());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2.ObjectNameMapping)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2.ObjectNameMapping other = (com.google.cloud.bigquery.migration.v2.ObjectNameMapping) obj;

    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource()
          .equals(other.getSource())) return false;
    }
    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2.ObjectNameMapping prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a key-value pair of NameMappingKey to NameMappingValue to
   * represent the mapping of SQL names from the input value to desired output.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2.ObjectNameMapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2.ObjectNameMapping)
      com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto.internal_static_google_cloud_bigquery_migration_v2_ObjectNameMapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto.internal_static_google_cloud_bigquery_migration_v2_ObjectNameMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2.ObjectNameMapping.class, com.google.cloud.bigquery.migration.v2.ObjectNameMapping.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2.ObjectNameMapping.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sourceBuilder_ == null) {
        source_ = null;
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }
      if (targetBuilder_ == null) {
        target_ = null;
      } else {
        target_ = null;
        targetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto.internal_static_google_cloud_bigquery_migration_v2_ObjectNameMapping_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2.ObjectNameMapping.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping build() {
      com.google.cloud.bigquery.migration.v2.ObjectNameMapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.ObjectNameMapping buildPartial() {
      com.google.cloud.bigquery.migration.v2.ObjectNameMapping result = new com.google.cloud.bigquery.migration.v2.ObjectNameMapping(this);
      if (sourceBuilder_ == null) {
        result.source_ = source_;
      } else {
        result.source_ = sourceBuilder_.build();
      }
      if (targetBuilder_ == null) {
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.migration.v2.ObjectNameMapping) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2.ObjectNameMapping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2.ObjectNameMapping other) {
      if (other == com.google.cloud.bigquery.migration.v2.ObjectNameMapping.getDefaultInstance()) return this;
      if (other.hasSource()) {
        mergeSource(other.getSource());
      }
      if (other.hasTarget()) {
        mergeTarget(other.getTarget());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.bigquery.migration.v2.ObjectNameMapping parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.migration.v2.ObjectNameMapping) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.bigquery.migration.v2.NameMappingKey source_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2.NameMappingKey, com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder, com.google.cloud.bigquery.migration.v2.NameMappingKeyOrBuilder> sourceBuilder_;
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return sourceBuilder_ != null || source_ != null;
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     * @return The source.
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingKey getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null ? com.google.cloud.bigquery.migration.v2.NameMappingKey.getDefaultInstance() : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public Builder setSource(com.google.cloud.bigquery.migration.v2.NameMappingKey value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        sourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public Builder setSource(
        com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public Builder mergeSource(com.google.cloud.bigquery.migration.v2.NameMappingKey value) {
      if (sourceBuilder_ == null) {
        if (source_ != null) {
          source_ =
            com.google.cloud.bigquery.migration.v2.NameMappingKey.newBuilder(source_).mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        sourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public Builder clearSource() {
      if (sourceBuilder_ == null) {
        source_ = null;
        onChanged();
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder getSourceBuilder() {
      
      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingKeyOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null ?
            com.google.cloud.bigquery.migration.v2.NameMappingKey.getDefaultInstance() : source_;
      }
    }
    /**
     * <pre>
     * The name of the object in source that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingKey source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2.NameMappingKey, com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder, com.google.cloud.bigquery.migration.v2.NameMappingKeyOrBuilder> 
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.NameMappingKey, com.google.cloud.bigquery.migration.v2.NameMappingKey.Builder, com.google.cloud.bigquery.migration.v2.NameMappingKeyOrBuilder>(
                getSource(),
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      return sourceBuilder_;
    }

    private com.google.cloud.bigquery.migration.v2.NameMappingValue target_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2.NameMappingValue, com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder, com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder> targetBuilder_;
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     * @return Whether the target field is set.
     */
    public boolean hasTarget() {
      return targetBuilder_ != null || target_ != null;
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     * @return The target.
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingValue getTarget() {
      if (targetBuilder_ == null) {
        return target_ == null ? com.google.cloud.bigquery.migration.v2.NameMappingValue.getDefaultInstance() : target_;
      } else {
        return targetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public Builder setTarget(com.google.cloud.bigquery.migration.v2.NameMappingValue value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        targetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public Builder setTarget(
        com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder builderForValue) {
      if (targetBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        targetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public Builder mergeTarget(com.google.cloud.bigquery.migration.v2.NameMappingValue value) {
      if (targetBuilder_ == null) {
        if (target_ != null) {
          target_ =
            com.google.cloud.bigquery.migration.v2.NameMappingValue.newBuilder(target_).mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        targetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = null;
        onChanged();
      } else {
        target_ = null;
        targetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder getTargetBuilder() {
      
      onChanged();
      return getTargetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder getTargetOrBuilder() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilder();
      } else {
        return target_ == null ?
            com.google.cloud.bigquery.migration.v2.NameMappingValue.getDefaultInstance() : target_;
      }
    }
    /**
     * <pre>
     * The desired target name of the object that is being mapped.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.NameMappingValue target = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2.NameMappingValue, com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder, com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.NameMappingValue, com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder, com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder>(
                getTarget(),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2.ObjectNameMapping)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2.ObjectNameMapping)
  private static final com.google.cloud.bigquery.migration.v2.ObjectNameMapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2.ObjectNameMapping();
  }

  public static com.google.cloud.bigquery.migration.v2.ObjectNameMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectNameMapping>
      PARSER = new com.google.protobuf.AbstractParser<ObjectNameMapping>() {
    @java.lang.Override
    public ObjectNameMapping parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ObjectNameMapping(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ObjectNameMapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectNameMapping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.ObjectNameMapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

