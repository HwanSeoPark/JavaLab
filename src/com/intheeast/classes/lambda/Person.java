package com.intheeast.classes.lambda;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

	public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    String state;

    public Person(String name, 
    		int year,
    		int month,
    		int day,
    		Sex gender,
    		String emailAddress,
    		String state) {

    	// Helper 클래스의 특정 컨스트럭터를 이전에 지원하였지만,
    	// Helper 클래스의 컨스트럭터를 직접 제공하는 것이 적합하지 않다고 생각에,
    	// 현재 of 라는 스테틱 메서드로 JDK Helper 또는 Utility 클래스의 인스턴스 만들 수 있도록,
    	// 지원하고 있음.
//    	birthday = LocalDate(year, month, day);
    			 // 예전 에는 위에 처럼 작성 가능했다.
    	birthday = LocalDate.of(year, month, day);
    	// JDK의 Helper 또는 Utility 클래스들은...
    	// 대부분 어떤 형식으로 작성되었는가?
    	// 필드는 거의 없고 메서드는 거의 대부분 static 메서드로 구성됨
    	// : 인스턴스를 만들지 않고 사용함.
    	// 그런데 LocalData와 같은 JDK의 헬퍼 또는 유틸리티 클래스(API)는 인스턴스를 대부분 만들어서 사용
    	// 이런 클래스들은 인스턴스할 때 이 클래스들의 컨스트럭터를 직접 호출하지 않고
    	// of 라는 이름의 static 메서드를 통해 인스턴스를 만든다.    	
    	this.name = name;
    	this.gender = gender;
    	this.emailAddress = emailAddress;
    	this.state = state; 
    	
    	getData(birthday);
    }
    
    private void getData(LocalDate birthday) {
    	int dayOfMonth = birthday.getDayOfMonth();
    	DayOfWeek dayOfWeek = birthday.getDayOfWeek();       
    	Month month = birthday.getMonth();
    	int year = birthday.getYear();    	
    	
    	LocalDate today = LocalDate.now();
    	dayOfWeek = today.getDayOfWeek();
    	dayOfWeek = today.getDayOfWeek();
    	month = today.getMonth();
    	year = today.getYear();
    	
    	return;
    }
    
    
    
    public int getAge() {
        // ...
    	LocalDate today = LocalDate.now();
    	
    		   // 나이 계산 : today - birthday
    		   // 2025/04/17 - 1975/03/05
    		   // 1978/03/05 ~ 2025/04/16 결국 이 사이의 기간을 알려준다
//    	Period temp = Period.between(birthday, today);
//    	int age = temp.getYears();
    	// 위에 쓰인 코드랑 같다
//    	int age = Period.between(birthday, today).getYears();
    	Period period = Period.between(birthday, today);
    	int age = period.getYears();
    	int days = period.getDays();
    	int xxx = period.getMonths();    	
    	return age;
    	
    }

    public void printPerson() {
        // ...
    	System.out.printf("Name:%s birthday:%d%s%d \r\n",
    			name,
    			birthday.getDayOfMonth(),
    			birthday.getMonth(),
    			birthday.getYear() );
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static List<Person> createRoster() {
		
		// 자바의 추상화 개념!!
		// 느슨한 결합
		// persons 참조 변수는 List인터페이스를 구현한 구현체(클래스, 람다식)의 인스턴스의 참조값을 저장한다.
/*Array*/List<Person> persons =
 /*  Iterable<Person> persons = */
		// ArrayList가 List를 구현했고
		// List 인터페이스는 결과적으로
		// Collection 인터페이스를 상속했고
		// Colletcion은 Iterable 인터페이스를
		// 상속했기 때문에 가능
			new ArrayList<>();
		


		Person person1 = new Person("John",
				2013,
				10,
				9,
				Sex.MALE,
				"AAA@gmail.com",
				"Alabama");
		
		Person person2 = new Person("Bob",
				2002,
				4,
				7,
				Sex.MALE,
				"BBB@gmail.com",
				"Minnesota");
		
		Person person3 = new Person("Tom",
				2003,
				11,
				18,
				Sex.MALE,
				"CCC@gmail.com",
				"Florida");
		
		Person person4 = new Person("Kris",
				2005,
				7,
				7,
				Sex.MALE,
				"DDD@gmail.com",
				"Newyork");
		
		Person person5 = new Person("Joe",
				2001,
				8,
				5,
				Sex.MALE,
				"FFF@gmail.com",
				"Arizona");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		
		int age = person1.getAge();
		
		return persons;
	}

	
    
    
}
