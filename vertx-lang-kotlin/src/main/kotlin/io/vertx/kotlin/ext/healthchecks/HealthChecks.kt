package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.Future
import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.ext.healthchecks.Status
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Registers a health check procedure.
 * <p>
 * The procedure is a  taking a  of [io.vertx.ext.healthchecks.Status] as parameter.
 * Procedures are asynchronous, and <strong>must</strong> complete or fail the given .
 * If the future object is failed, the procedure outcome is considered as `DOWN`. If the future is
 * completed without any object, the procedure outcome is considered as `UP`. If the future is completed
 * with a (not-null) [io.vertx.ext.healthchecks.Status], the procedure outcome is the received status.
 * <p>
 * This method uses a 1s timeout. Use [io.vertx.ext.healthchecks.HealthChecks] to configure the timeout.
 *
 * @param name the name of the procedure, must not be <code>null</code> or empty
 * @param procedure the procedure, must not be <code>null</code>
 * @returnthe current [io.vertx.ext.healthchecks.HealthChecks] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthChecks original] using Vert.x codegen.
 */
suspend fun HealthChecks.registerAwait(name : String) : Future<Status> {
  return awaitEvent{
    this.register(name, it)
  }
}

/**
 * Invokes the registered procedures and computes the outcome.
 *
 * @param resultHandler the result handler, must not be <code>null</code>. The handler received the computed .
 * @returnthe current [io.vertx.ext.healthchecks.HealthChecks] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthChecks original] using Vert.x codegen.
 */
suspend fun HealthChecks.invokeAwait() : JsonObject {
  return awaitEvent{
    this.invoke(it)
  }
}

/**
 * Invokes the registered procedure with the given name and sub-procedures. It computes the overall
 * outcome.
 *
 * @param name 
 * @param resultHandler the result handler, must not be <code>null</code>. The handler received an  marked as failed if the procedure with the given name cannot be found or invoked.
 * @returnthe current [io.vertx.ext.healthchecks.HealthChecks] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthChecks original] using Vert.x codegen.
 */
suspend fun HealthChecks.invokeAwait(name : String) : JsonObject {
  return awaitResult{
    this.invoke(name, it)
  }
}

