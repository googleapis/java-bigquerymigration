// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2/migration_service.proto

package com.google.cloud.bigquery.migration.v2;

public interface ListMigrationSubtasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.ListMigrationSubtasksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The migration task of the subtasks to list.
   * Example: `projects/123/locations/us/workflows/1234`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The migration task of the subtasks to list.
   * Example: `projects/123/locations/us/workflows/1234`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The list of fields to be retrieved.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Optional. The list of fields to be retrieved.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Optional. The list of fields to be retrieved.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   * <pre>
   * Optional. The maximum number of migration tasks to return. The service may return
   * fewer than this number.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from previous `ListMigrationSubtasks` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListMigrationSubtasks`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from previous `ListMigrationSubtasks` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListMigrationSubtasks`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. The filter to apply. This can be used to get the subtasks of a specific
   * tasks in a workflow, e.g. `migration_task = "ab012"` where `"ab012"` is the
   * task ID (not the name in the named map).
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. The filter to apply. This can be used to get the subtasks of a specific
   * tasks in a workflow, e.g. `migration_task = "ab012"` where `"ab012"` is the
   * task ID (not the name in the named map).
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
