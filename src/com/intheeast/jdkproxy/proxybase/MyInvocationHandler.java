package com.intheeast.jdkproxy.proxybase;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 이 구현체는 타겟이 지정되어 있지 않음...
// 단지, 타겟이 지정되지 않은 프록시 클래스에 포함되는 InvocationHandler 인터페이스의 구현체임.
public class MyInvocationHandler implements InvocationHandler {
    @Override // Object proxy란 자바의 Proxy 클래스 인스턴스를 참조하고 있는 파라미터
              // Target 인스턴스의 해당 메서드에 전달될 아규먼트들.
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    	System.out.println("MyInvocationHandler:: invoke : class: " + proxy.getClass());
    	
    	if (method.getDeclaringClass().equals(FirstInterface.class)) {
            System.out.println("Invoked method from FirstInterface: " + method.getName());
        } else if (method.getDeclaringClass().equals(SecondInterface.class)) {
            System.out.println("Invoked method from SecondInterface: " + method.getName());
        } else {
            System.out.println("Invoked method from unknown interface: " + method.getName());
        }
        return null;
    }
}