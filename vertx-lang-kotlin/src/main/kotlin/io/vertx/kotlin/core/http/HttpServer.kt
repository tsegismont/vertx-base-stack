package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpConnection
import io.vertx.core.http.HttpServer
import io.vertx.core.http.HttpServerRequest
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Set the request handler for the server to <code>requestHandler</code>. As HTTP requests are received by the server,
 * instances of [io.vertx.core.http.HttpServerRequest] will be created and passed to this handler.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.requestHandlerAwait() : HttpServerRequest {
    return awaitEvent{
        this.requestHandler(it)
    }
}

/**
 * Set a connection handler for the server.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.connectionHandlerAwait() : HttpConnection {
    return awaitEvent{
        this.connectionHandler(it)
    }
}

/**
 * Set an exception handler called for socket errors happening before the HTTP connection
 * is established, e.g during the TLS handshake.
 *
 * @param handler the handler to set
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

/**
 * Set the websocket handler for the server to <code>wsHandler</code>. If a websocket connect handshake is successful a
 * new [io.vertx.core.http.ServerWebSocket] instance will be created and passed to the handler.
 *
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.websocketHandlerAwait() : ServerWebSocket {
    return awaitEvent{
        this.websocketHandler(it)
    }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually
 * listening (or has failed).
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(port : Int, host : String) : HttpServer {
    return awaitResult{
        this.listen(port, host, it)
    }
}

/**
 * Tell the server to start listening on the given address supplying
 * a handler that will be called when the server is actually
 * listening (or has failed).
 *
 * @param address the address to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(address : SocketAddress) : HttpServer {
    return awaitResult{
        this.listen(address, it)
    }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually listening (or has failed).
 *
 * @param port the port to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(port : Int) : HttpServer {
    return awaitResult{
        this.listen(port, it)
    }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually listening (or has failed).
 *
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait() : HttpServer {
    return awaitResult{
        this.listen(it)
    }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually closed (or has failed).
 *
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

