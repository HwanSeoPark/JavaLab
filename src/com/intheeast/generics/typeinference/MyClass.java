package com.intheeast.generics.typeinference;

public class MyClass<X> {

	private X x;

//	<T> MyClass(T t) {
//		System.out.println(t);
//		
//	}

	<T extends X> MyClass(T t) {
		System.out.println(t);
		this.x = t;
	}
	
	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		int a = 3;
		Integer aN = 3; // 컴파일때 Integer.ValueOf(3)
		
		MyClass<Number> myClass = new MyClass<>(3); // AutoBoxing.. Integer 인스턴스
											// 제너릭은 프리미티브 데이터 타입을 못쓰는데 정수3을 씀
										    // AutoBoxing
		myClass.setX(1);
		System.out.println(myClass.getX());
		
		return;
	}
	
	
// MyClass의 인스턴스를 만드세요
// 단, 제너릭 생성자의 타입 아규먼트<T>와
// 제너릭 클래스의 타입 아규먼트<X>는 서로 달라야함

	
	
}