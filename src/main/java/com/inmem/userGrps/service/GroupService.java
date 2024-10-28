package com.inmem.userGrps.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.inmem.userGrps.model.Group;
import com.inmem.userGrps.model.User;

@Service
public class GroupService {

	List<Group>	groupsList = new ArrayList<Group>();
	
@Autowired	
	GroupService(List<User> userList){
		User alpha = new User("Alpha",LocalDateTime.of(2000, 01, 20, 00, 00),"alpha@gmail.com","PH20LL");
		User james = new User("James",LocalDateTime.of(1980, 05, 12, 00, 00),"james@gmail.com","BT13NG");
		User thomas = new User("Thomas",LocalDateTime.of(1990, 03, 17, 00, 00),"thomascook@gmail.com","PH20ER");
		User jacob = new User("Jacob",LocalDateTime.of(1940, 02, 28, 00, 00),"Jacob@gmail.com","BR13RG");
		User jamess = new User("jamess",LocalDateTime.of(1940, 02, 28, 00, 00),"jamess@gmail.com","BR13RG");
		
		Group devs = new Group("001", "developers", (Arrays.asList(alpha,james,thomas,jacob)));
		Group hackers = new Group("oo1", "hackers", (Arrays.asList(jamess)));
		Group testers = new Group("002", "testers", (Arrays.asList(james,thomas,jacob)));
		
		this.groupsList.addAll(Arrays.asList(devs,testers,hackers));
	}
	public boolean isUserInGroup(User user, Group group) {
		

		return false;
	}
	
	
	@GetMapping("/listGroups")
	public List<Group> getAllGroups() {
		return  this.groupsList;
	}
}
