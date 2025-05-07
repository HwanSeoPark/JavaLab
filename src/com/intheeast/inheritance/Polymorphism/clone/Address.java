package com.intheeast.inheritance.Polymorphism.clone;

public class Address implements Cloneable {

	private String value;
	
	public Address() {}

	public Address(String add) {
		super();
		value = add;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
