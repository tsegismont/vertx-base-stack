package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.TestCaseReport
import io.vertx.ext.unit.report.TestSuiteReport
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an exception handler, the exception handler reports the test suite errors, it can be called mulitple
 * times before the test ends.
 *
 * @param handler the exception handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.report.TestSuiteReport original] using Vert.x codegen.
 */
suspend fun TestSuiteReport.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun TestSuiteReport.handlerAwait() : TestCaseReport {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun TestSuiteReport.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

