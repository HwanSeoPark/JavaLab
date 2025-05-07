package com.intheeast.classes.lambda;

// 함수형(Functional) 인터페이스 : 가상 메서드가 1개인 인터페이스 
public interface OnlyOneAMethodInterface {

//	public int add(int a, int b);
//		int temp = a + b;
//		int ret = temp / 2;
//		return ret; 이걸 람다식으로
//	 OnlyOneAMethodInterface ooi = (a, b) -> (a + b)/2
//	 OnlyOneAMethodInterface ooi = (a, b) -> { 
//    								int temp = a + b;
//	 							    int ret =  temp / 2;
//	  								return ret;
//   							   }; 	
			   	
//	public String concate(String a, String b);
	// 람다식 만들면
	// OnlyOneAMethodInterface ooi = (a,b) -> a + b;
	
	// abstract class에서 추상 메서드를 선언...
	// abstract 클래스를 상속한 sub 클래스에서 추상 메서드의 바디를 구현...
	// 
	
	// JVM 입장에서는 이러한 인터페이스의 추상 메서드를 가상 메서드로 여긴다.
	// 가상 메서드, 공식 문서에는 추상 메서드
	public /*abstract*/ void check(); // 이 인터페이스에서 가상 메서드 선언 오로지 하나!!
		// default로 선언되어있다		  // 바디가 없는걸 가상 메서드라 한다
	    // 대부분 가상 메서드 선언시에, abstract를 생략함.
	public default void iamDefaultMethod() {
		System.out.println("i'am default method");
	}
	
	public static void iamStaticMethod() {
		System.out.println("i'am static method");
	}
}
