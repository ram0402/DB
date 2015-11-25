package com.neu.db.pojos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GroupBean {
	
	public int id;
	public String name;
	public String description;
	public UserBean admin;
	public UserBean members;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public UserBean getAdmin() {
		return admin;
	}
	public void setAdmin(UserBean admin) {
		this.admin = admin;
	}
	public UserBean getMembers() {
		return members;
	}
	public void setMembers(UserBean members) {
		this.members = members;
	}
	
	

}
