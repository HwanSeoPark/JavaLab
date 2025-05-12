package com.intheeast.classes.nestedclass;

import com.intheeast.interfaces.Calculate;

public class ClientInterface {

	// useHelloWorldInterface 메서드 입장에서는
	// Calculate 인터페이스의 구현체와의 느슨한 결합
	// Calculate 인터페이스 구현체에 대한 추상화
	public ClientInterface() {}
	
	public static void useCalculateInterface(Calculate calculate) {
		int add = calculate.add(1, 2);
		
		int sub = calculate.subtract(5, 3);
		
		int mul = calculate.multiply(2, 2);
	}
}
