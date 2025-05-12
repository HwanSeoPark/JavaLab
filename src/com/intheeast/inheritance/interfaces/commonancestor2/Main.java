package com.intheeast.inheritance.interfaces.commonancestor2;

public class Main {

	public void noInheritanceStaticMethodOfInterface() {
		SuperInterface.helloWorld();
		// 인터페이스의 정적 메서드는 상속되지 않습니다.
		// : SuperInterface의 helloWorld 메서드는
		// SubInterface에게 상속되지 않았음
//		SubInterface. // <- 멤버 엑세스 연산자를 써도 helloWorld가 없는것을 확인
		SubInterface.goodBye();
	}
	
	public void iamInstaceMethod() {
		// 다음과 같이 해당 인터페이스의 디폴트 메서드는
		// 구현체 외부에서는 사용할 수 없음		
//		FlyCar.super.startEngine();
//	    OperateCar.super.startEngine();
		
	}
	
	public static void main(String... args) {
		// 다음과 같이 해당 인터페이스의 디폴트 메서드는
		// 구현체 외부에서는 사용할 수 없음	
//		FlyCar.super.startEngine();
//	    OperateCar.super.startEngine();

		FlyingCar flyingCar = new FlyingCar();
	    flyingCar.startEngine();
	}
}
