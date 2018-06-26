package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

/**
 * Set an exception handler on the read stream.
 *
 * @param exceptionHandler the exception handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

/**
 * Set a message handler. As message appear in a queue, the handler will be called with the message.
 *
 * @param messageArrived 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.handlerAwait() : RabbitMQMessage {
    return awaitEvent{
        this.handler(it)
    }
}

/**
 * Set an end handler. Once the stream has canceled successfully, the handler will be called.
 *
 * @param endHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

/**
 * Stop message consumption from a queue.
 * <p>
 * The operation is asynchronous. When consumption will be stopped, you can by notified via [io.vertx.rabbitmq.RabbitMQConsumer]
 *
 * @param cancelResult contains information about operation status: success/fail.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.cancelAwait() : Unit {
    return awaitResult{
        this.cancel({ ar -> it.handle(ar.mapEmpty()) })}
}

