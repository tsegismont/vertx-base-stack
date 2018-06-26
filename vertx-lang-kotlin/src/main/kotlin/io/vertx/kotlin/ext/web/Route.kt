package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Route
import io.vertx.ext.web.RoutingContext
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Specify a request handler for the route. The router routes requests to handlers depending on whether the various
 * criteria such as method, path, etc match. There can be only one request handler for a route. If you set this more
 * than once it will overwrite the previous handler.
 *
 * @param requestHandler the request handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.Route original] using Vert.x codegen.
 */
suspend fun Route.handlerAwait() : RoutingContext {
    return awaitEvent{
        this.handler(it)
    }
}

/**
 * Like [io.vertx.ext.web.Route] called with ordered = true
 *
 * @param requestHandler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.Route original] using Vert.x codegen.
 */
suspend fun Route.blockingHandlerAwait() : RoutingContext {
    return awaitEvent{
        this.blockingHandler(it)
    }
}

/**
 * Specify a failure handler for the route. The router routes failures to failurehandlers depending on whether the various
 * criteria such as method, path, etc match. There can be only one failure handler for a route. If you set this more
 * than once it will overwrite the previous handler.
 *
 * @param failureHandler the request handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.Route original] using Vert.x codegen.
 */
suspend fun Route.failureHandlerAwait() : RoutingContext {
    return awaitEvent{
        this.failureHandler(it)
    }
}

