package com.foo.app.service.user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.transaction.annotation.Transactional;

import com.foo.app.service.user.vo.UserDataVOIn;


@WebService
@Path("/userservice/")
public interface IUserService {

	@WebMethod
	@GET   
	@Path("/user/")
	@Produces({ "application/json" })
	@Transactional
	public Response getUsers();
	
	@WebMethod
	@GET   
	@Path("/user/{userId}/")
	@Produces({ "application/json" })
	@Transactional
	public Response getUserById(@PathParam("userId") String userId);


	@WebMethod
	@POST
	@Consumes({ "application/json" })
	@Path("/user/")  
	@Transactional
	public Response addUser(@WebParam(name = "user") UserDataVOIn user);

	

}
