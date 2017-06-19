/*
 * Copyright (C) 2017 Jeff Carpenter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cassandraguide.services.reservation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfiguration {

    // Property supports comma-separated list of IP addresses
    @Value("#{'${com.cassandraguide.services.reservation.CASSANDRA_NODES}'.split(',')}")
    private String[] cassandraNodes;

    // TODO: No action required, just note declaration of new property
    @Value("${com.cassandraguide.services.reservation.DEFAULT_CONSISTENCY_LEVEL}")
    private String defaultConsistencyLevel;

    public String[] getCassandraNodes() {
        return cassandraNodes;
    }

    public String getDefaultConsistencyLevel() {
        return defaultConsistencyLevel;
    }
}