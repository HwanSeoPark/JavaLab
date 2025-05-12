package com.intheeast.Operators;

public class TernaryExample {
	public static void main(String[] args) {
		int a = 5, b = 10, c = 0;
	    // ternary  ? :
		// (a > b) : ()안에서 사용되는 expression은 true 또는 false 값을 만듦.
		// (...) : ()안에 ... expression의 값이,
		// 		   1. true 이면(?),
		//	         -> ? X : Y ----> ':' 기준으로 왼쪽에 있는 X가 선택된다
		//         2. false 이면(?),
		//           -> ? X : Y ----> ':' 기준으로 오른쪽에 있는 Y가 선택된다.
		int ternary = (a > b) ? a : b;
		
		// 쓸수 있는 코드지만 이렇게 쓰지 않는다
		int ternary2 = (true) ? a : b;
	
		
		System.out.println("ternary: (a > b) ? a : b = " + ternary );
	}
}
