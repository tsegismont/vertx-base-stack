package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Configures the heartbeat.
 *
 * @param ping ping time
 * @param pong pong time
 * @param pingHandler the ping handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerConnection original] using Vert.x codegen.
 */
suspend fun StompServerConnection.configureHeartbeatAwait(ping : Long, pong : Long) : StompServerConnection {
    return awaitEvent{
        this.configureHeartbeat(ping, pong, it)
    }
}

