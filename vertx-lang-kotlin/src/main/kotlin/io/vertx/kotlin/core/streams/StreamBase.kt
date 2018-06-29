package io.vertx.kotlin.core.streams

import io.vertx.core.streams.StreamBase
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an exception handler.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.StreamBase original] using Vert.x codegen.
 */
suspend fun StreamBase.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

