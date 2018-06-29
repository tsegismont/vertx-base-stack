package io.vertx.kotlin.core.streams

import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an exception handler on the read stream.
 *
 * @param handler the exception handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.ReadStream original] using Vert.x codegen.
 */
suspend fun <T> ReadStream<T>.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

/**
 * Set a data handler. As data is read, the handler will be called with the data.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.ReadStream original] using Vert.x codegen.
 */
suspend fun <T> ReadStream<T>.handlerAwait() : T {
  return awaitEvent{
    this.handler(it)
  }
}

/**
 * Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.
 *
 * @param endHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.ReadStream original] using Vert.x codegen.
 */
suspend fun <T> ReadStream<T>.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

