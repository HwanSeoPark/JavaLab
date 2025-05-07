package com.intheeast.classes.interfacequiz;

public class ImplGoodBye implements GoodBye {

	@Override
	public void goodBye(String firstName, String secondName) {
		System.out.println(firstName + secondName);

	}

}
