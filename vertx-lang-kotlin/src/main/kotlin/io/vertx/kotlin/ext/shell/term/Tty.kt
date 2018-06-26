package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.Tty
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set a stream handler on the standard input to read the data.
 *
 * @param handler the standard input
 * @returnthis object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Tty original] using Vert.x codegen.
 */
suspend fun Tty.stdinHandlerAwait() : String {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

/**
 * Set a resize handler, the handler is called when the tty size changes.
 *
 * @param handler the resize handler
 * @returnthis object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Tty original] using Vert.x codegen.
 */
suspend fun Tty.resizehandlerAwait() : Unit {
    return awaitEvent{
        this.resizehandler({ v -> it.handle(null) })}
}

