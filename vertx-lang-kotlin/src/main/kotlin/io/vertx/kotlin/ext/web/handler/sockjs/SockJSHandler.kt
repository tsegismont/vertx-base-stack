package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.ext.web.handler.sockjs.BridgeOptions
import io.vertx.ext.web.handler.sockjs.SockJSHandler
import io.vertx.ext.web.handler.sockjs.SockJSSocket
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set a SockJS socket handler. This handler will be called with a SockJS socket whenever a SockJS connection
 * is made from a client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSHandler original] using Vert.x codegen.
 */
suspend fun SockJSHandler.socketHandlerAwait() : SockJSSocket {
  return awaitEvent{
    this.socketHandler(it)
  }
}

/**
 * Like [io.vertx.ext.web.handler.sockjs.SockJSHandler] but specifying a handler
 * that will receive bridge events.
 *
 * @param bridgeOptions options to configure the bridge with
 * @param bridgeEventHandler handler to receive bridge events
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSHandler original] using Vert.x codegen.
 */
suspend fun SockJSHandler.bridgeAwait(bridgeOptions : BridgeOptions) : BridgeEvent {
  return awaitEvent{
    this.bridge(bridgeOptions, it)
  }
}

