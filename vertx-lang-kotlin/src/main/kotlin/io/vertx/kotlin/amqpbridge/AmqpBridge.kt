package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Starts the bridge, establishing the underlying connection.
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @param username the username
 * @param password the password
 * @param resultHandler the result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqpbridge.AmqpBridge original] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname : String, port : Int, username : String, password : String) : AmqpBridge {
  return awaitResult{
    this.start(hostname, port, username, password, it)
  }
}

/**
 * Starts the bridge, establishing the underlying connection.
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @param resultHandler the result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqpbridge.AmqpBridge original] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname : String, port : Int) : AmqpBridge {
  return awaitResult{
    this.start(hostname, port, it)
  }
}

/**
 * Shuts the bridge down, closing the underlying connection.
 *
 * @param resultHandler the result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqpbridge.AmqpBridge original] using Vert.x codegen.
 */
suspend fun AmqpBridge.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set an end handler. This will fire if the underlying connection is unexpectedly disconnected or remotely closed.
 *
 * @param endHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqpbridge.AmqpBridge original] using Vert.x codegen.
 */
suspend fun AmqpBridge.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

