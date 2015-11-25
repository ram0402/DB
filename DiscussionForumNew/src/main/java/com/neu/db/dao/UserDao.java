package com.neu.db.dao;

public interface UserDao {
	
	void logout();
	void register();
	void addNewPost();
	void deletePost();
	void browseThroughGroups();
	void upvotePost();
	void downvotePost();

}
