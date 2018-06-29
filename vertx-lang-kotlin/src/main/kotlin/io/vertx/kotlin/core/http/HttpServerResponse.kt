package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HttpServerResponse.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

suspend fun HttpServerResponse.drainHandlerAwait() : Unit {
  return awaitEvent{
    this.drainHandler({ v -> it.handle(null) })}
}

/**
 * Set a close handler for the response, this is called when the underlying connection is closed and the response
 * was still using the connection.
 * <p>
 * For HTTP/1.x it is called when the connection is closed before <code>end()</code> is called, therefore it is not
 * guaranteed to be called.
 * <p>
 * For HTTP/2 it is called when the related stream is closed, and therefore it will be always be called.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.closeHandlerAwait() : Unit {
  return awaitEvent{
    this.closeHandler({ v -> it.handle(null) })}
}

/**
 * Set an end handler for the response. This will be called when the response is disposed to allow consistent cleanup
 * of the response.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been completely
 * written to the wire.
 *
 * @param filename path to the file to serve
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String) : Unit {
  return awaitResult{
    this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been completely
 * written to the wire.
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been
 * completely written to the wire.
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param length the length to serve to
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Provide a handler that will be called just before the headers are written to the wire.<p>
 * This provides a hook allowing you to add any more headers or do any more operations before this occurs.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.headersEndHandlerAwait() : Unit {
  return awaitEvent{
    this.headersEndHandler({ v -> it.handle(null) })}
}

/**
 * Provides a handler that will be called after the last part of the body is written to the wire.
 * The handler is called asynchronously of when the response has been received by the client.
 * This provides a hook allowing you to do more operations once the request has been sent over the wire
 * such as resource cleanup.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.bodyEndHandlerAwait() : Unit {
  return awaitEvent{
    this.bodyEndHandler({ v -> it.handle(null) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] with the host copied from the current request.
 *
 * @param method 
 * @param path 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, path : String) : HttpServerResponse {
  return awaitResult{
    this.push(method, path, it)
  }
}

/**
 * Push a response to the client.<p/>
 *
 * The <code>handler</code> will be notified with a <i>success</i> when the push can be sent and with
 * a <i>failure</i> when the client has disabled push or reset the push before it has been sent.<p/>
 *
 * The <code>handler</code> may be queued if the client has reduced the maximum number of streams the server can push
 * concurrently.<p/>
 *
 * Push can be sent only for peer initiated streams and if the response is not ended.
 *
 * @param method the method of the promised request
 * @param host the host of the promised request
 * @param path the path of the promised request
 * @param headers the headers of the promised request
 * @param handler the handler notified when the response can be written
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, host : String, path : String, headers : MultiMap) : HttpServerResponse {
  return awaitResult{
    this.push(method, host, path, headers, it)
  }
}

