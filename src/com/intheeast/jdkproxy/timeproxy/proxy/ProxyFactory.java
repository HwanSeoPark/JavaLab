package com.intheeast.jdkproxy.timeproxy.proxy;

import java.lang.reflect.*;

public class ProxyFactory {
	
    @SuppressWarnings("unchecked")
    // T의 타입 아규먼트는 X인터페이스이다!!!
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
            interfaceType.getClassLoader(),
            new Class<?>[]{interfaceType}, // CGLIB랑 다른점, 프록시는 
            							   // 임이의 인터페이스를 구현해야함!!
            new TimeLoggingHandler(target)
        );
    }
}