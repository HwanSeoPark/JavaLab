package com.intheeast.jdkproxy.timeproxy.proxy;

import java.lang.reflect.*;

public class ProxyFactory {
	
    @SuppressWarnings("unchecked")
    // T의 타입 아규먼트는 X인터페이스이다!!!
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
            interfaceType.getClassLoader(),
            new Class<?>[]{interfaceType},
            new TimeLoggingHandler(target)
        );
    }
}