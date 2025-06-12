package com.intheeast.cglibdemo.proxy;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory {
	
	@SuppressWarnings("unchecked")
    public static <T> T createProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer(); // Enhancer클래스가 결국 프록시를 만듬
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new TimeLoggingInterceptor());
        return (T)enhancer.create();
    }

}
