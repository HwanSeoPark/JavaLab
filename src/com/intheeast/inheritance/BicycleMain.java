package com.intheeast.inheritance;

public class BicycleMain {

	public static void main(String[] args) {
		
		SuperClass sc1 = new SuperClass();
		// ↓ clone이 절대 아니다!!!
		SuperClass copy = sc1;
		
		
		// "is a" 다음 statement는 성립
		Object obj = new MountainBike();
		
		// 하지만 다음과 같은 statement는 성립하지 않는다
		// MountainBike mb = obj;
		
		SuperClass sc = new SuperClass();
		obj = sc;

		// 정말 나쁜 코드... 
		// 하지만, 안전 장치를 장착[obj instanceof MountainBike]하면,,,
//		MountainBike mb = (MountainBike)obj;
//		mb.applyBrake(0);
	
		// obj가 MountainBike의 인스턴스인지 아닌지를 판별해줌.[instanceof 연산자]
		if (obj instanceof MountainBike) { // 의미 : obj가 저장하고 있는 참조 값이 MountainBike 클래스 객체 인스턴스에 대한 참조 값입니까?
			MountainBike mb = (MountainBike)obj;
		} else {
			System.out.println(sc);
		}
		
		
		
	}

}
