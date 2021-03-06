/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.workbench.cm.backend.server;

import java.util.function.Function;

import org.jbpm.workbench.cm.model.CaseStageSummary;
import org.kie.server.api.model.cases.CaseStage;

public class CaseStageMapper implements Function<CaseStage, CaseStageSummary> {

    @Override
    public CaseStageSummary apply(CaseStage stage) {
        if (stage == null) {
            return null;
        }

        return CaseStageSummary.builder()
                .name(stage.getName())
                .identifier(stage.getIdentifier())
                .status(stage.getStatus())
                .build();
    }

}
