package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Watch
import io.vertx.ext.consul.WatchResult
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set the result handler. As data is changed, the handler will be called with the result.
 *
 * @param handler the result handler
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Watch original] using Vert.x codegen.
 */
suspend fun <T> Watch<T>.setHandlerAwait() : WatchResult<T> {
  return awaitEvent{
    this.setHandler(it)
  }
}

