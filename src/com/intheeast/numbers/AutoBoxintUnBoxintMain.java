package com.intheeast.numbers;

public class AutoBoxintUnBoxintMain {

	// Call By Value
	public static void callByValueMethod(Integer argu) {
		argu = 3; // IntegerCache 클래스에 의해 생성된
				  // 256개의 Integer 클래스 인스턴스들 중에,
		          // value 필드의 값이
				  // 3인 인스턴스의 참조값이 value에 저장됨...
			      // 그런데, 이 argu 파라미터는 로컬 변수임...
			      // 이 로컬 변수는 CallByValueMethod 메서드가
			      // 리턴하는 순간 소멸됨.
		int max = Integer.MAX_VALUE;
		return;
	}
	
	static {
		// 다음 배열의 엘리먼트는 String 클래스 객체의 인스턴스에 대한 참조값을 저장!!!
		String[] strs = new String[10];
		
		// "" -> 문자열 리터럴? True 텅민 문자열
		// "0" -> 문자가 하나만 있는 문자열 리터럴
		for(int i = 0; i<strs.length; i++) {
			// 다음 '+'는 덧셈 연산가능을 가진 연산자가 아니라,
			// 문자를 연결하는 연산 기능을 하는 연산자 overloading 이라고 함.
			// 자바는 공식적으로 연산자 오버로딩을 지원하지 않지만,
			// 유일하게 문자열을 연결하는 연산자(+) 오버로딩을 허락함!
			// 문자열 + 문자열... 
			// 다음 i 변수는 정수 데이터 타입인데... 어떻게 문자열 + 문자열 코드에 적용될수 있나?
//			strs[i] = new String("") + i;
			String numberStr = String.valueOf(i); // 위코드랑 등가
			strs[i] = new String("") + numberStr; // 컴파일러가 자동으로 이렇게 바꿔서 작동함
												  // 그래서 strs[i] = new String("") + i;
											      // 코드가 작동됨
		}
		
		// intValue : 참조 변수 -> 참조값을 값으로 가지는... 
		// 말이 안되는 코드인데 왜 되는가?
		// String str = "Hello";
		/* Integer intValue = 3; 메서드를 실행해보니
		 static Integer valueOf(int i)  <- 이 메서드가 호출됨 
		 */
		// Integer.valueOf 메서드가 호출됨!!!
		// 컴파일러가 컴파일할때 대입연산자를 통해 3이라는 정수 리터럴을 대입하는
		// 코드를 Integer.valuwOf(3) 으로 바꿈 
		// : AutoBoxing이라 함!!!
		Integer intV =/*Integer.valueOf(3)*/ 3; // private final int value;
		intV.doubleValue();
		// 256개의 Integer class의 객체의 인스턴스를 만듬
		// 각 value 필드에는 -127, -126, -125 ... 127 
		
		Integer intV2 = Integer.valueOf(5); // private final int value;
		int ret = intV.compareTo(intV2);
		// ret -1 리턴함
		
		intV.equals(intV2);
		
		
		Double doubleValue = 3.0d;
		int doublePoint = doubleValue.intValue(); // private final double value;
		// 형변환 
		// 소수점 이하는 다 날라간다
		
		
		// UnBoxing
		// 디버깅해보면 Integer 클래스의 getter가 호출됨
		int unboxingInteger = intV; // intV.intValue();
		
		double unboxingDouble = doubleValue;
		
		
		String numbers = "1234";
		Integer stringFigure = Integer.decode(numbers);
		// 문자 "1234"를 받아들여서 정수 1234로 만들겠다
		// decode 메서드		
		// Integer 인스턴스의 참조값을 전달
			
		int figure = Integer.parseInt(numbers);
	
			
		String rec = stringFigure.toString();
		
		String fogireStromg = Integer.toString(figure);
	
		int a = 0;
		
	}
	
	
	public static void main(String[] args) {
		
//		int arg = 10;
		Integer arg = 10; // AutoBoxing...
		// 현재 arg의 참조값은 
		// IntegerCache 클래스에 의해 생성된
		// 256개의 Integer 클래스 인스턴스들 중에,
		// value 필드의 값이
		// 10인 인스턴스 참조값이다
		callByValueMethod(arg);

		return;
	}

}
