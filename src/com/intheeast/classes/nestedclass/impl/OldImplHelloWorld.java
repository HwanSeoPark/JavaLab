package com.intheeast.classes.nestedclass.impl;

import com.intheeast.interfaces.Calculate;

// interface를 contact [계약]라고 부르기도 합니다.
// 구현체는 가상 메서드를 구현해야하 한다
public  class OldImplHelloWorld implements Calculate {
								
	// @Override : C++개념...
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		
		return 0;
	}

	
	

}
