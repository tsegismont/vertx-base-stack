package io.vertx.kotlin.ext.web.templ

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.templ.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Render the template
 * <p>
 * <b>NOTE</b> if you call method directly (i.e. not using [io.vertx.ext.web.handler.TemplateHandler]) make sure
 * that <i>templateFileName</i> is sanitized via [io.vertx.ext.web.impl.Utils]
 *
 * @param context the routing context
 * @param templateDirectory the template directory to use
 * @param templateFileName the relative template file name to use
 * @param handler the handler that will be called with a result containing the buffer or a failure.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.templ.TemplateEngine original] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context : RoutingContext, templateDirectory : String, templateFileName : String) : Buffer {
    return awaitResult{
        this.render(context, templateDirectory, templateFileName, it)
    }
}

