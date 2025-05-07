package com.intheeast.inheritance.interfaces.commonancestor;

public interface Animal {

	// 가상(추상) 메서드가 없음
	
	// 다지 디폴트 메서드만 정의
	default public String identifyMyself() {
        return "I am an animal.";
    }
}
