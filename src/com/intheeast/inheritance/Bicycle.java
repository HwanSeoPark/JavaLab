package com.intheeast.inheritance;

public class Bicycle {

	// the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
   
    // default constructor가 왜 없는가?..
    // : 컨스트럭터를 정의했기 떄문에,
    //   컴파일러는 디폴트 생성자를 만들어 주지 않는다
    //   컴파일 타임 때,,, 바이트 코드로...
    
    public Bicycle() {}
    
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
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
}
