// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_error_details.proto

package com.google.cloud.bigquery.migration.v2alpha;

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
    internal_static_google_cloud_bigquery_migration_v2alpha_ResourceErrorDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_ResourceErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/bigquery/migration/v2alph" +
      "a/migration_error_details.proto\022\'google." +
      "cloud.bigquery.migration.v2alpha\032\037google" +
      "/api/field_behavior.proto\032\036google/rpc/er" +
      "ror_details.proto\"\267\001\n\023ResourceErrorDetai" +
      "l\0224\n\rresource_info\030\001 \001(\0132\030.google.rpc.Re" +
      "sourceInfoB\003\340A\002\022P\n\rerror_details\030\002 \003(\01324" +
      ".google.cloud.bigquery.migration.v2alpha" +
      ".ErrorDetailB\003\340A\002\022\030\n\013error_count\030\003 \001(\005B\003" +
      "\340A\002\"\214\001\n\013ErrorDetail\022M\n\010location\030\001 \001(\01326." +
      "google.cloud.bigquery.migration.v2alpha." +
      "ErrorLocationB\003\340A\001\022.\n\nerror_info\030\002 \001(\0132\025" +
      ".google.rpc.ErrorInfoB\003\340A\002\"7\n\rErrorLocat" +
      "ion\022\021\n\004line\030\001 \001(\005B\003\340A\001\022\023\n\006column\030\002 \001(\005B\003" +
      "\340A\001B\352\001\n+com.google.cloud.bigquery.migrat" +
      "ion.v2alphaB\032MigrationErrorDetailsProtoP" +
      "\001ZIcloud.google.com/go/bigquery/migratio" +
      "n/apiv2alpha/migrationpb;migrationpb\252\002\'G" +
      "oogle.Cloud.BigQuery.Migration.V2Alpha\312\002" +
      "\'Google\\Cloud\\BigQuery\\Migration\\V2alpha" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.ErrorDetailsProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_migration_v2alpha_ResourceErrorDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_ResourceErrorDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2alpha_ResourceErrorDetail_descriptor,
        new java.lang.String[] { "ResourceInfo", "ErrorDetails", "ErrorCount", });
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor,
        new java.lang.String[] { "Location", "ErrorInfo", });
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor,
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
