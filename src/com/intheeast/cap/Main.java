package com.intheeast.cap;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다음 Bicycle() 식은 디폴트 컨스트럭터를 호출하는 것임.
		// 클래스 객체를 생성하는 문법은 다음과 같이 new 키워드 다음에,
		// 클래스 컨스트럭터를 호출하는 것
		Bicycle bicycle = new Bicycle(1,2,3); 
		
		// Getters를 사용해서 캡슐화 상태의 Bicycle 클래스 객체의 인스턴스 필드값을 얻어옴
		int cadence = bicycle.getCadence();
		int speed = bicycle.getSpeed();
		int gear = bicycle.getGear();
	
		cadence = cadence + 1;
		speed = speed + 1;
		gear = gear + 1;
		
		bicycle.setCadence(cadence);
		bicycle.setSpeed(speed);
		bicycle.setGear(gear);
	}

}
