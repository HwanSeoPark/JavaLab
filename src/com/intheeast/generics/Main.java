package com.intheeast.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static {
		
		// List list = new ArrayList();	
		// List<String> list = new ArrayList<>();
		List list = new ArrayList(); // 자바에서는 이렇게 사용하지 마라 : raw type
		list.add("hello"); // String을 엘리먼트로...
		// ArrayList의 엘리먼트 하나임...add 한번했으니까
//		Integer intV = (Integer)list.get(0); // Type mismatch:
					                         // cannot convert from Object to Integer		
		// 런타임 오류 발생
		// java.lang.ClassCastException
		
		Object obj = new Integer(1); // is a 관계로 가능
		// 다음 statement중에 (String) 코드는 타입 캐스팅(형 변환)
		String str = (String)obj;

//		String str = (String)list.get(0);
		// get은 Object 클래스 인스턴스를 리턴함 	
	}

	static {
		
		List<String> list = new ArrayList<>();
		
	}
	
	public static void getObjectBox(Box box) {
	//	String str = (String)box.get();
		Double doubleV = (Double)box.get();
	
	}
	
	public static void setObjectBox(Box box) {
//		Integer intV = 10;  다른 타입을 get,set에서 전달하면 런타임 오류남
		Double doubleV = 10.0d;
		
		box.set(doubleV);
	}
	
	public static void main(String[] args) {
		// 다음 스테이트먼트의 <>안에 정의된 Integer를 타입 아규먼트라 함
		// 제너릭 클래스 인스턴스를 생성(new 연산자) 할 떄 타입 아규먼트를 지정
		// 텅빈 꺽쇠(타입 아규먼트를 지정하지 않음)를 일명 다이아몬드<> 라고 함
		// 타입 아규먼트 추론(Inference)
		Box<Integer> box = new Box<Integer>();
						// new Box<>(); 컴파일러가 타입 아규먼트를 추론함
		// Box<Integer> box -> 제너릭 클래스 인스턴스를 참조하는 참조변수
		// new Box<>() 제너릭 클래스 참조변수를 만드는 메서드
		setObjectBox(box);
		getObjectBox(box);
		
		// Pair로 받을수 있는 이유는 추상화
		Pair<String, Double> pair1 = 
				new OrderedPair<String, Double>("Hello", 3.13d);
							// fm은 타입 아규먼트를 써야한다
		Pair<Integer, Integer> pair2 = 
				new OrderedPair<>(1, 1); 
		
		Box<String> box2 = new Box<>();
		// Pair의 첫번째 타입 아규먼트는?
		// : 제너릭 Box 클래스의 타입 아규먼트
		Pair<Box<String>, String> pair3 = 
				new OrderedPair<>(box2, "Hello");
	}

}
