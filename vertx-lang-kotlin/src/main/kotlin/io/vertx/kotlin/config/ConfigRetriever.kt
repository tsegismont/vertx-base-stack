package io.vertx.kotlin.config

import io.vertx.config.ConfigChange
import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Reads the configuration from the different 
 * and computes the final configuration.
 *
 * @param completionHandler handler receiving the computed configuration, or a failure if the configuration cannot be retrieved
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigRetriever original] using Vert.x codegen.
 */
suspend fun ConfigRetriever.getConfigAwait() : JsonObject {
  return awaitResult{
    this.getConfig(it)
  }
}

/**
 * Registers a listener receiving configuration changes. This method cannot only be called if
 * the configuration is broadcasted.
 *
 * @param listener the listener
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigRetriever original] using Vert.x codegen.
 */
suspend fun ConfigRetriever.listenAwait() : ConfigChange {
  return awaitEvent{
    this.listen(it)
  }
}

