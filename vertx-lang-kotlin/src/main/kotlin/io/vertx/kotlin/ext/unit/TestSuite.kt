package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.TestSuite
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set a callback executed before the tests.
 *
 * @param callback the callback
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.beforeAwait() : TestContext {
    return awaitEvent{
        this.before(it)
    }
}

/**
 * Set a callback executed before each test and after the suite <code>before</code> callback.
 *
 * @param callback the callback
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.beforeEachAwait() : TestContext {
    return awaitEvent{
        this.beforeEach(it)
    }
}

/**
 * Set a callback executed after the tests.
 *
 * @param callback the callback
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.afterAwait() : TestContext {
    return awaitEvent{
        this.after(it)
    }
}

/**
 * Set a callback executed after each test and before the suite <code>after</code> callback.
 *
 * @param callback the callback
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.afterEachAwait() : TestContext {
    return awaitEvent{
        this.afterEach(it)
    }
}

/**
 * Add a new test case to the suite.
 *
 * @param name the test case name
 * @param testCase the test case
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.testAwait(name : String) : TestContext {
    return awaitEvent{
        this.test(name, it)
    }
}

/**
 * Add a new test case to the suite.
 *
 * @param name the test case name
 * @param repeat the number of times the test should be repeated
 * @param testCase the test case
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestSuite original] using Vert.x codegen.
 */
suspend fun TestSuite.testAwait(name : String, repeat : Int) : TestContext {
    return awaitEvent{
        this.test(name, repeat, it)
    }
}

