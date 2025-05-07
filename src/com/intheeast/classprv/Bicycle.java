package com.intheeast.classprv;

public class Bicycle {

	private int cadence = 0; 
    private int speed = 0;
    private int gear = 1; // cadence, speed, gear 은 class 필드 변수

    public static int count; // count는 class(static) 필드
    
    // Class(static) Method
    public static void changeCadenceStaticVersion(int countValue) {
    	Bicycle.count = countValue;
   }
    
    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;  
         // speed+increment인 expression을 먼저 시행후 speed(class 필드변수)에 값을 저장
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
