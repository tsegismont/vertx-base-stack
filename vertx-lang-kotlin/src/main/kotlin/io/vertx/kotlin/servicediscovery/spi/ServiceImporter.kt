package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.servicediscovery.spi.ServiceImporter

/**
 * Closes the importer
 *
 * @param closeHandler the handle to be notified when importer is closed, may be <code>null</code>
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServiceImporter original] using Vert.x codegen.
 */
suspend fun ServiceImporter.closeAwait() : Unit {
    return awaitEvent{
        this.close({ v -> it.handle(null) })}
}

