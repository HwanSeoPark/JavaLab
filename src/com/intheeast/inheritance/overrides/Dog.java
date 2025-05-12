package com.intheeast.inheritance.overrides;

public class Dog extends Animal {

	// 메서드를 재정의 (override)
	// 오버라이드 어노테이션 등장..역할 : 부모 클래스로부터 상속받은, 
	//                           예를 들어 Animal 클래스의 speak 메서드를 재정의 하겠다
	//                           라는 의미!!!
	// "충분히 유사한 기본 동작(close enough)"을 바탕으로
	// : 슈퍼클래스의 speak 메서드와 충분히 유사한 기본 동작을 바탕으로,
	//   Dog 클래스의 speak 메서드에 필요에 따라 동작을 구체화하거나 변경할 수 있다.
	@Override 
    public Dog speak() { 
		// 이 메서드의 리턴타입이 Animal(부모) 클래스와는 다르다
		// Covariant(공변) 리턴 타입
		
		super.speak(); // Animal 클래스의 speak매서드 호출함.
		
        String MungMung = "멍멍";
		System.out.println("Dog barks:" + MungMung);
        return this;
    }
}
