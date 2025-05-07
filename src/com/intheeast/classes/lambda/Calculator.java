package com.intheeast.classes.lambda;

import java.util.function.Function;

public class Calculator {

	 interface IntegerMath {
	        int operation(int a, int b);   
	    }
	 
	    // IntegerMath addition = (a, b) -> a + b;
	 	// IntegerMath op = (a, b) -> a + b; 
	    public int operateBinary(int a, int b, IntegerMath op) {
	        return op.operation(a, b);
	    }
	 
	    public static void main(String... args) {
	    	
	    	          
	        Calculator myApp = new Calculator();
	        // interface의 참조 변수
	        IntegerMath addition = (a, b) -> a + b;
	        IntegerMath subtraction = (a, b) -> a - b;
	        IntegerMath muliply = (a, b) -> a * b;
	        IntegerMath divider = (int a, int b) -> a / b;
	        
	    //  Function<String, String> {
        //		String apply(String t);
	        Function<String, String> toUpper = (String s) -> {
	        	String ret = s.toUpperCase(); // default locale(기본 로케일)은 영어
	        	return ret;
	        };
	        
	        
	        System.out.println("40 + 2 = " +
	         // myApp.operateBinary(40, 2, addition));
	        	myApp.operateBinary(40, 2, (a, b) -> a + b)
	        );
	        System.out.println("20 - 10 = " +
	         // myApp.operateBinary(20, 10, subtraction));
	            myApp.operateBinary(20, 10, (a, b) -> a -b )
	        );
	        System.out.println("20 * 10 = " +
		    //  myApp.operateBinary(20, 10, muliply ));
	        	myApp.operateBinary(20, 10, (a, b) -> a * b)
	        );
	        // 람다식의 특징... 
	        System.out.println("20 / 10 = " +
		        myApp.operateBinary(20, 10, (a, b) -> a / b));
	        
	    
	    }
}
