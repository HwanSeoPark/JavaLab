package com.intheeast.classes.nestedclass.impl;

import com.intheeast.interfaces.Calculate;

// NewImplCalculate 클래스 바이트 코드가 어느 시점에 필요에 의해
// 자바 가상 머신에 의해 메모리 로드되고,,, 이 클래스 객체가 만들어 지고 난 후에,
// HELLO 스태틱 필드(현재 public)를 어디에서든지 사용가능함...
// where? 자바 가상 머신에 의해 메모리 로드된 다른 클래스들에 의해 사용 가능함.
// 만약에, 더 이상 NewImplCalculate 클래스 코드가 필요 없는 시점,
// 이 시점에 자바 가상 머신은 가비지 컬렉션을 수행해서 이 클래스를 삭제되기 전까지,
// 사용할 수 있다.
public class NewImplHelloWorld implements Calculate {
	
	public static final String HELLO = "Hello";
	
	private int addResult;
	private int subResult;
	private int mulResult;
	
	public NewImplHelloWorld() {}
	
	public int getAddResult() {
		return addResult;
	}

	public int getSubResult() {
		return subResult;
	}

	public int getMulResult() {
		return mulResult;
	}

	public int add(int a, int b) {
		int addResult = a + b;
		System.out.println("덧셈 결과는 " + addResult);
		return addResult;
	}

	public int subtract(int a, int b) {
		int subResult = a - b;
		System.out.println("뺄셈 결과는 " + subResult);
		return subResult;
	}


	public int multiply(int a, int b) {
		int mulResult = a * b;
		System.out.println("곱셈 결과는 " + mulResult);
		return mulResult;
	}


}
