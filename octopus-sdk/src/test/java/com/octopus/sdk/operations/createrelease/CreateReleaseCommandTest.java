/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.operations.createrelease;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CreateReleaseCommandModel;
import com.octopus.sdk.model.commands.CreateReleaseCommandModelBuilder;
import com.octopus.sdk.model.release.ReleaseResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.common.SpaceHomeSelector;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class CreateReleaseCommandTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final SpaceHomeSelector mockSpaceHomeSelector = mock(SpaceHomeSelector.class);

  @Test
  public void exceptionIsThrownIfAttemptToCreateWithNullClient() {
    assertThatThrownBy(() -> CreateReleaseCommand.create(null))
        .isInstanceOf(NullPointerException.class);
  }

  @Test
  public void exceptionIsThrownIfAttemptingToCreateReleaseWithNullContext() {
    final CreateReleaseCommand command =
        new CreateReleaseCommand(mockClient, mockSpaceHomeSelector);
    assertThatThrownBy(() -> command.execute(null)).isInstanceOf(NullPointerException.class);
  }

  @Test
  public void hitsReportedEndpointReceivedFromSpace() throws IOException {
    final Map<String, String> spaceHomeLinks = new HashMap<>();
    final String commandLink = "/api/createReleaseLink";
    spaceHomeLinks.put("ReleasesCreateApiReleaseCreate", commandLink);
    final CreateReleaseCommandModel model = new CreateReleaseCommandModelBuilder().build();
    final CreateReleaseCommandContext context =
        new CreateReleaseCommandContext(Optional.empty(), model);
    final ReleaseResource returnedResource = new ReleaseResource();

    final SpaceHome spaceHome = new SpaceHome(spaceHomeLinks);
    when(mockSpaceHomeSelector.getSpaceHome(context.getSpaceName())).thenReturn(spaceHome);
    when(mockClient.post(any(), eq(model), eq(ReleaseResource.class))).thenReturn(returnedResource);

    final CreateReleaseCommand command =
        new CreateReleaseCommand(mockClient, mockSpaceHomeSelector);
    final ReleaseResource resource = command.execute(context);

    assertThat(resource).isEqualTo(returnedResource);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(model), eq(ReleaseResource.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(commandLink);
  }
}
