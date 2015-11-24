package com.neu.db.pojos;

public class Group {
	
	public int id;
	public String name;
	public String description;
	public User admin;
	public User members;
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
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public User getMembers() {
		return members;
	}
	public void setMembers(User members) {
		this.members = members;
	}
	
	

}
