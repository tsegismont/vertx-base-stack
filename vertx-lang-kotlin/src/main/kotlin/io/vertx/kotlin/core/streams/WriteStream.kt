package io.vertx.kotlin.core.streams

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitEvent

/**
 * Set an exception handler on the write stream.
 *
 * @param handler the exception handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.WriteStream original] using Vert.x codegen.
 */
suspend fun <T> WriteStream<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

/**
 * Set a drain handler on the stream. If the write queue is full, then the handler will be called when the write
 * queue is ready to accept buffers again. See [io.vertx.core.streams.Pump] for an example of this being used.
 * <p/>
 * The stream implementation defines when the drain handler, for example it could be when the queue size has been
 * reduced to <code>maxSize / 2</code>.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.WriteStream original] using Vert.x codegen.
 */
suspend fun <T> WriteStream<T>.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

