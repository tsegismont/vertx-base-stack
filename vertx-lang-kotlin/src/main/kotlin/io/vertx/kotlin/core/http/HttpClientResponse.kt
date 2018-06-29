package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpFrame
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpClientResponse.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

suspend fun HttpClientResponse.handlerAwait() : Buffer {
  return awaitEvent{
    this.handler(it)
  }
}

suspend fun HttpClientResponse.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

/**
 * Convenience method for receiving the entire request body in one piece.
 * <p>
 * This saves you having to manually set a dataHandler and an endHandler and append the chunks of the body until
 * the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.
 *
 * @param bodyHandler This handler will be called after all the body has been received
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientResponse original] using Vert.x codegen.
 */
suspend fun HttpClientResponse.bodyHandlerAwait() : Buffer {
  return awaitEvent{
    this.bodyHandler(it)
  }
}

/**
 * Set an custom frame handler. The handler will get notified when the http stream receives an custom HTTP/2
 * frame. HTTP/2 permits extension of the protocol.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientResponse original] using Vert.x codegen.
 */
suspend fun HttpClientResponse.customFrameHandlerAwait() : HttpFrame {
  return awaitEvent{
    this.customFrameHandler(it)
  }
}

