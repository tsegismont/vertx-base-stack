package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpConnection
import io.vertx.core.http.HttpVersion
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpClientRequest.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

suspend fun HttpClientRequest.drainHandlerAwait() : Unit {
  return awaitEvent{
    this.drainHandler({ v -> it.handle(null) })}
}

suspend fun HttpClientRequest.handlerAwait() : HttpClientResponse {
  return awaitEvent{
    this.handler(it)
  }
}

suspend fun HttpClientRequest.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

/**
 * If you send an HTTP request with the header <code>Expect</code> set to the value <code>100-continue</code>
 * and the server responds with an interim HTTP response with a status code of <code>100</code> and a continue handler
 * has been set using this method, then the <code>handler</code> will be called.
 * <p>
 * You can then continue to write data to the request body and later end it. This is normally used in conjunction with
 * the [io.vertx.core.http.HttpClientRequest] method to force the request header to be written before the request has ended.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientRequest original] using Vert.x codegen.
 */
suspend fun HttpClientRequest.continueHandlerAwait() : Unit {
  return awaitEvent{
    this.continueHandler({ v -> it.handle(null) })}
}

/**
 * Like [io.vertx.core.http.HttpClientRequest] but with an handler after headers have been sent. The handler will be called with
 * the [io.vertx.core.http.HttpVersion] if it can be determined or null otherwise.<p>
 *
 * @param completionHandler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientRequest original] using Vert.x codegen.
 */
suspend fun HttpClientRequest.sendHeadAwait() : HttpVersion {
  return awaitEvent{
    this.sendHead(it)
  }
}

/**
 * Set a push handler for this request.<p/>
 *
 * The handler is called when the client receives a <i>push promise</i> from the server. The handler can be called
 * multiple times, for each push promise.<p/>
 *
 * The handler is called with a <i>read-only</i> [io.vertx.core.http.HttpClientRequest], the following methods can be called:<p/>
 *
 * <ul>
 *   <li>[io.vertx.core.http.HttpClientRequest]</li>
 *   <li>[io.vertx.core.http.HttpClientRequest]</li>
 *   <li>[io.vertx.core.http.HttpClientRequest]</li>
 *   <li>[io.vertx.core.http.HttpClientRequest]</li>
 * </ul>
 *
 * In addition the handler should call the [io.vertx.core.http.HttpClientRequest] method to set an handler to
 * process the response.<p/>
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientRequest original] using Vert.x codegen.
 */
suspend fun HttpClientRequest.pushHandlerAwait() : HttpClientRequest {
  return awaitEvent{
    this.pushHandler(it)
  }
}

/**
 * Set a connection handler called when an HTTP connection has been established.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClientRequest original] using Vert.x codegen.
 */
suspend fun HttpClientRequest.connectionHandlerAwait() : HttpConnection {
  return awaitEvent{
    this.connectionHandler(it)
  }
}

