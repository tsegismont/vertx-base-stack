package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpFrame
import io.vertx.core.http.HttpServerFileUpload
import io.vertx.core.http.HttpServerRequest
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpServerRequest.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

suspend fun HttpServerRequest.handlerAwait() : Buffer {
  return awaitEvent{
    this.handler(it)
  }
}

suspend fun HttpServerRequest.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

/**
 * Convenience method for receiving the entire request body in one piece.
 * <p>
 * This saves the user having to manually setting a data and end handler and append the chunks of the body until
 * the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.
 *
 * @param bodyHandler This handler will be called after all the body has been received
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerRequest original] using Vert.x codegen.
 */
suspend fun HttpServerRequest.bodyHandlerAwait() : Buffer {
  return awaitEvent{
    this.bodyHandler(it)
  }
}

/**
 * Set an upload handler. The handler will get notified once a new file upload was received to allow you to deal
 * with the file upload.
 *
 * @param uploadHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerRequest original] using Vert.x codegen.
 */
suspend fun HttpServerRequest.uploadHandlerAwait() : HttpServerFileUpload {
  return awaitEvent{
    this.uploadHandler(it)
  }
}

/**
 * Set a custom frame handler. The handler will get notified when the http stream receives an custom HTTP/2
 * frame. HTTP/2 permits extension of the protocol.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerRequest original] using Vert.x codegen.
 */
suspend fun HttpServerRequest.customFrameHandlerAwait() : HttpFrame {
  return awaitEvent{
    this.customFrameHandler(it)
  }
}

