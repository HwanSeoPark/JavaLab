package com.intheeast.classes;

public class Main {

	public static void main(String... args) {
		
		// console은 standard out[리눅스 용어] 이라고 함
		// 다음의 println 메서드는 문자열을 콘솔에 출력하는 메서드임
		//System.out.println();	
		// %d : d는 Decimal (십진수를 의미) 
		// %는 뒤에 오는 문자로 치환하라는 뜻
		// printf(String format, Object ... args)
		System.out.printf("My age is %d %s 0x%x PI : %f \r\n",
							51, "bye", 255, Math.PI);
		System.out.printf("My age is 0x%x \r\n", 51);
		System.out.printf("My age is %s \r\n", 51);
									// 뒤에오는 51은 정수고 %s는 스트링이지만 프로그램에서 자동으로 처리해준다
		System.out.printf("원주율 %f \r\n", Math.PI);
		System.out.printf("Hello :%s \r\n", " World");
		                      //%s 여기서 s는 뒤에오는 String
		System.out.printf("Good-:%s \r\n" , " Bye");
		// printf 메서드는 자동으로 개행문자(newline-character)를 붙여주지 않는다
		// \r\n 은 개행문자
		System.out.println(); // 아무것도 안적으면 개행문자 처리된다
		
		System.out.println("Hello World");		
		System.out.println("Good-Bye");
		
	}

}
