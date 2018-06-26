package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Router
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Specify a handler for any unhandled exceptions on this router. The handler will be called for exceptions thrown
 * from handlers. This does not affect the normal failure routing logic.
 *
 * @param exceptionHandler the exception handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.Router original] using Vert.x codegen.
 */
suspend fun Router.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

