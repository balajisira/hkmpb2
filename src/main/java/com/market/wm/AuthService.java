package com.market.wm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/AuthService")
public class AuthService {
	
	UserDao userDao = new UserDao();
	
	@POST
	@Path("/do")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getUserRole(String user) {
		String result = "Success login : " + user;
		return Response.status(201).entity(result).build();
	}
}
