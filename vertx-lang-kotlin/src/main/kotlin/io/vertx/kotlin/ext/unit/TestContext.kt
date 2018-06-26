package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestContext
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Execute the provided handler, which may contain assertions, possibly from any third-party assertion framework.
 * Any [java.lang.AssertionError] thrown will be caught (and propagated) in order to fulfill potential expected async
 * completeness.
 *
 * @param block block of code to be executed
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestContext original] using Vert.x codegen.
 */
suspend fun TestContext.verifyAwait() : Unit {
    return awaitEvent{
        this.verify({ v -> it.handle(null) })}
}

