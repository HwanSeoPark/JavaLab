package com.intheeast.classes.lambdaquiz;

public class NumberCheckerTrueFalse {

	//실습 미션 1: 짝수 판별기 만들기
	// 조건: 주어진 숫자가 짝수이면 true 반환
	NumberChecker checker = 
			x -> (x % 2) == 0 ? true : false;

	//실습 미션 2: 양수 판별기 만들기
	//조건: 주어진 숫자가 0보다 크면 true 반환
	NumberChecker checker1 = 
			x -> x > 0  ? true : false;		
	// 실습 미션 3: 특정 배수 판별기 (지역 변수 캡처)
	// 조건: 외부 변수 divisor로 나누어 떨어지는지 판별하는 람다식
			int divisor = 5;
	
	NumberChecker checker3 =
			x -> (x % divisor) == 0 ? true : false;

    // 도전 미션: 두 조건을 합쳐라! (AND 조건)
    // 조건: 주어진 숫자가 짝수이면서 0보다 큰 경우만 true 반환
	NumberChecker checker4 =
			x -> (x % 2) == 0 && x > 0 ? true : false;
	
	// 익명 클래스와 비교해보기
    // 위에서 만든 evenChecker를 익명 클래스 방식으로 다시 만들어보세요.		
	NumberChecker evenChecker = new NumberChecker() {
	    @Override
	    public boolean check(int number) {
	        return number % 2 == 0;
	    }
	};	
			
}


