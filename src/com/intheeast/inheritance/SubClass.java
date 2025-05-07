package com.intheeast.inheritance;

public class SubClass extends SuperClass {

	public Inner inner;
	
	public void useInner() {
        Inner inner = new Inner();
        inner.showSecret();  // ✅ 간접 접근
        String hello = inner.getHello();
    }
}
