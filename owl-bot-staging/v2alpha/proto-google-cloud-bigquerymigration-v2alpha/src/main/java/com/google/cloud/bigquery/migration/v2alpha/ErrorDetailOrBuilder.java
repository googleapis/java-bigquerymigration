// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_error_details.proto

package com.google.cloud.bigquery.migration.v2alpha;

public interface ErrorDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.ErrorDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The location.
   */
  com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getLocation();
  /**
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the errorInfo field is set.
   */
  boolean hasErrorInfo();
  /**
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The errorInfo.
   */
  com.google.rpc.ErrorInfo getErrorInfo();
  /**
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.rpc.ErrorInfoOrBuilder getErrorInfoOrBuilder();
}