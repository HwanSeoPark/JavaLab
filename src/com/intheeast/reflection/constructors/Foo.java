package com.intheeast.reflection.constructors;

public class Foo {

	private String name;
	
	private Foo() {
		name = "hello";
	}
	
	public Foo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}