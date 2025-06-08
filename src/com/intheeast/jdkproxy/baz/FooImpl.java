package com.intheeast.jdkproxy.baz;


public class FooImpl implements Foo {
	
    public Object bar(Object obj) throws BazException {
        if (obj == null) {
            throw new BazException("Input object cannot be null.");
        }

        // 추가 로직을 이곳에 작성할 수 있습니다.
        // 예를 들어, obj의 특정 작업을 수행할 수 있습니다.

        System.out.println("FooImpl의 bar 메서드입니다");
        return obj; // 또는 실제 작업 결과를 반환할 수 있습니다.
    }
}