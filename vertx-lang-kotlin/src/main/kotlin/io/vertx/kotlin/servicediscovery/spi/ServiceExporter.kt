package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.servicediscovery.spi.ServiceExporter

/**
 * Close the exporter
 *
 * @param closeHandler the handle to be notified when exporter is closed, may be <code>null</code>
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServiceExporter original] using Vert.x codegen.
 */
suspend fun ServiceExporter.closeAwait() : Unit {
    return awaitEvent{
        this.close({ v -> it.handle(null) })}
}

