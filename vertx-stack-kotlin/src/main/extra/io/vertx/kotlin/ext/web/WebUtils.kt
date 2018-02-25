package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

/**
 * An extension method for simplifying coroutines usage with Vert.x Web routers
 */
fun Route.handler(fn : (RoutingContext) -> Unit): Route {
  return handler { ctx ->
    try {
      fn(ctx)
    } catch(e: Exception) {
      ctx.fail(e)
    }
  }
}

fun Router.get(path: String? = null, handler: (RoutingContext) -> Unit): Route {
  if (path != null) {
    return get(path).handler(handler)
  } else {
    return get().handler(handler)
  }
}

fun Router.post(path: String? = null, handler: (RoutingContext) -> Unit): Route {
  if (path != null) {
    return post(path).handler(handler)
  } else {
    return post().handler(handler)
  }
}

fun Router.put(path: String? = null, handler: (RoutingContext) -> Unit): Route {
  if (path != null) {
    return put(path).handler(handler)
  } else {
    return put().handler(handler)
  }
}

operator fun Router.invoke(body: Router.() -> Unit) {
  body(this)
}
