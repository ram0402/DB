package com.neu.db.dao;

public interface GroupAdminDao {
	
	void approveUserPost();
	void rejectUserPost();
	void pinPost();
	void endorsePost();
	void addGroupUsers();
	void updateGroupDescription();
	void removeUserFromGroup();

}
