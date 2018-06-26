package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.cli.Completion
import io.vertx.ext.shell.command.CommandBuilder
import io.vertx.ext.shell.command.CommandProcess
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set the command process handler, the process handler is called when the command is executed.
 *
 * @param handler the process handler
 * @returnthis command object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandBuilder original] using Vert.x codegen.
 */
suspend fun CommandBuilder.processHandlerAwait() : CommandProcess {
    return awaitEvent{
        this.processHandler(it)
    }
}

/**
 * Set the command completion handler, the completion handler when the user asks for contextual command line
 * completion, usually hitting the <i>tab</i> key.
 *
 * @param handler the completion handler
 * @returnthis command object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandBuilder original] using Vert.x codegen.
 */
suspend fun CommandBuilder.completionHandlerAwait() : Completion {
    return awaitEvent{
        this.completionHandler(it)
    }
}

