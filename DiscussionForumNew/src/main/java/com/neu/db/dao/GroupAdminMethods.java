package com.neu.db.dao;

public interface GroupAdminMethods {
	
	void approveUserPost();
	void rejectUserPost();
	void pinPost();
	void endorsePost();
	void addGroupUsers();
	void updateGroupDescription();
	void removeUserFromGroup();

}
