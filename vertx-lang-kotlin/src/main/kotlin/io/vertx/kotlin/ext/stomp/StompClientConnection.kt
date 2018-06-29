package io.vertx.kotlin.ext.stomp

import io.vertx.core.buffer.Buffer
import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Sends a <code>SEND</code> frame to the server.
 *
 * @param headers the headers, must not be <code>null</code>
 * @param body the body, may be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the sent frame has been received. The handler receives the sent frame.
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.sendAwait(headers : Map<String,String>, body : Buffer) : Frame {
  return awaitEvent{
    this.send(headers, body, it)
  }
}

/**
 * Sends a <code>SEND</code> frame to the server to the given destination. The message does not have any other header.
 *
 * @param destination the destination, must not be <code>null</code>
 * @param body the body, may be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the sent frame has been received. The handler receives the sent frame.
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.sendAwait(destination : String, body : Buffer) : Frame {
  return awaitEvent{
    this.send(destination, body, it)
  }
}

/**
 * Sends the given frame to the server.
 *
 * @param frame the frame
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the sent frame has been received. The handler receives the sent frame.
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.sendAwait(frame : Frame) : Frame {
  return awaitEvent{
    this.send(frame, it)
  }
}

/**
 * Sends a <code>SEND</code> frame to the server to the given destination.
 *
 * @param destination the destination, must not be <code>null</code>
 * @param headers the header. The <code>destination</code> header is replaced by the value given to the <code>destination</code> parameter
 * @param body the body, may be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the sent frame has been received. The handler receives the sent frame.
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.sendAwait(destination : String, headers : Map<String,String>, body : Buffer) : Frame {
  return awaitEvent{
    this.send(destination, headers, body, it)
  }
}

/**
 * Un-subscribes from the given destination. This method only works if the subscription did not specifies a
 * subscription id (using the <code>id</code> header).
 *
 * @param destination the destination
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the un-subscription has been received. The handler receives the sent frame (<code>UNSUBSCRIBE</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.unsubscribeAwait(destination : String) : Frame {
  return awaitEvent{
    this.unsubscribe(destination, it)
  }
}

/**
 * Un-subscribes from the given destination. This method computes the subscription id as follows. If the given
 * headers contains the <code>id</code> header, the header value is used. Otherwise the destination is used.
 *
 * @param destination the destination
 * @param headers the headers
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the un-subscription has been received. The handler receives the sent frame (<code>UNSUBSCRIBE</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.unsubscribeAwait(destination : String, headers : Map<String,String>) : Frame {
  return awaitEvent{
    this.unsubscribe(destination, headers, it)
  }
}

/**
 * Sets a handler notified when an <code>ERROR</code> frame is received by the client. The handler receives the <code>ERROR</code> frame and a reference on the [io.vertx.ext.stomp.StompClientConnection].
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.errorHandlerAwait() : Frame {
  return awaitEvent{
    this.errorHandler(it)
  }
}

/**
 * Sets a handler notified when the STOMP connection is closed.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.closeHandlerAwait() : StompClientConnection {
  return awaitEvent{
    this.closeHandler(it)
  }
}

/**
 * Sets a handler notified when the server does not respond to a <code>ping</code> request in time. In other
 * words, this handler is invoked when the heartbeat has detected a connection failure with the server.
 * The handler can decide to reconnect to the server.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] receiving the dropped connection. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.connectionDroppedHandlerAwait() : StompClientConnection {
  return awaitEvent{
    this.connectionDroppedHandler(it)
  }
}

/**
 * Sets a handler that let customize the behavior when a ping needs to be sent to the server. Be aware that
 * changing the default behavior may break the compliance with the STOMP specification.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.pingHandlerAwait() : StompClientConnection {
  return awaitEvent{
    this.pingHandler(it)
  }
}

/**
 * Begins a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction begin has been processed by the server. The handler receives the sent frame (<code>BEGIN</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.beginTXAwait(id : String) : Frame {
  return awaitEvent{
    this.beginTX(id, it)
  }
}

/**
 * Begins a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction begin has been processed by the server. The handler receives the sent frame (<code>BEGIN</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.beginTXAwait(id : String, headers : Map<String,String>) : Frame {
  return awaitEvent{
    this.beginTX(id, headers, it)
  }
}

/**
 * Commits a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction commit has been processed by the server. The handler receives the sent frame (<code>COMMIT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.commitAwait(id : String) : Frame {
  return awaitEvent{
    this.commit(id, it)
  }
}

/**
 * Commits a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction commit has been processed by the server. The handler receives the sent frame (<code>COMMIT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.commitAwait(id : String, headers : Map<String,String>) : Frame {
  return awaitEvent{
    this.commit(id, headers, it)
  }
}

/**
 * Aborts a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction cancellation has been processed by the server. The handler receives the sent frame (<code>ABORT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.abortAwait(id : String) : Frame {
  return awaitEvent{
    this.abort(id, it)
  }
}

/**
 * Aborts a transaction.
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the transaction cancellation has been processed by the server. The handler receives the sent frame (<code>ABORT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.abortAwait(id : String, headers : Map<String,String>) : Frame {
  return awaitEvent{
    this.abort(id, headers, it)
  }
}

/**
 * Disconnects the client. Unlike the [io.vertx.ext.stomp.StompClientConnection] method, this method send the <code>DISCONNECT</code> frame to the
 * server.
 *
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the disconnection has been processed by the server. The handler receives the sent frame (<code>DISCONNECT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.disconnectAwait() : Frame {
  return awaitEvent{
    this.disconnect(it)
  }
}

/**
 * Disconnects the client. Unlike the [io.vertx.ext.stomp.StompClientConnection] method, this method send the <code>DISCONNECT</code> frame to the
 * server. This method lets you customize the <code>DISCONNECT</code> frame.
 *
 * @param frame the <code>DISCONNECT</code> frame.
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the disconnection has been processed by the server. The handler receives the sent frame (<code>DISCONNECT</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.disconnectAwait(frame : Frame) : Frame {
  return awaitEvent{
    this.disconnect(frame, it)
  }
}

/**
 * Sends an acknowledgement for a specific message. It means that the message has been handled and processed by the
 * client. The <code>id</code> parameter is the message id received in the frame.
 *
 * @param id the message id of the message to acknowledge
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the acknowledgment has been processed by the server. The handler receives the sent frame (<code>ACK</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.ackAwait(id : String) : Frame {
  return awaitEvent{
    this.ack(id, it)
  }
}

/**
 * Sends a non-acknowledgement for the given message. It means that the message has not been handled by the client.
 * The <code>id</code> parameter is the message id received in the frame.
 *
 * @param id the message id of the message to acknowledge
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the non-acknowledgment has been processed by the server. The handler receives the sent frame (<code>NACK</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.nackAwait(id : String) : Frame {
  return awaitEvent{
    this.nack(id, it)
  }
}

/**
 * Sends an acknowledgement for the given frame. It means that the frame has been handled and processed by the
 * client. The sent acknowledgement is part of the transaction identified by the given id.
 *
 * @param id the message id of the message to acknowledge
 * @param txId the transaction id
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the acknowledgment has been processed by the server. The handler receives the sent frame (<code>ACK</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.ackAwait(id : String, txId : String) : Frame {
  return awaitEvent{
    this.ack(id, txId, it)
  }
}

/**
 * Sends a non-acknowledgement for the given frame. It means that the frame has not been handled by the client.
 * The sent non-acknowledgement is part of the transaction identified by the given id.
 *
 * @param id the message id of the message to acknowledge
 * @param txId the transaction id
 * @param receiptHandler the handler invoked when the <code>RECEIPT</code> frame associated with the non-acknowledgment has been processed by the server. The handler receives the sent frame (<code>NACK</code>).
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.nackAwait(id : String, txId : String) : Frame {
  return awaitEvent{
    this.nack(id, txId, it)
  }
}

/**
 * Configures a received handler that get notified when a STOMP frame is received by the client.
 * This handler can be used for logging, debugging or ad-hoc behavior. The frame can still be modified by the handler.
 * <p>
 * Unlike [io.vertx.ext.stomp.StompClient], the given handler won't receive the <code>CONNECTED</code> frame. If a received frame handler is set on the [io.vertx.ext.stomp.StompClient], it will be used by all
 * clients connection, so calling this method is useless, except if you want to use a different handler.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.receivedFrameHandlerAwait() : Frame {
  return awaitEvent{
    this.receivedFrameHandler(it)
  }
}

/**
 * Configures a handler notified when a frame is going to be written on the wire. This handler can be used from
 * logging, debugging. The handler can modify the received frame.
 * <p>
 * If a writing frame handler is set on the [io.vertx.ext.stomp.StompClient], it will be used by all
 * clients connection, so calling this method is useless, except if you want to use a different handler.
 *
 * @param handler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.writingFrameHandlerAwait() : Frame {
  return awaitEvent{
    this.writingFrameHandler(it)
  }
}

/**
 * Configures the exception handler notified upon TCP-level errors.
 *
 * @param exceptionHandler the handler
 * @returnthe current [io.vertx.ext.stomp.StompClientConnection] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClientConnection original] using Vert.x codegen.
 */
suspend fun StompClientConnection.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

