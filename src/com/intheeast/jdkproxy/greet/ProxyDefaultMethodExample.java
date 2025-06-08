package com.intheeast.jdkproxy.greet;

import java.lang.reflect.Proxy;

import com.intheeast.jdkproxy.util.ProxyInspector;

public class ProxyDefaultMethodExample {
	
    public static void main(String[] args) {
    	Greeting.sayGoodNigth();
    	
    	Greeting helloGreeting = new HelloGreeting();
    	helloGreeting.sayHello();
    	
        Greeting greetingProxy = 
        		(Greeting) Proxy.newProxyInstance(
	                Greeting.class.getClassLoader(),
	                new Class<?>[]{Greeting.class},
	                new GreetingInvocationHandler()
        		);
        
        ProxyInspector.inspect(greetingProxy);

        System.out.println("=== Calling sayHello() (default method) ===");
        greetingProxy.sayHello(); // invokeDefault로 디폴트 메서드 실행

        System.out.println("=== Calling sayBye() (custom logic) ===");
        greetingProxy.sayBye();   // 사용자 정의 로직
    }
}
