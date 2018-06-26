package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun NetSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun NetSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun NetSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun NetSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String) : Unit {
    return awaitResult{
        this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param offset offset
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String, offset : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param offset offset
 * @param length length
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set a handler that will be called when the NetSocket is closed
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

/**
 * Upgrade channel to use SSL/TLS. Be aware that for this to work SSL must be configured.
 *
 * @param handler the handler will be notified when it's upgraded
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.upgradeToSslAwait() : Unit {
    return awaitEvent{
        this.upgradeToSsl({ v -> it.handle(null) })}
}

/**
 * Upgrade channel to use SSL/TLS. Be aware that for this to work SSL must be configured.
 *
 * @param serverName the server name
 * @param handler the handler will be notified when it's upgraded
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.upgradeToSslAwait(serverName : String) : Unit {
    return awaitEvent{
        this.upgradeToSsl(serverName, { v -> it.handle(null) })}
}

