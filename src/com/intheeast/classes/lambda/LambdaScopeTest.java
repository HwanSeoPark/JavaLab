package com.intheeast.classes.lambda;

public class LambdaScopeTest {

	 public int x = 0;

	    class FirstLevel {

	        public int x = 1;

	        void methodInFirstLevel(int x) {

	            // 메서드 아규먼트 x는 가장 안쪽 스코프에서 정의됨
	            System.out.println("x = " + x); // 메서드 아규먼트
	            System.out.println("this.x = " + this.x); // FirstLevel 클래스의 인스턴스 필드
	            System.out.println("LambdaScopeTest.this.x = " + LambdaScopeTest.this.x); // LambdaScopeTest 클래스의 인스턴스 필드

	            // public abstract void run();
	            Runnable r = () -> {
	                // 람다 expression은 메서드 아규먼트를 섀도잉하지 않음
	                System.out.println("x = " + x); // 메서드 아규먼트
	                System.out.println("this.x = " + this.x); // FirstLevel 클래스의 인스턴스 필드
	                System.out.println("LambdaScopeTest.this.x = " + LambdaScopeTest.this.x); // LambdaScopeTest 클래스의 인스턴스 필드
	            };

	            r.run();
	        }
	    }

	    public static void main(String... args) {
	        LambdaScopeTest st = new LambdaScopeTest();
	        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
	        fl.methodInFirstLevel(23);
	    }
}
