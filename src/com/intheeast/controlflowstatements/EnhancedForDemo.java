package com.intheeast.controlflowstatements;
import java.util.ArrayList;

public class EnhancedForDemo {
	
	public static void exampleForEachIterable() {	
		
		ArrayList<String> futureMonths = 
        		new ArrayList<String>();
		
    	futureMonths.add("January");    
    	futureMonths.add("February");    
    	futureMonths.add("March");     
    	futureMonths.add("April");
    	futureMonths.add("May");
    	futureMonths.add("June");
    	futureMonths.add("July");
    	futureMonths.add("August");            	
    	futureMonths.add("September");
    	futureMonths.add("October");
    	futureMonths.add("November");
    	futureMonths.add("December"); 
    	
    	for (String string : futureMonths) {
    		System.out.println(string);
    	}
	}
	
    public static void main(String[] args){
    	
    	Object obj;
    	
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         
         // 자바 컴파일러가 배열에 대한 for-each 문을 내부적으로 
         // for (int i = 0; i < arr.length; i++) 형태로 변환
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
         
         // numbers에 위치하는 것?은 Iterable 인터페이스를 구현한
         // 구체(클래스)만 올 수 있다.
         EnhancedForDemo.exampleForEachIterable();
    }

}