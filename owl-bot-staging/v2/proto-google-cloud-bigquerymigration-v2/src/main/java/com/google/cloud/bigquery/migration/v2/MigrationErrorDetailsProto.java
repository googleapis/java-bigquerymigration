// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2/migration_error_details.proto

package com.google.cloud.bigquery.migration.v2;

public final class MigrationErrorDetailsProto {
  private MigrationErrorDetailsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/bigquery/migration/v2/mig" +
      "ration_error_details.proto\022\"google.cloud" +
      ".bigquery.migration.v2\032\037google/api/field" +
      "_behavior.proto\032\036google/rpc/error_detail" +
      "s.proto\"\262\001\n\023ResourceErrorDetail\0224\n\rresou" +
      "rce_info\030\001 \001(\0132\030.google.rpc.ResourceInfo" +
      "B\003\340A\002\022K\n\rerror_details\030\002 \003(\0132/.google.cl" +
      "oud.bigquery.migration.v2.ErrorDetailB\003\340" +
      "A\002\022\030\n\013error_count\030\003 \001(\005B\003\340A\002\"\207\001\n\013ErrorDe" +
      "tail\022H\n\010location\030\001 \001(\01321.google.cloud.bi" +
      "gquery.migration.v2.ErrorLocationB\003\340A\001\022." +
      "\n\nerror_info\030\002 \001(\0132\025.google.rpc.ErrorInf" +
      "oB\003\340A\002\"7\n\rErrorLocation\022\021\n\004line\030\001 \001(\005B\003\340" +
      "A\001\022\023\n\006column\030\002 \001(\005B\003\340A\001B\335\001\n&com.google.c" +
      "loud.bigquery.migration.v2B\032MigrationErr" +
      "orDetailsProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/cloud/bigquery/migration" +
      "/v2;migration\252\002\"Google.Cloud.BigQuery.Mi" +
      "gration.V2\312\002\"Google\\Cloud\\BigQuery\\Migra" +
      "tion\\V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.ErrorDetailsProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2_ResourceErrorDetail_descriptor,
        new java.lang.String[] { "ResourceInfo", "ErrorDetails", "ErrorCount", });
    internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2_ErrorDetail_descriptor,
        new java.lang.String[] { "Location", "ErrorInfo", });
    internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2_ErrorLocation_descriptor,
        new java.lang.String[] { "Line", "Column", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.ErrorDetailsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
