package com.inmem.userGrps.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.inmem.userGrps.model.User;

@Service
public class UserDetailsService {

	List<User> usersList = new ArrayList<User>();
	public UserDetailsService() {
		User alpha = new User("Alpha",LocalDateTime.of(2000, 01, 20, 00, 00),"alpha@gmail.com","PH20LL");
		User james = new User("James",LocalDateTime.of(1980, 05, 12, 00, 00),"james@gmail.com","BT13NG");
		User thomas = new User("Thomas",LocalDateTime.of(1990, 03, 17, 00, 00),"thomascook@gmail.com","PH20ER");
		User jacob = new User("Jacob",LocalDateTime.of(1940, 02, 28, 00, 00),"Jacob@gmail.com","BR13RG");
				
		this.usersList.addAll(Arrays.asList(alpha,james,thomas,jacob));
	}
	
	public List<User> getAllUsers(){
		return usersList;
	}

	

	public User create(User user) {
		usersList.add(user);
		return user;
	}
}
