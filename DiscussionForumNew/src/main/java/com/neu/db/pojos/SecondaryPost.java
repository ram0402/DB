package com.neu.db.pojos;

public class SecondaryPost extends Post {

	public MainPost belongsTo;
	public int numOfUpvotes;
	public int numOfDownvotes;
}
