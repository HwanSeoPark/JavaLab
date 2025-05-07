package com.intheeast.interfaces;

public interface Interface1 {
	
	// 자바에서 공식적으로 추상 메서드... : 추상 메서드 개념은 C++에서 가지고 옴...
	// 							   C++에는 인터페이스라는 개념이 없음.
	//                             자베에서 C++의 추상 개념을 가지고 와서 사용하고 있음.
	//							   이 추상 개념은 추상 클래스임...
	public /*abstract*/Integer interfaceMethod1 (Integer a, Integer b);
	
	public String interfaceMethod2 (String a, String b);
}
