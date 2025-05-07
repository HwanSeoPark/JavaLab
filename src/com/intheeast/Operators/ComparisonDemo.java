package com.intheeast.Operators;

public class ComparisonDemo {
	
	public static void main(String[] args){
      
		int value1 = 1;
        int value2 = 2;
        
        // if 구문이... if
        // if 다음에 오는 (조건식)
        // 이 (조건식) expression : 값을 만든다.. 이 값이 true일때
        // {} <-- block
        // 조건식이 ture일때 블럭 안에 있는 실행 스테이트먼트가 실행될수 있다.
        // 조건식의 연산자의 연산 결과는 true 아니면 false
        
        // == 연산자는 왼쪽 피연산자의 값과 오른쪽 피연산자의 값이 동일한지를(동등 연산자) 비교하는 연산자
        //    동일하다면, true 라는 값을 만들고,
        //    동일하지 않다면, false 라는 값을 만드는 expression!!
        if(value1 == value2) {
        	// if 문의 블럭에 있는 statement가 수행되기 위한 조건...
        	// : 비교 조건식이 true 값을 만들어야만 함
            System.out.println("value1 == value2");
        }
        
        // != : 피연산자 값을 비교시 값이 다르다
        // 두 피연산자의 값이 다르다면 true
        if(value1 != value2) {
            System.out.println("value1 != value2");
        }
        
        // > : 왼쪽 피연산자 값이 오른쪽 연산자 값 보다 크다
        // 왼쪽이 크면 true
        if(value1 > value2) {
            System.out.println("value1 > value2");
        }
        
        // < : 오른쪽 피연산자 값이 왼쪽 피연산자 값 보다 크다
        // 오른쪽이 크면 true
        if(value1 < value2) {
            System.out.println("value1 < value2");
        }
        
        // <= : 으론쪽 피연산자 값이 왼쪽 피연산자 값이랑 같거나 크다(이상,이하)
        // 오른쪽 피연산자 값이 왼쪽값이랑 같거나 크면 true
        if(value1 <= value2) {
            System.out.println("value1 <= value2");
        }
	}    
}
