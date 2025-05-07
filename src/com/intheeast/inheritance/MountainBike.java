package com.intheeast.inheritance;

// Implicit super constructor Bicycle() is undefined for default constructor. 
// Must define an explicit constructor
public class MountainBike extends Bicycle {

	// sub class는 super class의 private멤버를 상속 받지 않는다.
	// private 멤버는 같은 class 내에서만 사용가능함
	// 어찌 보면 sub class도 super class의 외부 클래스다
	private int a;
	private int b;
	
	public int cadence;
	
	//////////////////////////////////////
	// sub class는 자신의 컨스트럭터라 호출될 때,
	// 무조건 부모 클래스의 디폴트 컨스트럭터가 호출됨!!!
	////////////////////////////////////////
		
	// explicit, 명시적으로 디폴트 컨스트럭터를 정의 하는 습관 들이기!!!!
	public MountainBike() {}
	
	public MountainBike(int startCadence, int startSpeed, int startGear,
			int a, int b) {
		super(startCadence, startSpeed, startGear);
		this.a = a;
		this.b = b;
		super.cadence = 1;
	// 부모 클래스와 동일한 필드를 만들었을 때 부모 클래스의 필드로 적용하는 방법
	// super 키워드
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
		super.cadence = cadence;
	}

	public static void main(String... args) {
		MountainBike mountainBike = new MountainBike(1,2,3,4,5);
		
		mountainBike.cadence = 1;
		
		mountainBike.applyBrake(0);
		
		return;
	}
}
