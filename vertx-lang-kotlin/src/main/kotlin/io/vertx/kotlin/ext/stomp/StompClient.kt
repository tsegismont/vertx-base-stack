package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connects to the server.
 *
 * @param port the server port
 * @param host the server host
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port : Int, host : String) : StompClientConnection {
    return awaitResult{
        this.connect(port, host, it)
    }
}

/**
 * Connects to the server.
 *
 * @param net the NET client to use
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(net : NetClient) : StompClientConnection {
    return awaitResult{
        this.connect(net, it)
    }
}

/**
 * Connects to the server.
 *
 * @param port the server port
 * @param host the server host
 * @param net the NET client to use
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port : Int, host : String, net : NetClient) : StompClientConnection {
    return awaitResult{
        this.connect(port, host, net, it)
    }
}

/**
 * Connects to the server using the host and port configured in the client's options.
 *
 * @param resultHandler handler called with the connection result. A failure will be sent to the handler if a TCP level issue happen before the `CONNECTED` frame is received. Afterwards, the [io.vertx.ext.stomp.StompClient] is called.
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait() : StompClientConnection {
    return awaitResult{
        this.connect(it)
    }
}

/**
 * Configures a received handler that gets notified when a STOMP frame is received by the client.
 * This handler can be used for logging, debugging or ad-hoc behavior. The frame can still be modified at the time.
 * <p>
 * When a connection is created, the handler is used as
 * [io.vertx.ext.stomp.StompClientConnection].
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.receivedFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.receivedFrameHandler(it)
    }
}

/**
 * Configures a writing handler that gets notified when a STOMP frame is written on the wire.
 * This handler can be used for logging, debugging or ad-hoc behavior. The frame can still be modified at the time.
 * <p>
 * When a connection is created, the handler is used as
 * [io.vertx.ext.stomp.StompClientConnection].
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.writingFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.writingFrameHandler(it)
    }
}

/**
 * A general error frame handler. It can be used to catch <code>ERROR</code> frame emitted during the connection process
 * (wrong authentication). This error handler will be pass to all [io.vertx.ext.stomp.StompClientConnection] created from this
 * client. Obviously, the client can override it when the connection is established.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.errorFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.errorFrameHandler(it)
    }
}

/**
 * Sets an exception handler notified for TCP-level errors.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

