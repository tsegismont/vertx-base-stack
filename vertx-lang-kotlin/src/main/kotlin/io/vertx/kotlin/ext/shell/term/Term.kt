package io.vertx.kotlin.ext.shell.term

import io.vertx.core.Handler
import io.vertx.ext.shell.cli.Completion
import io.vertx.ext.shell.term.Term
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Term.resizehandlerAwait() : Unit {
    return awaitEvent{
        this.resizehandler({ v -> it.handle(null) })}
}

suspend fun Term.stdinHandlerAwait() : String {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

/**
 * Prompt the user a line of text.
 *
 * @param prompt the displayed prompt
 * @param lineHandler the line handler called with the line
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Term original] using Vert.x codegen.
 */
suspend fun Term.readlineAwait(prompt : String) : String {
    return awaitEvent{
        this.readline(prompt, it)
    }
}

/**
 * Prompt the user a line of text, providing a completion handler to handle user's completion.
 *
 * @param prompt the displayed prompt
 * @param lineHandler the line handler called with the line
 * @param completionHandler the completion handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Term original] using Vert.x codegen.
 */
suspend fun Term.readlineAwait(prompt : String, lineHandler : Handler<String>) : Completion {
    return awaitEvent{
        this.readline(prompt, lineHandler, it)
    }
}

/**
 * Set a handler that will be called when the terminal is closed.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Term original] using Vert.x codegen.
 */
suspend fun Term.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

