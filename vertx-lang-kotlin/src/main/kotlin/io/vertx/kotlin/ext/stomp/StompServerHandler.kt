package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.Acknowledgement
import io.vertx.ext.stomp.ServerFrame
import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Configures a handler that get notified when a STOMP frame is received by the server.
 * This handler can be used for logging, debugging or ad-hoc behavior.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.receivedFrameHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.receivedFrameHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>CONNECT</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.connectHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.connectHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>STOMP</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.stompHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.stompHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>SUBSCRIBE</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.subscribeHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.subscribeHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>UNSUBSCRIBE</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.unsubscribeHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.unsubscribeHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>SEND</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.sendHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.sendHandler(it)
    }
}

/**
 * Configures the action to execute when a connection with the client is closed.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.closeHandlerAwait() : StompServerConnection {
    return awaitEvent{
        this.closeHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>COMMIT</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.commitHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.commitHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>ABORT</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.abortHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.abortHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>BEGIN</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.beginHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.beginHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>DISCONNECT</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.disconnectHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.disconnectHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>ACK</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.ackHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.ackHandler(it)
    }
}

/**
 * Configures the action to execute when a <code>NACK</code> frame is received.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.nackHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.nackHandler(it)
    }
}

/**
 * Called when the client connects to a server requiring authentication. It invokes the  configured
 * using [io.vertx.ext.stomp.StompServerHandler].
 *
 * @param connection server connection that contains session ID
 * @param login the login
 * @param passcode the password
 * @param handler handler receiving the authentication result
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.onAuthenticationRequestAwait(connection : StompServerConnection, login : String, passcode : String) : Boolean {
    return awaitResult{
        this.onAuthenticationRequest(connection, login, passcode, it)
    }
}

/**
 * Configures the action to execute when messages are acknowledged.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.onAckHandlerAwait() : Acknowledgement {
    return awaitEvent{
        this.onAckHandler(it)
    }
}

/**
 * Configures the action to execute when messages are <strong>not</strong> acknowledged.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.onNackHandlerAwait() : Acknowledgement {
    return awaitEvent{
        this.onNackHandler(it)
    }
}

/**
 * Allows customizing the action to do when the server needs to send a `PING` to the client. By default it send a
 * frame containing <code>EOL</code> (specification). However, you can customize this and send another frame. However,
 * be aware that this may requires a custom client.
 * <p/>
 * The handler will only be called if the connection supports heartbeats.
 *
 * @param handler the action to execute when a `PING` needs to be sent.
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.pingHandlerAwait() : StompServerConnection {
    return awaitEvent{
        this.pingHandler(it)
    }
}

