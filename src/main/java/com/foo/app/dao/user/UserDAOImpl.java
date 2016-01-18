package com.foo.app.dao.user;

import org.springframework.stereotype.Repository;

import com.foo.app.dao.GenericDAOImpl;
import com.foo.app.model.User;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements IUserDAO {

}
