package com.tesla.petla.api.resources;

import com.tesla.petla.api.type.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HotDogResources {
	
	@GET
	@Path("/enable")
	public boolean enable() {
		return true;
	}
	
	@GET
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Status update() {
		Status s = new Status(true, "18", "28", true, false);
		return s;
	}
	
	@GET
	@Path("/stop")
	public boolean stop() {
		return true;
	}

}
