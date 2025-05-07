package com.intheeast.classes;

import java.awt.*;


// Implicit super constructor Bicycle() is undefined for default constructor. 
// Must define an explicit constructor
// 부모 클래스에 default constructor이 없을 시 생기는 오류
// 아니면 이 클래스 안에 컨스트럭터를 생성하면 해결
public class MountainBike extends Bicycle implements HelloWorldInterface{
						// 클래스 만들 때 부모 클래스를 정하면 extends(상속)이 생김
						// 상속은 재사용성을 위해서 사용
	
	{// 코드 블록
		
	}
	Point point;
	Polygon polygon;
	// MountainBike 하위 클래스는 하나의 필드를 가집니다.
    public int seatHeight;

    // MountainBike 하위 클래스는 하나의 생성자를 가집니다.
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
    	
    	// 자식 클래스가 부모 클래스의 생성자(컨스트럭터)를 상속받지 않습니다.
    	// 하지만 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자를 호출할 수 있습니다
////////////////////////////////////////////////////////////        
    	super(startCadence, startSpeed, startGear); // 부모의 컨스트럭터를 호출
////////////////////////////////////////////////////////////       
        seatHeight = startHeight;
        
       
        
    }   
        
    // MountainBike 하위 클래스는 하나의 메서드를 가집니다.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

    // @Override
    public void helloWorld() {
    	System.out.println("MountainBike HelloWolrd Method!!!");
    }

  
}

