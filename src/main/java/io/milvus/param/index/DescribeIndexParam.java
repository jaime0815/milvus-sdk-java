/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.milvus.param.index;

import io.milvus.exception.ParamException;
import io.milvus.param.Constant;
import io.milvus.param.ParamUtils;

import lombok.Getter;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

/**
 * Parameters for <code>describeIndex</code> interface.
 */
@Getter
public class DescribeIndexParam {
    private final String collectionName;
    private final String indexName;

    private DescribeIndexParam(@NonNull Builder builder) {
        this.collectionName = builder.collectionName;
        this.indexName = builder.indexName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder for {@link DescribeIndexParam} class.
     */
    public static final class Builder {
        private String collectionName;
        private String indexName = "";

        private Builder() {
        }

        /**
         * Sets the collection name. Collection name cannot be empty or null.
         *
         * @param collectionName collection name
         * @return <code>Builder</code>
         */
        public Builder withCollectionName(@NonNull String collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        /**
         * Sets the target index name. Index name can be empty or null.
         * If no index name is specified, then return all this collection indexes.
         * @param indexName field name
         * @return <code>Builder</code>
         */
        public Builder withIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * Verifies parameters and creates a new {@link DescribeIndexParam} instance.
         *
         * @return {@link DescribeIndexParam}
         */
        public DescribeIndexParam build() throws ParamException {
            ParamUtils.CheckNullEmptyString(collectionName, "Collection name");

            // if indexName is empty, describeIndex will return all indexes information

            return new DescribeIndexParam(this);
        }
    }

    /**
     * Constructs a <code>String</code> by {@link DescribeIndexParam} instance.
     *
     * @return <code>String</code>
     */
    @Override
    public String toString() {
        return "DescribeIndexParam{" +
                "collectionName='" + collectionName + '\'' +
                ", indexName='" + indexName + '\'' +
                '}';
    }
}
