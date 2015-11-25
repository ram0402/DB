package com.neu.db.pojos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SecondaryPostBean extends PostBean {

	public MainPostBean belongsTo;
	public int numOfUpvotes;
	public int numOfDownvotes;
}
