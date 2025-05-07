package com.intheeast.interfaces;

//인터페이스도 클래스처럼 슈퍼 인터페이스를 상속할 수 있습니다
// Top Level 중 한개
public interface Calculate {
// 특정 인터페이스 상속 가능
	
	public static final String HELLO = "Hello";	
	// 인스턴스 필드 x
	// 인터페이스에서의 필드는 static 필드만 가능
	
	// 가상 메서드 : 메서드 선언만!!! 즉, 바디가 없다!!!
	// -> 인터페이스 메서드라고도 부른다
	public int add(int a, int b);
	
	public int subtract(int a, int b);
	
	public int multiply (int a, int b);
	
	// 디폴트 메서드 : 메서드 정의
	public default void helloWorld3() {
		System.out.println("hello World");
	}

	// static 메서드 : 메서드 정의
	public static void helloWolrd4() {
		System.out.println("Hello World");
	}

	// 인터페이스 엑세스 마디파이어는 생략되어있으면 public 임!!!!!!!
}
