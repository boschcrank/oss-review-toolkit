/*
 * Copyright (C) 2017-2018 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package com.here.ort.helper.commands

import com.here.ort.model.config.RepositoryConfiguration
import com.here.ort.model.yamlMapper

import java.io.File

/**
 * Serialize a [RepositoryConfiguration] as YAML to the given target [File].
 */
fun RepositoryConfiguration.prettyPrintAsYaml(targetFile: File) {
    // TODO: make the output nicer and consider conforming with yamllint.
    // The use of backslashes for multi-line strings maybe can be improved as well.

    yamlMapper.writeValue(targetFile, this)
}
