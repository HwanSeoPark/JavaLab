package com.intheeast.variables;

public class JVariable {
   
	int qFirst; // instance 변수 or class 필드 변수
	// static int qFirst > static 붙이는 순간 class 변수가된다.
	
	// int x, int b : parameter (매개변수)
	public static int func(int x, int b) {
		int ret = x + b;
		return ret;
	}
	public static int func2(int x, int b) {
		int ret = x - b;
		return ret;
	}
	
	// 실행 가능한 Jar 파일은 최소 한개 이상의 main 메서드[static]가 정의되어야 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break point toggle
		// 특정 데이터 타입의 값을 저장하기 위한 용도로 사용
		// 변수[지역:local] 선언
		// data type    : variables name
		// 다음 5를 literal[코드로 작성한 값] 이라고 한다!!!
		
		int first;  // statement
		
		first = 5;
//      5 = first;	잘못 된 문법
		// 챗지피티 대입연산자 기준으로 left/right side에 올 수 있는 것을 정리해줘
	    // first가 어떻게 생성하느냐?..	
		int second = first;
		// first = expression	
		int third = first + second;
		// first + second 가 expression
       
		// main이 func의 호출자[caller]
		// 다음 메서드 호출식에서 first와 second는 argument(인자) [parameter의 값]
		func(func2(first, second),first + second);
		//func(first, second) 함수 호출식 
		// 정확한 메서드 명 (메서드에서 정확한 파라미터 리스트에 있는 아규먼트를 전달하는 값)
		
		return;
		// void(값이 없다라는 data type) 있으면 return 안적오도 된다
	}

}
