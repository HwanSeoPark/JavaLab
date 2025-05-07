package com.intheeast.Operators;

public class ShortCircuitingExample {

	public static void main(String[] args){
		int value1 = 1;
        int value2 = 2;
        // if문 블럭에서() 실행되야할 스테이먼트가 한개면 블럭{}을 생략할수있다
        
        // 논리 AND 연산 
        // And연산만 shortcircuiting 적용된다
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        
        
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
	
	
	
	
	}
}
