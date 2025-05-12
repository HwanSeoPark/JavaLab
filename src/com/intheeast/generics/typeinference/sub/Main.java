package com.intheeast.generics.typeinference.sub;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static {
		
	}
	
	
	
	// 절대 권하지 않는 raw type 방법
	public static List process(List list) {
		Object obj = "Hello";
		list.add(obj);
		return list;
	}
	

//	public static <T> List<T> process(List<T> list) {
////		Object obj = "Hello";
////		list.add(obj); // 문제가 발생함...
//		if(list.isEmpty()) {
//			System.out.println("Empty list..,");
//		}	
//		return list;
//	}
	
	public static void main(String[] args) {
        // ArrayList의 타입 아규먼트를 추론할 수 없음...
		// var는 기본데이터 타입(int, double...)과 
		// 참조 타입(String, class 또는 interface) 모두 사용할 수 있음
		var result = process(new ArrayList<>()); // 이런 방식의 코드는 좋지 않다
		
		// 일반적인 사용: T와 같은 타입 전달
		Box<String> stringBox = new Box<>("Hello");
		System.out.println(stringBox);
	
		
		// 제너릭 생성자 사용: U → T로 변환
		// T convert(U input); <-- Converter의 가상 메서드
		// 메서드 참조도 인터페이스 구현체이다!!!
		// 다음 Box 컨스트럭터의 두번째 아규먼트는 Converter 인터페이스 구현체를 전달해야함
		
		// T argument : Integer
		// U argument : String
		// <U> Box(U input, Converter<U, T> converter)
		// T convert(U input);
		// T is int (AutoBoxing) -> Integer
		// U is String
		
		// 제너릭 클래스 Box를 인스턴스화하는 코드
		// T 파라미터의 아규먼트 : Integer <- 참조변수[Box<Integer> intBox]의 
	    //                              파라미터화된 데이터 타입[[Box<Integer>]의 아규먼트롤 보고
		// U 파라미터의 아규먼트 : String <- "123"을 보고 Box의 생성자를 보고 추론
		// T convert(U input);
		Box<Integer> intBox = 
				new Box<>("123", Integer::parseInt);
		// 제너릭 생성자 U의 타입 아규먼트는? Integer
//		public <U> Box(U input, Converter<U, T> converter) {
//	        this.value = converter.convert(input);
//	    }
		System.out.println(intBox);
		
		// 제너릭 생성자 사용: Double → String
		// Box, T : String
		// Constructor, U : Double
		// T convert(U input);
		Box<String> doubleToStringBox = new Box<>(3.14, Object::toString);
		System.out.println(doubleToStringBox);
	    }
}
