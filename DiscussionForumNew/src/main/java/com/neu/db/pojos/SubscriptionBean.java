package com.neu.db.pojos;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SubscriptionBean {
	
	public Date date;
	public boolean status;
}
