package com.intheeast.inheritance.Polymorphism.clone;

public class Person implements Cloneable{

	private int age;
	private Address address;
	
	public Person() {}
	
	public Person(Address address) {
		this.setAge(10);
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();	// shallow clone
		
		Person personClone = (Person)super.clone();
		
		// deep clone를 위해 Address 객체도 복제
		Object obj = address.clone(); /*person.getAddress()*/
		personClone.setAddress((Address)obj);
		return personClone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
//	public Object copy() throws CloneNotSupportedException {
//		return this.clone();
//	}
	
	
}
