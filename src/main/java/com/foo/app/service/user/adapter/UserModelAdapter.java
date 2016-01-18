package com.foo.app.service.user.adapter;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.foo.app.model.User;
import com.foo.app.service.user.vo.UserDataVOIn;
import com.foo.app.service.user.vo.UserDataVOOut;


/**
 * @author mapopa
 * @created 03/12/2014
 * @since 03/12/2014
 */
@Component
public class UserModelAdapter {
	
    private static final Logger LOGGER = Logger.getLogger(UserModelAdapter.class);

    public UserDataVOOut toVO(User user) {
    	UserDataVOOut userVO  = new UserDataVOOut();
    	userVO.setFullName(user.getFirstName() + " " + user.getLastName());
    	return userVO;
    }
    
    public User fromVO(UserDataVOIn userVO) {
    	User user = new User();
    	user.setFirstName(userVO.getFirstName());
    	user.setLastName(userVO.getLastName());
    	
    	user.setBirthDate(new Date());
    	return user;
    }

}
