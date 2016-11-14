package com.market.wm;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.market.wm.domain.User;

@Path("/UserService")
public class UserService {
	
	UserDao userDao = new UserDao();
	
	@GET
	@Path("/usersXML")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsersXML() {
		return userDao.getAllUsers();
	}
	
	@GET
	@Path("/usersJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsersJSON() {
		return userDao.getAllUsers();
	}
}
