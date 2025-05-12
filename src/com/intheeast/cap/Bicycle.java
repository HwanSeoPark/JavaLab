package com.intheeast.cap;

public class Bicycle {

	// 다음 필드들은 외부에서 엑세스할 수 없도록, private 키워드를 적용
	// >>> 데이터 캡슐화(외부로부터...)
	private int cadence = 0; 
    private int speed = 0;
    private int gear = 1;
	
    // 파라미터 리스트가 없는 컨스트록터를 보통 디폴트 컨스트록터라 한다.
//    public Bicycle() {
//    	
//    }
    
    
    public Bicycle(int cadence) {
    	this.cadence = cadence;
    }

    
//    public Bicycle(int cadence, int speed) {
//    	this.cadence = cadence;
//    	this.speed = speed;
//    }
//
//    public Bicycle(int cadence, int speed, int gear) {
//    	this.cadence = cadence;
//    	this.speed = speed;
//    	this.gear = gear;
//    	
//    	
//    } // 복수의 컨스트럭터를 허용
    
    public Bicycle(int cadence, int speed) {
    	this(cadence);
    	this.speed = speed;
    }
    
    public Bicycle(int cadence, int speed, int gear) {
    	this(cadence, speed);
    	this.gear = gear;
    }
    
    // 외부에서 사용하는 목적에 따라
    // getters...
    public int getCadence() {
		return cadence;
	}
	
    public int getGear() {
		return gear;
	}
    
	public int getSpeed() {
		return speed;
	}
	
	// setters...
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	} 

    
    
    
    
    
}