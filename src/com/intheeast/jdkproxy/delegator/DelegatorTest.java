package com.intheeast.jdkproxy.delegator;

import java.lang.reflect.Proxy;

public class DelegatorTest {
    public static void main(String[] args) {
        // 인터페이스 목록
        Class<?>[] interfaces = { Hello.class, Bye.class };

        // 각 인터페이스에 대응하는 위임 객체
        Object[] delegates = { new HelloImpl(), new ByeImpl() };

        // 프록시 객체 생성
        Object proxy = Proxy.newProxyInstance(
            DelegatorTest.class.getClassLoader(),
            interfaces,
            new Delegator(interfaces, delegates)
        );

        // 캐스팅 후 메서드 호출
        Hello helloProxy = (Hello) proxy;
        Bye byeProxy = (Bye) proxy;

        helloProxy.sayHello("Alice");
        byeProxy.sayBye("Bob");

        // Object 메서드 호출 (toString, equals, hashCode)
        System.out.println(proxy.toString());
        System.out.println(proxy.equals(proxy));
        System.out.println(proxy.hashCode());
    }
}
