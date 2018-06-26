package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint
import io.vertx.mqtt.messages.MqttPublishMessage
import io.vertx.mqtt.messages.MqttSubscribeMessage
import io.vertx.mqtt.messages.MqttUnsubscribeMessage

/**
 * Set a disconnect handler on the MQTT endpoint. This handler is called when a DISCONNECT
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.disconnectHandlerAwait() : Unit {
    return awaitEvent{
        this.disconnectHandler({ v -> it.handle(null) })}
}

/**
 * Set a subscribe handler on the MQTT endpoint. This handler is called when a SUBSCRIBE
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.subscribeHandlerAwait() : MqttSubscribeMessage {
    return awaitEvent{
        this.subscribeHandler(it)
    }
}

/**
 * Set a unsubscribe handler on the MQTT endpoint. This handler is called when a UNSUBSCRIBE
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.unsubscribeHandlerAwait() : MqttUnsubscribeMessage {
    return awaitEvent{
        this.unsubscribeHandler(it)
    }
}

/**
 * Set the publish handler on the MQTT endpoint. This handler is called when a PUBLISH
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishHandlerAwait() : MqttPublishMessage {
    return awaitEvent{
        this.publishHandler(it)
    }
}

/**
 * Set the puback handler on the MQTT endpoint. This handler is called when a PUBACK
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishAcknowledgeHandlerAwait() : Int {
    return awaitEvent{
        this.publishAcknowledgeHandler(it)
    }
}

/**
 * Set the pubrec handler on the MQTT endpoint. This handler is called when a PUBREC
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishReceivedHandlerAwait() : Int {
    return awaitEvent{
        this.publishReceivedHandler(it)
    }
}

/**
 * Set the pubrel handler on the MQTT endpoint. This handler is called when a PUBREL
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishReleaseHandlerAwait() : Int {
    return awaitEvent{
        this.publishReleaseHandler(it)
    }
}

/**
 * Set the pubcomp handler on the MQTT endpoint. This handler is called when a PUBCOMP
 * message is received by the remote MQTT client
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishCompletionHandlerAwait() : Int {
    return awaitEvent{
        this.publishCompletionHandler(it)
    }
}

/**
 * Set the pingreq handler on the MQTT endpoint. This handler is called when a PINGREQ
 * message is received by the remote MQTT client. In any case the endpoint sends the
 * PINGRESP internally after executing this handler.
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.pingHandlerAwait() : Unit {
    return awaitEvent{
        this.pingHandler({ v -> it.handle(null) })}
}

/**
 * Set a close handler. This will be called when the MQTT endpoint is closed
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

/**
 * Set an exception handler. This will be called when an error at protocol level happens
 *
 * @param handler the handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

/**
 * Sends the PUBLISH message to the remote MQTT server
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @param publishSentHandler handler called after PUBLISH packet sent with a packetId
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttEndpoint original] using Vert.x codegen.
 */
suspend fun MqttEndpoint.publishAwait(topic : String, payload : Buffer, qosLevel : MqttQoS, isDup : Boolean, isRetain : Boolean) : Int {
    return awaitResult{
        this.publish(topic, payload, qosLevel, isDup, isRetain, it)
    }
}

