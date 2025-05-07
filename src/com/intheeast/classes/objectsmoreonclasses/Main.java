package com.intheeast.classes.objectsmoreonclasses;

import com.intheeast.classes.Bicycle;

// public : access modifier
public class Main {	
	
	static { // static {} 스테틱 블록
		System.out.println("Exec static statement of Main");
		}
	{ //인스턴스 블록
		System.out.println("Instance Block");
	}
	
	
	// 디폴트로 0이라는 값으로 설정된다. 
	int gear; // 최초의 필드...

	// Bicycle 클래스 객체의 인스턴스를 생성한 것이 아니라,
	// Bicycle 클래스 객체의 인스턴스에 대한 참조값을 대입할 수 있는 
	// 엘리먼트를 10개 가진 배열을 만든 것일뿐...
	public static Bicycle[] bicycles = new Bicycle[10];
	
	public static void makeBicycle() {
		
		for (int i=0; i<Main.bicycles.length; i++) {
			Main.bicycles[i] = new Bicycle(); // Bicycle 클래스 객체의 인스턴스를 생성
		}
		
	}
	
	// JVM이 호출한다..
	public static void main(String[] args) {
		
		Main.makeBicycle();
		
		
		for (String arg : args) {
			if (arg.equals("exit")) // (arg == "exit") 잘못된 코드
				return ;
		}
		
		System.out.println("+Main:main");
		
		int world = Person.HELLO;
		
		Person sung = new Person(); // 
		Person lee = new Person(
				"taehum",
				31,
				"Man",
				"daegu",
				"0102223333"
				);
		//lee.
		Person Kim = null; // 일부로 오류를 내는 코드
		Kim.getName(); // NullPointerException...			
	
		
		// Object method
		String name = lee.getName();
		
		// Class static Method
		Person.helloWorld(); // console에 hello world 호출
				
		System.out.println("-Main:main");		
		
		return ;
		
		// 아래 statement 코드는 신택스 에러(컴파일 에러)
		//System.arraycopy(lee, world, name, world, world);
		}
	
}


