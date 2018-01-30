package com.abc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
//@DiscriminatorValue("A")
public class Twowheeler extends Vehicle 
{
	
	private String wheeltype;

	public String getWheeltype() {
		return wheeltype;
	}

	public void setWheeltype(String wheeltype) {
		this.wheeltype = wheeltype;
	}

}
