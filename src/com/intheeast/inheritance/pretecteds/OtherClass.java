package com.intheeast.inheritance.pretecteds;

public class OtherClass {

	private ProtectedClass pc;
	
	public OtherClass() {
		pc = new ProtectedClass();
	}
	
	public void useHelloWorldMehtodOfProtectedClass() {
		pc.helloWorld(); // 엑세스 제어자 : protected
	}
	
	public void useGoodByeMehtodOfProtectedClass() {
		pc.goodBye(); // 엑세서 제어자 : public 
	}
	
}
