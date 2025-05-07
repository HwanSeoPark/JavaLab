package com.intheeast.variables;

public class MaxMinOfVariables {

	public static void main(String[] args) {
		
		//0b 다음에 오는 수는 이진수라는 의미
//		byte byteDataType = 0b0111_1111; // byte 데이터 타입의 최대 양수 값
		// 위 값 0b0111_1111(십진수 : 127)을 2의 보수로 음수(단, 이진수)로 나타낸다면?
		//.... 0b1000_0001(십진수: -127)
		// 양수가 한개 더적은 이유는 0이 있기 떄문에
		
		// Type mismatch : cannot convert from int to byte
		// type casting
		// +128의 2의 보수(-128)는 0x80(16진수)임.
//		byte byteDataType = (byte) 0b1000_0000;// byte 데이터 타입의 최소 음스 값

		byte byteDataType = -128; // byte 데이터 타입의 최소 음수 값
		
		System.out.printf("0x%x \n", byteDataType);
		
		int maxOfIntDataType = 2147483647; // 0x7FFF_FFFF // int 양수 최대값
		
		System.out.printf("0x%x \n", maxOfIntDataType);
		// 32비트로 가장 큰 양수는 2147483647 : 0이 포함되어 있기 때문에
		//								  단, 하나의 0만 존재(+0) 양수의 절대값이 음수보다 한개가 적다
		int minOfIntDataType = -2147483648; // 0x8000_0000 // int 음수 최소값
		// 2147483648의 2의 보수 값[_2147483648 ; 0x8000_0000]이 minOfIntDataType에 저장
		System.out.printf("0x%x \n", minOfIntDataType);
	    
		float simpleFloatVariables = 3.143f; // 부동 소수점...
		double simpleDoubleVariables = 3.14234d;
		
		boolean isTrue = true; // 'true' 리터럴
		boolean isFalse = false;
		
		// 논리 연산(OR)
		boolean isRet = isTrue || isFalse;
		
		char alphabet = 'A'; // 아스키코드가 아니라 유니코드
		
		//String helloWorld = "Hello World"; << 이렇게 써도 되는 이뉴는 컴파일러 내부적으로 아래처럼 변환을 해줌
		String helloWorld = new String("Hello World"); // 최대한 이렇게 작성하기
		
		int nonDefaultSettingVariable; // 지역변수는 초기값이 설정이 안되면 적용이 안된다 
		
		Class clazz;
		
		Class<String> stringClass = String.class; // 'String.class'라는 특별한 Literal
		// < > 제너릭 표시
		
		System.out.printf("0x%x \n", byteDataType);
	
	}
}