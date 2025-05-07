package com.intheeast.tsetexample;

public class QuizzMain {

	public static void main(String[] args) {
		
//		 int X[]; // 배열을 참조하는 변수를 선언 : C 또는 C++ 방식
		int[] X;
		X = new int[10];
		 //	 int[] Y; // 자바에서는 이러한 배열 참조 변수 선언을 권장
		
		
		Quizz quizz = new Quizz ();
		// Quizz 클레스에 디폴트 컨스트럭터를 만들지 않았지만 컴파일러가 바이트코드에 자동으로 만들어둔다.
		// 디버깅 하다 보면 디폴트 컨스트럭터가 생성된걸 확인할수 있다.
		
		System.out.println("Quizz의 초기화되지 않은 필드 값:" + quizz.getQuizz());

	}

}
