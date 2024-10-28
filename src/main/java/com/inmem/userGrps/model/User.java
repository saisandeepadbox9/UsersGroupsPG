package com.inmem.userGrps.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


public class User {


	@Getter @Setter
	private String id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private  LocalDateTime dateOfBirth;
	@Getter @Setter
	private  String email;
	@Getter @Setter
	private  String postcode;
	
	public User(String name, LocalDateTime localDateTime, String email, String postcode) {
		super();
		
		this.name = name;
		this.dateOfBirth = localDateTime;
		this.email = email;
		this.postcode = postcode;
	}

	

	@Override
	public String toString() {
		return "User [ID=" + id +", name=" + name + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", postcode=" + postcode
				+ "]";
	}
	
	
	
}
