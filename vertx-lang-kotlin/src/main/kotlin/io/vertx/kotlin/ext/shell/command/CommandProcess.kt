package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.CommandProcess
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun CommandProcess.stdinHandlerAwait() : String {
  return awaitEvent{
    this.stdinHandler(it)
  }
}

/**
 * Set an interrupt handler, this handler is called when the command is interrupted, for instance user
 * press <code>Ctrl-C</code>.
 *
 * @param handler the interrupt handler
 * @returnthis command *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.interruptHandlerAwait() : Unit {
  return awaitEvent{
    this.interruptHandler({ v -> it.handle(null) })}
}

/**
 * Set a suspend handler, this handler is called when the command is suspended, for instance user
 * press <code>Ctrl-Z</code>.
 *
 * @param handler the interrupt handler
 * @returnthis command *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.suspendHandlerAwait() : Unit {
  return awaitEvent{
    this.suspendHandler({ v -> it.handle(null) })}
}

/**
 * Set a resume handler, this handler is called when the command is resumed, for instance user
 * types <code>bg</code> or <code>fg</code> to resume the command.
 *
 * @param handler the interrupt handler
 * @returnthis command *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.resumeHandlerAwait() : Unit {
  return awaitEvent{
    this.resumeHandler({ v -> it.handle(null) })}
}

/**
 * Set an end handler, this handler is called when the command is ended, for instance the command is running
 * and the shell closes.
 *
 * @param handler the end handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.endHandlerAwait() : Unit {
  return awaitEvent{
    this.endHandler({ v -> it.handle(null) })}
}

/**
 * Set a background handler, this handler is called when the command is running and put to background.
 *
 * @param handler the background handler
 * @returnthis command *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.backgroundHandlerAwait() : Unit {
  return awaitEvent{
    this.backgroundHandler({ v -> it.handle(null) })}
}

/**
 * Set a foreground handler, this handler is called when the command is running and put to foreground.
 *
 * @param handler the foreground handler
 * @returnthis command *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandProcess original] using Vert.x codegen.
 */
suspend fun CommandProcess.foregroundHandlerAwait() : Unit {
  return awaitEvent{
    this.foregroundHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.resizehandlerAwait() : Unit {
  return awaitEvent{
    this.resizehandler({ v -> it.handle(null) })}
}

