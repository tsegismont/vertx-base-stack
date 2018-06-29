package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.JobController
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Close the controller and terminate all the underlying jobs, a closed controller does not accept anymore jobs.
 *
 * @param completionHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.JobController original] using Vert.x codegen.
 */
suspend fun JobController.closeAwait() : Unit {
  return awaitEvent{
    this.close({ v -> it.handle(null) })}
}

