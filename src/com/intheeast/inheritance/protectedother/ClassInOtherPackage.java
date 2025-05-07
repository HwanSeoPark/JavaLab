package com.intheeast.inheritance.protectedother;

import com.intheeast.inheritance.pretecteds.ProtectedClass;

public class ClassInOtherPackage {

	private ProtectedClass pc;
	
	public ClassInOtherPackage() {
		pc = new ProtectedClass();
	}

	public void useHelloWorldOfProtectedClass() {
//		pc.helloWorld(); // The method helloWorld() from the 
		                 // type ProtectedClass is not visible
		// 현재 ClassInOtherPackage 클래스 입장에서는
		// helloWorld 메서드의 엑세스 제어자는 마치 Package-Private으로
		// 선언된 것 같다... 하지만...
	}
	
	public static void helloWorldStatic() {
//		pc. // Cannot make a static reference to the non-static field pc
	}
	
	public void useGoodByeOfProtectedClass() {
		pc.goodBye();
	}

}
