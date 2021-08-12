package org.resource;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.model.Coffee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * @author liva
 */

@Path("coffees")
public interface CoffeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	Collection<Coffee> getCoffees();

	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	Coffee getCoffee(@PathParam("name") String name);
}
