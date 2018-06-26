package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.Process
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an handler for being notified when the process terminates.
 *
 * @param handler the handler called when the process terminates.
 * @returnthis object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.terminatedHandlerAwait() : Int {
    return awaitEvent{
        this.terminatedHandler(it)
    }
}

/**
 * Suspend the process.
 *
 * @param completionHandler handler called after resume callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.resumeAwait() : Unit {
    return awaitEvent{
        this.resume({ v -> it.handle(null) })}
}

/**
 * Suspend the process.
 *
 * @param foreground 
 * @param completionHandler handler called after resume callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.resumeAwait(foreground : Boolean) : Unit {
    return awaitEvent{
        this.resume(foreground, { v -> it.handle(null) })}
}

/**
 * Resume the process.
 *
 * @param completionHandler handler called after suspend callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.suspendAwait() : Unit {
    return awaitEvent{
        this.suspend({ v -> it.handle(null) })}
}

/**
 * Terminate the process.
 *
 * @param completionHandler handler called after end callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.terminateAwait() : Unit {
    return awaitEvent{
        this.terminate({ v -> it.handle(null) })}
}

/**
 * Set the process in background.
 *
 * @param completionHandler handler called after background callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.toBackgroundAwait() : Unit {
    return awaitEvent{
        this.toBackground({ v -> it.handle(null) })}
}

/**
 * Set the process in foreground.
 *
 * @param completionHandler handler called after foreground callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Process original] using Vert.x codegen.
 */
suspend fun Process.toForegroundAwait() : Unit {
    return awaitEvent{
        this.toForeground({ v -> it.handle(null) })}
}

