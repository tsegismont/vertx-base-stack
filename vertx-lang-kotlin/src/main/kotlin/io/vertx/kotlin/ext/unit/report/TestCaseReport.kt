package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.TestCaseReport
import io.vertx.ext.unit.report.TestResult
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set a callback for completion, the specified <code>handler</code> is invoked when the test exec has completed.
 *
 * @param handler the completion handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.report.TestCaseReport original] using Vert.x codegen.
 */
suspend fun TestCaseReport.endHandlerAwait() : TestResult {
    return awaitEvent{
        this.endHandler(it)
    }
}

