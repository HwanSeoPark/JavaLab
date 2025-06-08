package com.intheeast.utilities;

import java.util.Random;

public class Utility {
	
	public static final long CADENCE_MIN = 1;
	public static final long CADENCE_MAX = 1000;
	
	public static final long GEAR_MIN = 1;
	public static final long GEAR_MAX = 13;
	
	public static final long SPEED_MIN = 1;
	public static final long SPEED_MAX = 100;

	public static int makeCadenceRandom() {
		return makeRandomNumber(CADENCE_MIN, CADENCE_MAX);
	}
	
	public static int makeGearRandom() {
		return makeRandomNumber(GEAR_MIN, GEAR_MAX);
	}
	
	public static int makeSpeedRandom() {
		return makeRandomNumber(SPEED_MIN, SPEED_MAX);
	}
	
	private static int makeRandomNumber(Long min, Long max) {
		Long minValue = Long.valueOf(min);
    	Long maxValue = Long.valueOf(max);

    	Random random = new Random();
    
    	Long randomNumber = random.nextLong(maxValue - minValue + 1) + minValue;

    	return randomNumber.intValue();
	}
	
	private static void emptyMethod() {
		// stub method
		if (true) {
			System.out.println("hello world");
		}
		
		int path = 1000;
		switch(path) {
		case 1:
			// ...
			break;
		case 2:
			break;
		default:
			// ...
			break;
		}
		
		do {
			
		} while(true);
		
		
	}

}
