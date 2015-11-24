package com.neu.db.dao.implement;

public class SecondaryPost extends Post {

	public MainPost belongsTo;
	public int numOfUpvotes;
	public int numOfDownvotes;
}
