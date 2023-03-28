package com.vlanto.DemoHibe;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="alien_table")
public class Alien {
	
	@Id
	private int aid;
	//@Transient //if i don't want to show name column
	private AlienName aname;
	//@Column(name="alien_color")
	private String color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
