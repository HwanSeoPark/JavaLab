package com.intheeast.Operators;

public class ConditionalDemo1 {
	
	 public static void main(String[] args){
	        int value1 = 1;
	        int value2 = 2;
	        
	        boolean isTrue; // true 또는 false
	        
	        // && 연산자 : 논리 AND 연산
	        // True AND True = True
	        // True AND False = False
	        // False AND False = False
	        if((value1 == 1) && (value2 == 2)) {
	            System.out.println("value1 is 1 AND value2 is 2");
	        }
	        
	        // || 연산자 : 논리 OR 연산
	        // True OR True = True
	        // True OR False = True
	        // False OR False = False
	        if((value1 == 1) || (value2 == 1)) {
	            System.out.println("value1 is 1 OR value2 is 1");
	        }    
	 }
}
