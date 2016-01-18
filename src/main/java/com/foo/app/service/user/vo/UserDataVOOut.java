package com.foo.app.service.user.vo;

import java.io.Serializable;

public class UserDataVOOut implements Serializable {

	private static final long serialVersionUID = 1063420855683753184L;
	
	public UserDataVOOut() {
	}
	
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
