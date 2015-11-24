package com.neu.db.pojos;
import com.neu.db.enums.InterestLevel;


public class Category {
	
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
