package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.GoAway
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Set an handler called when a  frame is received.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.goAwayHandlerAwait() : GoAway {
  return awaitEvent{
    this.goAwayHandler(it)
  }
}

/**
 * Set an handler called when a  frame has been sent or received and all connections are closed.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.shutdownHandlerAwait() : Unit {
  return awaitEvent{
    this.shutdownHandler({ v -> it.handle(null) })}
}

/**
 * Set a close handler. The handler will get notified when the connection is closed.
 *
 * @param handler the handler to be notified
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.closeHandlerAwait() : Unit {
  return awaitEvent{
    this.closeHandler({ v -> it.handle(null) })}
}

/**
 * Send to the remote endpoint an update of this endpoint settings
 * <p/>
 * The <code>completionHandler</code> will be notified when the remote endpoint has acknowledged the settings.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param settings the new settings
 * @param completionHandler the handler notified when the settings have been acknowledged by the remote endpoint
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.updateSettingsAwait(settings : Http2Settings) : Unit {
  return awaitResult{
    this.updateSettings(settings, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set an handler that is called when remote endpoint [io.vertx.core.http.Http2Settings] are updated.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param handler the handler for remote endpoint settings
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.remoteSettingsHandlerAwait() : Http2Settings {
  return awaitEvent{
    this.remoteSettingsHandler(it)
  }
}

/**
 * Send a  frame to the remote endpoint.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param data the 8 bytes data of the frame
 * @param pongHandler an async result handler notified with pong reply or the failure
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.pingAwait(data : Buffer) : Buffer {
  return awaitResult{
    this.ping(data, it)
  }
}

/**
 * Set an handler notified when a  frame is received from the remote endpoint.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param handler the handler to be called when a  is received
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.pingHandlerAwait() : Buffer {
  return awaitEvent{
    this.pingHandler(it)
  }
}

/**
 * Set an handler called when a connection error happens
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

