package com.intheeast.controlflowstatements;

public class ForDemo {

	public static void main(String[] args){
    
		// for(반복 조건식)
		// - 초기화 (Init 반복 횟수 카운트 변수) expression
		// - 종료 (Termination 반복) expression --> for도 이부분이 true면 반복, false면 종료
		// - 증감 (Increment 횟수 카운트 변수) expression
		for(int i=1; i<4; i++){ // int i의 라이프 사이클은 for 구문가 같이한다.
		// 전통적으로 for 반복 구문 카운터 넘버 변수는 i 를 사용한다
             System.out.println("Count is: " + i);
        }
		
		int loopingCount = 0;
		for(;;) {
		// 무한 루프, 쓸필요없다. 이걸 쓸바엔 while 구문 쓴다	
			if (loopingCount++ > 10)
				break;
		}
		
		int breakFigure = 7;
		
		int anotherLoopingCount = 0;
		for( ;anotherLoopingCount<10;anotherLoopingCount++) {
			
			//...	
			if (anotherLoopingCount == breakFigure)
				break;
		}
		
		// 위 for 구문의 반복 횟수를 필요로 하는 코드를 작성할 때...
		int finalLoopingCountNumber = anotherLoopingCount;
   }
}
// 진행 순서가 기억이 안나면 while 구문이랑 비교해보면 이해하기 쉽다.