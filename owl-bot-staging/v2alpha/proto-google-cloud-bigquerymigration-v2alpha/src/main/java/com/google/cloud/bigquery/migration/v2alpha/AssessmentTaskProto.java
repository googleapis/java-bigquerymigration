// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/assessment_task.proto

package com.google.cloud.bigquery.migration.v2alpha;

public final class AssessmentTaskProto {
  private AssessmentTaskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/bigquery/migration/v2alph" +
      "a/assessment_task.proto\022\'google.cloud.bi" +
      "gquery.migration.v2alpha\032\037google/api/fie" +
      "ld_behavior.proto\"\204\001\n\025AssessmentTaskDeta" +
      "ils\022\027\n\ninput_path\030\001 \001(\tB\003\340A\002\022\033\n\016output_d" +
      "ataset\030\002 \001(\tB\003\340A\002\022\033\n\016querylogs_path\030\003 \001(" +
      "\tB\003\340A\001\022\030\n\013data_source\030\004 \001(\tB\003\340A\002\"Q\n$Asse" +
      "ssmentOrchestrationResultDetails\022)\n\034outp" +
      "ut_tables_schema_version\030\001 \001(\tB\003\340A\001B\352\001\n+" +
      "com.google.cloud.bigquery.migration.v2al" +
      "phaB\023AssessmentTaskProtoP\001ZPgoogle.golan" +
      "g.org/genproto/googleapis/cloud/bigquery" +
      "/migration/v2alpha;migration\252\002\'Google.Cl" +
      "oud.BigQuery.Migration.V2Alpha\312\002\'Google\\" +
      "Cloud\\BigQuery\\Migration\\V2alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor,
        new java.lang.String[] { "InputPath", "OutputDataset", "QuerylogsPath", "DataSource", });
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentOrchestrationResultDetails_descriptor,
        new java.lang.String[] { "OutputTablesSchemaVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
