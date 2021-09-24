/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.migration.v2alpha.stub;

import static com.google.cloud.bigquery.migration.v2alpha.MigrationServiceClient.ListMigrationSubtasksPagedResponse;
import static com.google.cloud.bigquery.migration.v2alpha.MigrationServiceClient.ListMigrationWorkflowsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest;
import com.google.cloud.bigquery.migration.v2alpha.DeleteMigrationWorkflowRequest;
import com.google.cloud.bigquery.migration.v2alpha.GetMigrationSubtaskRequest;
import com.google.cloud.bigquery.migration.v2alpha.GetMigrationWorkflowRequest;
import com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksRequest;
import com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse;
import com.google.cloud.bigquery.migration.v2alpha.ListMigrationWorkflowsRequest;
import com.google.cloud.bigquery.migration.v2alpha.ListMigrationWorkflowsResponse;
import com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask;
import com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow;
import com.google.cloud.bigquery.migration.v2alpha.StartMigrationWorkflowRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the MigrationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class MigrationServiceStub implements BackgroundResource {

  public UnaryCallable<CreateMigrationWorkflowRequest, MigrationWorkflow>
      createMigrationWorkflowCallable() {
    throw new UnsupportedOperationException("Not implemented: createMigrationWorkflowCallable()");
  }

  public UnaryCallable<GetMigrationWorkflowRequest, MigrationWorkflow>
      getMigrationWorkflowCallable() {
    throw new UnsupportedOperationException("Not implemented: getMigrationWorkflowCallable()");
  }

  public UnaryCallable<ListMigrationWorkflowsRequest, ListMigrationWorkflowsPagedResponse>
      listMigrationWorkflowsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listMigrationWorkflowsPagedCallable()");
  }

  public UnaryCallable<ListMigrationWorkflowsRequest, ListMigrationWorkflowsResponse>
      listMigrationWorkflowsCallable() {
    throw new UnsupportedOperationException("Not implemented: listMigrationWorkflowsCallable()");
  }

  public UnaryCallable<DeleteMigrationWorkflowRequest, Empty> deleteMigrationWorkflowCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteMigrationWorkflowCallable()");
  }

  public UnaryCallable<StartMigrationWorkflowRequest, Empty> startMigrationWorkflowCallable() {
    throw new UnsupportedOperationException("Not implemented: startMigrationWorkflowCallable()");
  }

  public UnaryCallable<GetMigrationSubtaskRequest, MigrationSubtask> getMigrationSubtaskCallable() {
    throw new UnsupportedOperationException("Not implemented: getMigrationSubtaskCallable()");
  }

  public UnaryCallable<ListMigrationSubtasksRequest, ListMigrationSubtasksPagedResponse>
      listMigrationSubtasksPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listMigrationSubtasksPagedCallable()");
  }

  public UnaryCallable<ListMigrationSubtasksRequest, ListMigrationSubtasksResponse>
      listMigrationSubtasksCallable() {
    throw new UnsupportedOperationException("Not implemented: listMigrationSubtasksCallable()");
  }

  @Override
  public abstract void close();
}
