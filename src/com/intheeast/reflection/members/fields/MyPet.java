package com.intheeast.reflection.members.fields;

//Case 3: an interface implemented by this class
interface Animal {
	public String type = "Mammal"; // public field in interface
}

//Case 4: an interface extended from an interface implemented by this class
interface Dog extends Animal {
	public String breed = "Bulldog";
}

//Case 2: a superclass of this class
class LivingBeing {
	public String kingdom = "Animalia"; // public field in superclass
}

//Case 1: this class
public class MyPet extends LivingBeing implements Dog {
	public String name = "Bobby"; // public field in this class

	public void printFields() {
		// Accessing all four public fields from each source

		System.out.println("this class (name): " + this.name);                 // this class
		System.out.println("superclass (kingdom): " + this.kingdom);         // superclass
		System.out.println("interface implemented (type): " + Animal.type);  // implemented interface
		System.out.println("interface extended from implemented (breed): " + Dog.breed); // extended interface
	}

	public static void main(String[] args) {
		MyPet pet = new MyPet();
		pet.printFields();
	}
}