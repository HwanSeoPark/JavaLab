package com.intheeast.classes.anonymousquiz;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("AAA");
			}
	
			@Override
			public void move() {
				System.out.println("BBB");
				
			}		
	    };
	    
	
	    animal.sound();
	    animal.move();
	    
	}
}
