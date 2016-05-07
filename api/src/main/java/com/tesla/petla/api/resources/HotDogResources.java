package com.tesla.petla.api.resources;

import com.tesla.petla.api.type.Status;
import com.tesla.petla.api.HotDogServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HotDogResources {
	
	HotDogServices hotDogService = new HotDogServices();
	
	@GET
	@Path("/enable")
	public boolean enable() {
		return true;
	}
	
	@GET
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Status update() {
		return hotDogService.getStatus();
	}
	
	@GET
	@Path("/stop")
	public boolean stop() {
		return true;
	}

}
