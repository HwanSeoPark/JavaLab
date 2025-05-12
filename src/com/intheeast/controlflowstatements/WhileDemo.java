package com.intheeast.controlflowstatements;

public class WhileDemo {

	public static void main(String[] args){
        int loopingCount = 1; // for 구문에서 int i = 1;
       
        // while(expression)의 조건식이 true 이면
        // while 블럭의 Statement(s)들을 수행한다.
        // 언제까지? while(expression)의 조건식이 true이면 계속해서
        // while 블럭의 statement(s)들을 수행한다.
        while (loopingCount < 11)/* for 구문에서 i<11;*/ {
        	// true or false	
        	
        	System.out.println("Count is: " + loopingCount);
            
        	loopingCount++; // for 구문에서 i++
        }
        // while 조건식의 값이 false가 되면,
        // while 블럭의 next statement로 실행 순서가 이루어진다.
         
        // 단축키 : sysout 입력후 컨트롤 스페이스
        System.out.println();
    }
}
