package com.intheeast.classes;

public class Bicycle2 {
	
	public int cadence;
    public int gear;
    public int speed;
	
    public Bicycle2() {}
    
    public Bicycle2(int cadence) {
    	this.cadence = cadence;
    }
    
    public Bicycle2(int cadence, int gear) {
    	this(cadence);
    	this.gear = gear ;
    }
    
    public Bicycle2(int cadence, int gear, int speed) {
    	this(cadence, gear);
    	this.speed = speed ;
    }
}