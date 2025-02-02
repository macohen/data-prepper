/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.aggregate;

import java.util.Map;

/**
 * Implementing classes are able to be passed to the functions of {@link AggregateAction}
 * @since 1.3
 */
public interface AggregateActionInput {

    /**
     * @return An implementation of {@link GroupState}
     * @since 1.3
     */
    GroupState getGroupState();

    /**
     * @return a map of Identification keys containing identification keys and
     *         their values
     * @since 2.1
     */
    Map<Object, Object> getIdentificationKeys();
}
