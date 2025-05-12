package com.intheeast.inheritance.Polymorphism.clone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{

		Address addr = new Address("Seoul");
		
		Person person = new Person(addr);
		
		// shallow clone
//		Person personClone = (Person) person.clone();
		
		return;
		
	}

}
