package com.intheeast.Operators;

public class UnaryExample {

	public static void main(String[] args) {
		
		int a = 5, b = 10, c = 0;
        boolean x = true, y = false;
		
        // 전위 증감 연산자[prefix]
//       ++a; // a = a + 1;
        int preA = ++a; // 값을 증가시키고, 그 결과를 리턴함..(=) 연산자에게
//      a = a + 1;    // 전위 증감 : a의 값을 먼저 1 증가 시킨 후
//      int preA = a; //          preA 변수에 대입한다.
           
        int preB = --b; // 전위 감소
//		b = b - 1;
//	    int preB = b
        
        int positive = +preA; // + 연산자가 적용된 피연산자의 값을 양수로 만듦
        int negative = -preB; // - 연산자가 적용된 피연산자의 값을 음수로 만듦
        int bitwiseNot = ~preA; // ~ : 비트와이즈 반전 연산자 
        boolean logicalNot = !x; // ! : 논리 부정 연산자 
                                 // x = true지만 반전해서 false
        System.out.println("unary: ++a = " + preA + ", --b = " + preB + ", +a = " + positive + ", -b = " + negative + ", ~a = " + bitwiseNot + ", !x = " + logicalNot);
		
	}
}
