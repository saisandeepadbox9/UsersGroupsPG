package com.inmem.userGrps.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Group {

	@Getter @Setter
	String groupName;
	@Getter @Setter
	String groupId;
	@Getter @Setter
	List<User> groupUsers;
	
	public Group(String groupId, String groupName, List<User> userList ) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupUsers = userList;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", groupId=" + groupId + ", groupUsers=" + groupUsers + "]";
	}
	
	
}
