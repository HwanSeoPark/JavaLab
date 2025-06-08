package com.intheeast.cglibdemo.proxy;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory {
	
	@SuppressWarnings("unchecked")
    public static <T> T createProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new TimeLoggingInterceptor());
        return (T) enhancer.create();
    }

}
