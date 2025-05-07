package com.intheeast.tsetexample;

public class FieldTestExample {

	private int age = 0;
	private int gender = 0;
	private String alphabet;
	private String name; // Type mismatch: cannot convert from int to String
	
	public FieldTestExample() {
		
	}
	
	public FieldTestExample(int age, int gender, String alphabet, String name) {
		super();
		this.age = age;
		this.gender = gender;
		this.alphabet = alphabet;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void Alphabet() {
		System.out.println("A");
	}
}



