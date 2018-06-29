package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.ExecStatus
import io.vertx.ext.shell.system.Job
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an handler called when the job terminates.
 *
 * @param handler the terminate handler
 * @returnthis object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.system.Job original] using Vert.x codegen.
 */
suspend fun Job.statusUpdateHandlerAwait() : ExecStatus {
  return awaitEvent{
    this.statusUpdateHandler(it)
  }
}

