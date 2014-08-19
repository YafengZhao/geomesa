/*
 * Copyright 2014 Commonwealth Computer Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.locationtech.geomesa

package object plugin {

  object properties {
    val FS_DEFAULT_NAME                  = "fs.default.name"
    val JOB_TRACKER                      = "mapred.job.tracker"
    val ACCUMULO_MONITOR                 = "accumulo.monitor.address"

    def values: List[String] = {
      List(FS_DEFAULT_NAME, JOB_TRACKER, ACCUMULO_MONITOR)
    }
  }

}