package com.intheeast.classes;

// 암시적으로 Object 클래스를 상속... extends 보이지 않지만, 
// 디폴트로 Object 클래스를 상속함
// 컨스트럭터는 상속받지 못함
// : 암시적[implicit]으로 Object라는 슈퍼클래스
public class Bicycle /*extends Object*/ {

	// 자전거 클래스는 세 개의 필드를 가집니다.
    public int cadence;
    public int gear;
    public int speed;
    private int id;   
    // 다음의 클래스 변수(static 필드)는
    // 모든 Bicycle 클래스 객체의 인스턴스들에게 공유됨
    private static int numberOfBicycles = 0;
    
    {
    	System.out.println("Instance Block");
    }
    
    
    // default constructors가 없는것이
    // Bicycle 믈래스를 상속한 클래스에게 문제가 될 수 있음.
    public Bicycle() {} // 항상 디폴트 컨스트럭터를 쓰는 습관 들이기
    
    // 자전거 클래스는 하나의 생성자를 가집니다.
    public Bicycle(int cadence, int gear, int speed) {
    //	super(); // Object 클래스의 디폴트 컨스트록터를 호출
    	this.cadence = cadence;
    	this.gear = gear;
        this.speed = speed;
        
        
    System.out.println("Bicycle Constructor!!!");   
        
        // prefix 연산자 : ++
        id = ++numberOfBicycles; // 이렇게 id 값을 할당하지 않음
        						 // 단지, 학습을 위해 심플하게 id 할당코드를 적용
    }
        
    // 자전거 클래스는 네 개의 메서드를 가집니다.
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
    
    public static void setNumberOfBicycles(int numberOfBicycles) {
		Bicycle.numberOfBicycles = numberOfBicycles;
	}

	public Bicycle seeWhosFastest() { // 리턴 값이 참조 값 Bicycle		
    	Bicycle fastest;

    	Number number;
    	  	
		fastest = new Bicycle();

		
		
		// 이전까지 수업 내용들은 기본 데이터 타입의 리턴값을 리턴했는데,
		// 이번에는 참조값을 리턴한다
		return fastest;
    }

    public int getID() {
        return id;
    }

}
// stub method 알아두기
