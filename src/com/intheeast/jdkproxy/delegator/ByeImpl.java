package com.intheeast.jdkproxy.delegator;

public class ByeImpl implements Bye {
	
	public void sayBye(String name) {
		System.out.println("Goodbye, " + name);
	}
}
