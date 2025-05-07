package com.intheeast.classes.interfacequiz;

public class Main {

	public static void useGoodByeInterface(GoodBye goodBye) {
	
		goodBye.goodBye("Good", "Bye!!");	
		
	}	
	
	public static void main(String[] args) {
		
		GoodBye goodBye = new ImplGoodBye();
		
		useGoodByeInterface(goodBye);
	

	}

}
