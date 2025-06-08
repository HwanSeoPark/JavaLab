package com.intheeast.jdkproxy.delegator;

public class HelloImpl implements Hello {
	
	public void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
}
