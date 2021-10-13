package com.sugardaddy.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aliens")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		System.out.println("getAlien called");
		Alien a1 = new Alien();
		a1.setName("Golu");
		a1.setPoints(70);
		
		return a1;
	}
}