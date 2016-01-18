package com.foo.app.service.user;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.foo.app.dao.user.IUserDAO;
import com.foo.app.model.User;
import com.foo.app.service.user.adapter.UserModelAdapter;
import com.foo.app.service.user.vo.UserDataVOIn;
import com.foo.app.service.user.vo.UserDataVOOut;

public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDAO userDAO;
	
	@Resource
	private UserModelAdapter userModelAdapter;
	
	@Override
	public Response getUserById(String userId) {
		
		//validate input
		
		User user = userDAO.get(Long.valueOf(userId));
		UserDataVOOut userVO = userModelAdapter.toVO(user);
		ResponseBuilder responseBuilder = Response.ok(userVO);
		return responseBuilder.build();
	}

	@Override
	public Response addUser(UserDataVOIn userVO) {
		User user = userModelAdapter.fromVO(userVO);
		userDAO.save(user);
		ResponseBuilder responseBuilder = Response.ok();
		return responseBuilder.build();
	}

	@Override
	public Response getUsers() {
		return null;
	}

}
