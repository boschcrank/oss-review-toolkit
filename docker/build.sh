#!/bin/sh
#
# Copyright (C) 2019 Bosch Software Innovations GmbH
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
# License-Filename: LICENSE

# Get the absolute directory this script resides in.
SCRIPT_DIR="$(cd "$(dirname $0)" && pwd)"

# Get the absolute directory of the project root.
PROJECT_DIR="$(cd "$SCRIPT_DIR/.." && pwd)"

. $SCRIPT_DIR/lib

echo "Building ORT..."

buildWithoutContext $PROJECT_DIR/docker/build/Dockerfile ort-build:latest && \
    runGradleWrapper ort-build :cli:installDist :cli:distTar
