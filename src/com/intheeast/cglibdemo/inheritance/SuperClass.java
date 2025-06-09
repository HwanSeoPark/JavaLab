package com.intheeast.cglibdemo.inheritance;

public class SuperClass {
	
	private String myName;

	public SuperClass(String name) {
		this.myName = name;
	}
	
	public void print() {
		System.out.println("My name is " + myName);
	}
	
}
