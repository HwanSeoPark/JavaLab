package com.intheeast.inheritance.interfaces.commonancestor2;

public class FlyingCar implements FlyCar, OperateCar {

	// 구현체 인스턴스 메서드안에서 다음과 같이 디폴트 메서드를 사용할 수 있음.
    public int startEngine() {

    	// 인터페이스명.super.디폴트메서드명
    	// 이런 코드는 이 메서드 안에서만 사용 가능하다. startEngine() 메서드
    	FlyCar.super.startEngine();
        OperateCar.super.startEngine();

        return 0;
    }
}
