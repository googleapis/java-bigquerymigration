// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_service.proto

package com.google.cloud.bigquery.migration.v2alpha;

public interface ListMigrationSubtasksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> 
      getMigrationSubtasksList();
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask getMigrationSubtasks(int index);
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  int getMigrationSubtasksCount();
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder> 
      getMigrationSubtasksOrBuilderList();
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder getMigrationSubtasksOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}