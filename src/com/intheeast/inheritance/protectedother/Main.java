package com.intheeast.inheritance.protectedother;

public class Main {

	public static void main(String[] args) {
		
		SubClassInOtherPackage sciop = 
				new SubClassInOtherPackage();
		// protected 엑세스 제어자가 있는 메서드를 상속한 클래스의 객체 인스턴스 참조데이터를 만들어도
		// protected 엑세스 제어자가 적용된 메서드를 사용할 수 없다
		
		// 다음과 같이 타패키지의 특정 클래스를 상속한 클래스의 인스턴스로 
		// protected 엑세스 제어자가 적용된 메서드를 사용할 수 없다
//		sciop.helloWorld(); // The method helloWorld() from the 
		                    // type ProtectedClass is not visible
	  
		// static 메서드도 상속받지 않으면
		// protected 엑세스 제어자가 적용된 메서드를 사용할 수 없다.
//		sciop.helloWorldStatic(); // he method helloWorldStatic() from the
		                          // type ProtectedClass is not visible
	}

}
