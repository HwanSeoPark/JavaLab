package com.intheeast.jdkproxy.proxybase;

import java.lang.reflect.Proxy;

import com.intheeast.jdkproxy.util.ProxyInspector;

public class ProxyExample {
    public static void main(String[] args) {
        // 클래스 로더
        ClassLoader classLoader = ProxyExample.class.getClassLoader();

        // <Proxy.newProxyInstance>
        // 프록시 생성 - 인터페이스 순서: FirstInterface, SecondInterface
        // 지정된 인터페이스들[FirstInterface.class, SecondInterface.class]을 
        // 구현한 프록시 인스턴스를 리턴함.
        // 이 프록시 인스턴스는 지정된 인터페이스의 메서드 호출을,
        // 지정된 invocation handler[MyInvocationHandler]에게
        // 디스패치함.
        Object proxy1 = Proxy.newProxyInstance(
                classLoader,
                // 엘리먼트가 Class 클래스 인스턴스인 배열을 만들고 있음...
                new Class<?>[]{FirstInterface.class, SecondInterface.class},
                new MyInvocationHandler()
        );
        
        ProxyInspector.inspect(proxy1);

        // 프록시 생성 - 인터페이스 순서: SecondInterface, FirstInterface
        Object proxy2 = Proxy.newProxyInstance(
                classLoader,
                // 다음 배열 사이즈는 65535를 초과할 수 없음!
                new Class<?>[]{SecondInterface.class, FirstInterface.class},
                new MyInvocationHandler()
        );

        ProxyInspector.inspect(proxy2);
        
        // 동일한 인터페이스 조합이지만 순서가 다르면 서로 다른 프록시 클래스가 생성됨
        System.out.println("proxy1 class: " + proxy1.getClass());
        System.out.println("proxy2 class: " + proxy2.getClass());
        
        FirstInterface firstProxy1 = (FirstInterface) proxy1;
        firstProxy1.firstMethod();
                
        SecondInterface secondProxy1 = (SecondInterface) proxy1;
        secondProxy1.secondMethod();
        
        FirstInterface firstProxy2 = (FirstInterface) proxy2;
        firstProxy2.firstMethod();
                
        SecondInterface secondProxy2 = (SecondInterface) proxy1;
        secondProxy2.secondMethod();
        
        // 두 프록시 클래스는 다름
        System.out.println("Are proxy1 and proxy2 classes the same? " + (proxy1.getClass() == proxy2.getClass()));
    }
}