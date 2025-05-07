package com.intheeast.stringclass;

import java.io.PrintStream;

public class StringFormat {
// StringFormat클래스가 메모르에 로드 된 이후에 
// 문자열 리터럴들을 처리한후 스테틱 블럭에 있는 각 스테이트먼트를 실행시김	
	static { // static 블록	
		
		Integer intVar = 20;/*Integer.valueOf(1);*/ /*new Integer(1)*/ // AutoBoxing
		// deprecated.. 낙후된 : 써도 되는데 사용하지 마시요!! 언젠가 차후 자바 버전에서 이 컨스트럭터는 private이 될것!
		Float floatVar = Float.valueOf(3.0f);//new Float(3.0f);//3.0f; /*new Float(3.of);*/ // AutoBoxing
		String stringVar = "Hello";
		
		
		Float.valueOf(3.0f);
		
		String valueString = "10";
		Integer what = Integer.valueOf(valueString);
		
		
		// printf의 f 는 format
		// printf을 F3을 했을때
		// public PrintStream printf(String format, Object ... args)
		// Object... args는 호출 할 아규먼트 수가 정해지지 않았다 몇개가 오든 상관없다.
		// variable arguments
		System.out.printf("The value of the float \r\n" +
                "variable is %f, while \r\n" + // %f 의 %는 값을 특정 문자 값으로 변환해라 의미
                "the value of the " + 
                "integer variable is %d, " + // %d 는 십진수로 출력해달라는 의미
                "and the string is %s", 
                floatVar, // Float 클레스 기본 데이터 타입이 float인 value 필드의 값을 전달 
                intVar, // integer 클래스 value 필드의 기본 데이터 타입은 int
                stringVar); 
				// 이 메서드의 아규먼트는 4개
			    // , 가 3개
			    // 저 + 문장은 하나의 아규먼트
		
		// 위에 printf 메서드랑 동일 메서드 
		// 대신 위 메서드는 콘솔창에 출력하는 메서드
		// 아래 메서드는 fs에 참조 값을 전달해주는 메서드
		String fs;
		fs = String.format("The value of the float " +
		                   "variable is %f, while " +
		                   "the value of the " + 
		                   "integer variable is %d, " + 
		                   " and the string is %s",
		                   floatVar, 
		                   intVar, 
		                   stringVar);
		String fs1;
		fs1 = String.format("0x%x, %d", // %x 16진수로 출력
		                    intVar, intVar);
		
		
		System.out.println(fs);
		System.out.println(fs1);
	}

	public static void main(String... args) {
		
	}	
}
