package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.Future
import io.vertx.ext.healthchecks.HealthCheckHandler
import io.vertx.ext.healthchecks.Status
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Registers a health check procedure.
 * <p>
 * The procedure is a  taking a  of [io.vertx.ext.healthchecks.Status] as parameter. Procedures are
 * asynchronous, and <strong>must</strong> complete or fail the given . If the future object is
 * failed, the procedure outcome is considered as `DOWN`. If the future is completed without any object, the
 * procedure outcome is considered as `UP`. If the future is completed with a (not-null) [io.vertx.ext.healthchecks.Status], the
 * procedure outcome is the received status.
 * <p>
 * This method uses a 1s timeout. To configure the timeout use [io.vertx.ext.healthchecks.HealthCheckHandler].
 *
 * @param name the name of the procedure, must not be <code>null</code> or empty
 * @param procedure the procedure, must not be <code>null</code>
 * @returnthe current [io.vertx.ext.healthchecks.HealthCheckHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthCheckHandler original] using Vert.x codegen.
 */
suspend fun HealthCheckHandler.registerAwait(name : String) : Future<Status> {
  return awaitEvent{
    this.register(name, it)
  }
}

/**
 * Registers a health check procedure.
 * <p>
 * The procedure is a  taking a  of [io.vertx.ext.healthchecks.Status] as parameter. Procedures are
 * asynchronous, and <strong>must</strong> complete or fail the given . If the future object is
 * failed, the procedure outcome is considered as `DOWN`. If the future is completed without any object, the
 * procedure outcome is considered as `UP`. If the future is completed with a (not-null) [io.vertx.ext.healthchecks.Status], the
 * procedure outcome is the received status.
 *
 * @param name the name of the procedure, must not be <code>null</code> or empty
 * @param timeout the procedure timeout
 * @param procedure the procedure, must not be <code>null</code>
 * @returnthe current [io.vertx.ext.healthchecks.HealthCheckHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthCheckHandler original] using Vert.x codegen.
 */
suspend fun HealthCheckHandler.registerAwait(name : String, timeout : Long) : Future<Status> {
  return awaitEvent{
    this.register(name, timeout, it)
  }
}

