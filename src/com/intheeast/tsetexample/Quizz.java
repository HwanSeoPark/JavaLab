package com.intheeast.tsetexample;

public class Quizz {

	private int quizz;

	public int getQuizz() {
		return quizz;
	}

	public void setQuizz(int quizz) {
		this.quizz = quizz;
	}
	
	public void testUnInitLocalMethod() {
		int unInitLocalVar = 0;// 지역 변수는 초기화[특정 값을 설정]을 하지 않으면
						       // 이 메서드에서 생성되지 않습니다.
		
		// The local variable unInitLocalVar may not have been initialized
		System.out.println(unInitLocalVar);
	}
}
