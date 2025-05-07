package com.intheeast.classes.objectsmoreonclasses;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String city;
	private String phoneNumber;
	
	// 자바의 상수(constant variable)
	public static final int HELLO = 1;
	
	public Person() {		
		// 다른 생성자를 호출하는 구문이 존재한다면,
		// 이는 생성자 내에서 첫 번째 라인에 있어야 합니다.
		this("unknown", 0, "unknown","unknown","unknown");
		System.out.println("hello world");
	}

	public Person(String name, int age, String gender, String city, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	
	
}
