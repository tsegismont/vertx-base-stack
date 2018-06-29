package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.Pty
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set the standard out handler of the pseudo terminal.
 *
 * @param handler the standard output
 * @returnthis current object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.Pty original] using Vert.x codegen.
 */
suspend fun Pty.stdoutHandlerAwait() : String {
  return awaitEvent{
    this.stdoutHandler(it)
  }
}

