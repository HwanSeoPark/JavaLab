package com.intheeast.inheritance;

public class SuperClass {

	private String secret = "슈퍼클래스의 비밀";

	private Inner inner;
	
	public SuperClass() {
		inner = new Inner();
	}
	
    protected class Inner {
        private String hello = "Hello";
        
    	void showSecret() {
            System.out.println("접근된 비밀: " + secret); // ✅ 내부에서 접근 가능
        }

		public String getHello() {
			return hello;
		}
    	
    	
    }
}

