package com.intheeast.classes.mission;

public class MissionRunner {

	public static void main(String... args) {
		// 실습1 : 익명 클래스로 MessagePrinter 구현
		
		
		MessagePrinter printer = new MessagePrinter() {
			public void printMessage() {
				System.out.println("Message");
			}
		};
		
		// 실습 2 : 지역 변수 접근 테스트
		int multiplier = 3;
		
		NumberProcessor np = new NumberProcessor() {
			public int process(int x) {
				
				int result = multiplier * x ;
				
				System.out.println("결과: " + result);
				
				return result;
				}		
			};
		
		final int base = 10;

		NumberProcessor processor = new NumberProcessor() {
		    @Override
		    public int process(int x) {
		        return x + base; // int base에 final 붙이거나
		        				 // base = 20;을 삭제
		    }
		};

		// base = 20; // 컴파일 에러 발생 예상
		System.out.println(processor.process(5));	
			
	
		
	
			
		
		printer.printMessage();
		np.process(5);
	}
}
