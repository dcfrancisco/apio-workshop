/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package apio.architect.workshop.exception.mapper;

import com.liferay.portal.kernel.exception.NoSuchModelException;
import org.osgi.service.component.annotations.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

/**
 * @author Alejandro Hernández
 */
@Component(immediate = true, property = "osgi.jaxrs.extension=true")
public class NoSuchModelExceptionMapper implements ExceptionMapper<NoSuchModelException> {

    @Override
    public Response toResponse(NoSuchModelException noSuchModelException) {
        return Response.status(NOT_FOUND)
            .type(TEXT_PLAIN_TYPE)
            .entity(noSuchModelException.getMessage())
            .build();
    }

}
