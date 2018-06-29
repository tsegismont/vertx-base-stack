package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttClient
import io.vertx.mqtt.messages.MqttConnAckMessage
import io.vertx.mqtt.messages.MqttPublishMessage
import io.vertx.mqtt.messages.MqttSubAckMessage

/**
 * Connects to an MQTT server calling connectHandler after connection
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @param connectHandler handler called when the asynchronous connect call ends
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port : Int, host : String) : MqttConnAckMessage {
  return awaitResult{
    this.connect(port, host, it)
  }
}

/**
 * Connects to an MQTT server calling connectHandler after connection
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @param serverName the SNI server name
 * @param connectHandler handler called when the asynchronous connect call ends
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port : Int, host : String, serverName : String) : MqttConnAckMessage {
  return awaitResult{
    this.connect(port, host, serverName, it)
  }
}

/**
 * Disconnects from the MQTT server calling disconnectHandler after disconnection
 *
 * @param disconnectHandler handler called when asynchronous disconnect call ends
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.disconnectAwait() : Unit {
  return awaitResult{
    this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Sends the PUBLISH message to the remote MQTT server
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @param publishSentHandler handler called after PUBLISH packet sent with packetid (not when QoS 0)
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.publishAwait(topic : String, payload : Buffer, qosLevel : MqttQoS, isDup : Boolean, isRetain : Boolean) : Int {
  return awaitResult{
    this.publish(topic, payload, qosLevel, isDup, isRetain, it)
  }
}

/**
 * Sets handler which will be called each time publish is completed
 *
 * @param publishCompletionHandler handler called with the packetId
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.publishCompletionHandlerAwait() : Int {
  return awaitEvent{
    this.publishCompletionHandler(it)
  }
}

/**
 * Sets handler which will be called each time server publish something to client
 *
 * @param publishHandler handler to call
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.publishHandlerAwait() : MqttPublishMessage {
  return awaitEvent{
    this.publishHandler(it)
  }
}

/**
 * Sets handler which will be called after SUBACK packet receiving
 *
 * @param subscribeCompletionHandler handler to call. List inside is a granted QoS array
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeCompletionHandlerAwait() : MqttSubAckMessage {
  return awaitEvent{
    this.subscribeCompletionHandler(it)
  }
}

/**
 * Subscribes to the topic with a specified QoS level
 *
 * @param topic topic you subscribe on
 * @param qos QoS level
 * @param subscribeSentHandler handler called after SUBSCRIBE packet sent with packetid
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topic : String, qos : Int) : Int {
  return awaitResult{
    this.subscribe(topic, qos, it)
  }
}

/**
 * Subscribes to the topic and adds a handler which will be called after the request is sent
 *
 * @param topics topics you subscribe on
 * @param subscribeSentHandler handler called after SUBSCRIBE packet sent with packetid
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topics : Map<String,Int>) : Int {
  return awaitResult{
    this.subscribe(topics, it)
  }
}

/**
 * Sets handler which will be called after UNSUBACK packet receiving
 *
 * @param unsubscribeCompletionHandler handler to call with the packetid
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.unsubscribeCompletionHandlerAwait() : Int {
  return awaitEvent{
    this.unsubscribeCompletionHandler(it)
  }
}

/**
 * Unsubscribe from receiving messages on given topic
 *
 * @param topic Topic you want to unsubscribe from
 * @param unsubscribeSentHandler handler called after UNSUBSCRIBE packet sent
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.unsubscribeAwait(topic : String) : Int {
  return awaitResult{
    this.unsubscribe(topic, it)
  }
}

/**
 * Sets handler which will be called after PINGRESP packet receiving
 *
 * @param pingResponseHandler handler to call
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.pingResponseHandlerAwait() : Unit {
  return awaitEvent{
    this.pingResponseHandler({ v -> it.handle(null) })}
}

/**
 * Set an exception handler for the client, that will be called when an error happens
 * in internal netty structures.
 *
 * <code>io.netty.handler.codec.DecoderException</code> can be one of the cause
 *
 * @param handler the exception handler
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.exceptionHandlerAwait() : Throwable {
  return awaitEvent{
    this.exceptionHandler(it)
  }
}

/**
 * Set a handler that will be called when the connection with server is closed
 *
 * @param closeHandler handler to call
 * @returncurrent MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.closeHandlerAwait() : Unit {
  return awaitEvent{
    this.closeHandler({ v -> it.handle(null) })}
}

