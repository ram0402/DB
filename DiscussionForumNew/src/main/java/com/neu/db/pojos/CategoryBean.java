package com.neu.db.pojos;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.neu.db.enums.InterestLevel;

@Component
@Scope("prototype")
public class CategoryBean {
	
	public int id;
	public String name;
	public InterestLevel level;
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
	public InterestLevel getLevel() {
		return level;
	}
	public void setLevel(InterestLevel level) {
		this.level = level;
	} 
	
	

}
