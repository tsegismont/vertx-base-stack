package io.vertx.kotlin.core.http

import io.vertx.core.Handler
import io.vertx.core.MultiMap
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebsocketVersion
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Sends an HTTP GET request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.getNow(options, it)
    }
}

/**
 * Sends an HTTP GET request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(port, host, requestURI, it)
    }
}

/**
 * Sends an HTTP GET request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(host, requestURI, it)
    }
}

/**
 * Sends an HTTP GET request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(requestURI, it)
    }
}

/**
 * Sends an HTTP HEAD request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.headNow(options, it)
    }
}

/**
 * Sends an HTTP HEAD request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(port, host, requestURI, it)
    }
}

/**
 * Sends an HTTP HEAD request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(host, requestURI, it)
    }
}

/**
 * Sends an HTTP HEAD request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(requestURI, it)
    }
}

/**
 * Sends an HTTP OPTIONS request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(options, it)
    }
}

/**
 * Sends an HTTP OPTIONS request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(port, host, requestURI, it)
    }
}

/**
 * Sends an HTTP OPTIONS request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(host, requestURI, it)
    }
}

/**
 * Sends an HTTP OPTIONS request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(requestURI, it)
    }
}

/**
 * Connect a WebSocket with the specified options
 *
 * @param options the request options
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions) : WebSocket {
    return awaitEvent{
        this.websocket(options, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, it)
    }
}

/**
 * Connect a WebSocket with the specified options
 *
 * @param options the request options
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the host and relative request URI and default port
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, it)
    }
}

/**
 * Connect a WebSocket to the host and relative request URI and default port
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, wsConnect, it)
    }
}

/**
 * Connect a WebSocket with the specified options, and with the specified headers
 *
 * @param options the request options
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, it)
    }
}

/**
 * Connect a WebSocket with the specified options, and with the specified headers
 *
 * @param options the request options
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, it)
    }
}

/**
 * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, wsConnect, it)
    }
}

/**
 * Connect a WebSocket with the specified optionsI, with the specified headers and using
 * the specified version of WebSockets
 *
 * @param options the request options
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, version, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using
 * the specified version of WebSockets
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, it)
    }
}

/**
 * Connect a WebSocket with the specified options, with the specified headers and using
 * the specified version of WebSockets
 *
 * @param options the request options
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, version, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using
 * the specified version of WebSockets
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using
 * the specified version of WebSockets
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, it)
    }
}

/**
 * Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using
 * the specified version of WebSockets
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, wsConnect, it)
    }
}

/**
 * Connect a WebSocket with the specified options, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param options the request options
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, version, subProtocols, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, subProtocols, it)
    }
}

/**
 * Connect a WebSocket with the specified absolute url, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols.
 *
 * @param url the absolute url
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAbsAwait(url : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocketAbs(url, headers, version, subProtocols, wsConnect, it)
    }
}

/**
 * Connect a WebSocket with the specified options, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param options the request options
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, version, subProtocols, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

/**
 * Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, subProtocols, it)
    }
}

/**
 * Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using
 * the specified version of WebSockets, and the specified websocket sub protocols
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols to use
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port
 *
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port
 *
 * @param requestURI the relative URI
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, wsConnect, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, wsConnect, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the
 * specified version of WebSockets
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, version, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the
 * specified version of WebSockets
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, version, wsConnect, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the
 * specified version of WebSockets and the specified sub protocols
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols
 * @param wsConnect handler that will be called with the websocket when connected
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, version, subProtocols, it)
    }
}

/**
 * Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the
 * specified version of WebSockets and the specified sub protocols
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param version the websocket version
 * @param subProtocols the subprotocols
 * @param wsConnect handler that will be called with the websocket when connected
 * @param failureHandler handler that will be called if websocket connection fails
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

