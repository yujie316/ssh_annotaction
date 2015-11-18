package com.ydcun.jersey.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ydcun.entity.Users;

@Path("test")
public class TestResource {
	@Path("getText")
	@GET
	@Produces("text/plain")
	public String getText() {
		return "hello lucky";
	}

	@Path("getJson")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)  
    @Produces(MediaType.APPLICATION_JSON) 
	public Users getJson() {
		return new Users("hi", 26, 62);
	}
	@Path("addUser")
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes(MediaType.APPLICATION_JSON) 
	public Users addUser(@FormParam("userID") List<String> userID) {
		return new Users("a", 26, 62);
	}
}
