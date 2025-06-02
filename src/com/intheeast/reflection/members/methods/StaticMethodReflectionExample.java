package com.intheeast.reflection.members.methods;

import java.lang.reflect.Method;

public class StaticMethodReflectionExample {
    public static void main(String[] args) throws Exception {
        // 클래스 로딩
        Class<?> clazz = 
        		Class.forName("com.intheeast.reflection.members.methods.MyUtils");

        // 메서드 객체 획득 (메서드 이름과 파라미터 타입으로 식별)
        Method method = clazz.getDeclaredMethod("sayHello", String.class);

        // static 메서드이므로 첫 번째 아규먼트에 null 전달
        method.invoke(null, "ChatGPT");
    }
}