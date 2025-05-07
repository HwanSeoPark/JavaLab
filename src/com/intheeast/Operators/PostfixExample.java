package com.intheeast.Operators;

public class PostfixExample {
    
	// Syntactic sugar 연산자 : ++, --
	// ++ (후위 증가(1씩) 연산자)
	// -- (후위 감소(1씩) 연산자)
	public static void main(String[] args) {
        int a = 10;
        int b = a++;  // b는 10이 되고, a는 11이 됩니다.
//        int b = a; // a의 값을 먼저 b에 대입한다. : 원래 값으로 평가한다
//        a = a + 1; // 그런 후[Postfix]에, a의 값을 1 증가함. 그래서 후위 증가라고 함.
        
        int c = 10;
        int d = c--;  // d는 10이 되고, c는 9가 됩니다.
//        int d = c;
//        c = c - 1;
        	
        
        
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("c: " + c + ", d: " + d);
    }
}