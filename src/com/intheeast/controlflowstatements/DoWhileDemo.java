package com.intheeast.controlflowstatements;

public class DoWhileDemo {

	public static void main(String[] args){
        int count = 11;
        int a = 0;
        
        do {      	
       // 	int a = 1; // int a는 다른 블록안에서 선언해서 다른 int a지만
        			   // 자바에서는 다른 불록이라도 
        	           // 지역변수를 동일한 변수명 쓰는 것을 허용해 주지 않는다.
        	int doVariable = 0;
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11); // 첫번째 반복시에 while 조건식 값이 
        					  // false 이더라도
        					  // 한번은,,, do..while 블럭의 스테이트먼트가 수행됨

        return;
        //	doVariable = 10;
	}
}
