package org.itstep.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {

	private String firstname;
	private String secondName;
	private String email;
	private String password;
	
	public Account(String firstname, String secondName, String email, String password) {
		super();
		this.firstname = firstname;
		this.secondName = secondName;
		this.email = email;
		this.password = password;
	}
	
	public Account() {
	}
}
