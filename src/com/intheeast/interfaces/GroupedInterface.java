package com.intheeast.interfaces;


// 자바에서는 상속(inheritance)을 확장(extend)이라는 개념으로 부른다... 왜? ...
public interface GroupedInterface extends Interface1, Interface2, Interface3 {

	// defautl로 이렇게 붙어있음
	/*public static fianl*/double E = 2.718282; 
	// 이 필드는 GroupedInterface 인터페이스를 구현했을 때만 사용할 수 있음.
	
	// 멤버 레벨에서 사용할 수 있는 엑세스 제어자는 public, private
	public default void helloWorld() {
		 System.out.println("Hello World");
	}
	
	// default로 package- private이 아님!!!
	// default로 public임!!!
	public static void goodBye() {
		System.out.println("Good Bye");
	}
	
}
