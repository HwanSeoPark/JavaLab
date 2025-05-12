package com.intheeast.classes.mission;

public class ArrayNumber {

	public static NumberProcessor[] makeNumberProcessor() {
		
		// Generic의 raw type을 아직 배우지 않음
		// 함수형 인터페이스이지만, 사실 제너릭 함수형 인터페이스
		// Function<String, String>[] arrays = new Function[3];
		
		// numberP 참조 변수는 'new NumberProcessor[3];에 의해 생성된
		// 배열을 참조하는 값을 저장하는 참조 변수입니다.
		// NumberProcessor[3] 이 배열은,
		// 각 엘리먼트가 NumberProcessor 인터페이스를 구현하는 구현체의 인스턴스에 대한 참조값을
		// 값으로 가짐.
		NumberProcessor[] numberP = new NumberProcessor[3];
		
		NumberProcessor numberP1 = new NumberProcessor() {
			
			public int process(int x) {
				int ret = x * 2;
				return ret;
			}
		};
		
		NumberProcessor numberP2 = new NumberProcessor() {
			
			public int process(int x) {
				int ret = x - 2;
				return ret;
			}
		};
		
		NumberProcessor numberP3 = new NumberProcessor() {
			
			public int process(int x) {
				int ret = x * x;
				return ret;
			}
		};

		numberP[0] = numberP1;
		numberP[1] = numberP2;
		numberP[2] = numberP3;
		
		return numberP;

	}
		
	public static void main(String... args) {

		NumberProcessor[] numberP = makeNumberProcessor();
	
		System.out.println("배열 [0]결과: " + numberP[0].process(4));
		System.out.println("배열 [1]결과: " + numberP[1].process(4));
		System.out.println("배열 [2]결과: " + numberP[2].process(4));
	
	
	}	
}	