package com.neu.db.dao.implement;

public class GroupDaoImpl {
	
	public int id;
	public String name;
	public String description;
	public UserDaoImpl admin;
	public UserDaoImpl members;
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
	public UserDaoImpl getAdmin() {
		return admin;
	}
	public void setAdmin(UserDaoImpl admin) {
		this.admin = admin;
	}
	public UserDaoImpl getMembers() {
		return members;
	}
	public void setMembers(UserDaoImpl members) {
		this.members = members;
	}
	
	

}
