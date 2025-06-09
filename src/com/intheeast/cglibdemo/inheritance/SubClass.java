package com.intheeast.cglibdemo.inheritance;

public class SubClass extends SuperClass {
	
	private String myJob;
	
	public SubClass(String name, String job) {
		super(name);
		this.myJob = job;
		
	}

	@Override
	public void print() {
		super.print();
		System.out.println("My job is " + myJob);
	}
	
}
