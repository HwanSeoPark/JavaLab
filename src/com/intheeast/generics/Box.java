package com.intheeast.generics;

// T를 타입 파라미터라고 한다.
public class Box<T> {

	// 컴파일러가 컴파일 타임 때, 타입 검사를 실시 
	// ex) 타입 파라미터가 Integer일경우 
	// private Integer object; <- Integer라고 컴파일함
	private T object; // object를 타입 변수

	public void set(T object) { this.object = object; }
	public T get() { return object; }
	
	// 제너릭 메서드
	// 타입 파라미터 <T extends Number>이 return 값 byte 앞에만 오면 된다
	// 여기의 T는 Box<T>제너릭 클래스의 T와는 다른 T다
	// 여기서 hello(T t)의 T t는 타입변수다
	public static <T extends Number> byte hello(T t) {
	// <T extends Number> 타입 파라미터의 상한 제한 
	// -> Number를 포함해서 Number를 상속한 클래스의 인스턴스 참조값만 올수 있다.	
		return t.byteValue();
	}
	
}
