package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLRowStream.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun SQLRowStream.handlerAwait() : JsonArray {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun SQLRowStream.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

/**
 * Event handler when a resultset is closed. This is useful to request for more results.
 *
 * @param handler called when the current result set is closed
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLRowStream original] using Vert.x codegen.
 */
suspend fun SQLRowStream.resultSetClosedHandlerAwait() : Unit {
    return awaitEvent{
        this.resultSetClosedHandler({ v -> it.handle(null) })}
}

/**
 * Closes the stream/underlying cursor(s). The actual close happens asynchronously.
 *
 * @param handler called when the stream/underlying cursor(s) is(are) closed
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLRowStream original] using Vert.x codegen.
 */
suspend fun SQLRowStream.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

