package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set a text message handler on the connection. This handler will be called similar to the
 * , but the buffer will be converted to a String first
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocket original] using Vert.x codegen.
 */
suspend fun WebSocket.textMessageHandlerAwait() : String {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

/**
 * Set a binary message handler on the connection. This handler serves a similar purpose to [io.vertx.core.http.WebSocket]
 * except that if a message comes into the socket in multiple frames, the data from the frames will be aggregated
 * into a single buffer before calling the handler (using [io.vertx.core.http.WebSocketFrame] to find the boundaries).
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocket original] using Vert.x codegen.
 */
suspend fun WebSocket.binaryMessageHandlerAwait() : Buffer {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

/**
 * Set a pong message handler on the connection.  This handler will be invoked every time a pong message is received
 * on the server, and can be used by both clients and servers since the RFC 6455 Sections 5.5.2 and 5.5.3 do not
 * specify whether the client or server sends a ping.
 * <p>
 * Pong frames may be at most 125 bytes (octets).
 * <p>
 * There is no ping handler since pings should immediately be responded to with a pong with identical content
 * <p>
 * Pong frames may be received unsolicited.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocket original] using Vert.x codegen.
 */
suspend fun WebSocket.pongHandlerAwait() : Buffer {
    return awaitEvent{
        this.pongHandler(it)
    }
}

suspend fun WebSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun WebSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun WebSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.frameHandlerAwait() : WebSocketFrame {
    return awaitEvent{
        this.frameHandler(it)
    }
}

