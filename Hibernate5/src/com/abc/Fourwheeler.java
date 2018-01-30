package com.abc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("b")
public class Fourwheeler extends Vehicle
{
    public String getWheeltypes() {
		return Wheeltypes;
	}

	public void setWheeltypes(String wheeltypes) {
		Wheeltypes = wheeltypes;
	}

	private String Wheeltypes;
}
