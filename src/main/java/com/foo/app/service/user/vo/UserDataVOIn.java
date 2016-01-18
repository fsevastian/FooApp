package com.foo.app.service.user.vo;

import java.io.Serializable;

public class UserDataVOIn implements Serializable{

	private static final long serialVersionUID = 217050988455035850L;

	private String firstName;

	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
