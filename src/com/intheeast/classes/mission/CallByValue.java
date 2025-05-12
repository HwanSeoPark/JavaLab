package com.intheeast.classes.mission;

import com.intheeast.classes.anonymous.OuterClass;

public class CallByValue {

	// call by value
	// 파라미터 x도 call 메서드에 로컬 변수
	public static void call(int x) {
		// 로컬 변수는 call 메서드의 스택 프레임
		x = 5;
	}
	
	public static void main(String[] args) {
		int x = 10;
		call(x);
		System.out.println(x);
		// call 메서드를 호출한 이후
		// x 값은???
		// 여기서 x는 5가 아닌 10이다
		// 이유는 Call By Value 
	}

	public Runnable myMethod() {	// OuterClass의 인스턴스 메서드	
        int number = 10; // final 또는 사실상 final이 아님
        // 익명 클래스에는 이름이 없다.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {             	
                System.out.println(number);                
//                number = 20;
            }
        };
		return runnable;       
    }
	// 위에 익명 클래스의 코드를 보면 이렇게 작성돼있다.
	// 근데 왜 컴파일러는 클래스 이름을 만들었음 : OuterClass$1
//	class OuterClass$1 implements Runnable {
//	    OuterClass$1(OuterClass var1, int var2 = 10) {
//	        this.this$0 = var1;
//	        this.val$number = var2;
//	    }
//	    public void run() {
//	        System.out.println(this.val$number);
//	    }
//	}
}
