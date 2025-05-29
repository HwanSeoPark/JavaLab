package com.intheeast.reflection.classes.discoveringclassmembers;

import java.lang.reflect.Method;

class Parent2 {
    public void publicParentMethod() {}
    private void privateParentMethod() {}
}

class Child2 extends Parent2 {
    public void publicChildMethod() {}
    private void privateChildMethod() {}
}


public class MethodReflectionDemo {
    public static void main(String[] args) {
        Class<?> clazz = Child2.class;

        System.out.println("🔍 1. getMethod(\"publicChildMethod\")");
        try {
            Method m = clazz.getMethod("publicChildMethod");
            System.out.println("✔ Found: " + m.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("⚠ Not found: " + e.getMessage());
        }

        System.out.println("🔍 2. getDeclaredMethod(\"privateChildMethod\")");
        try {
            Method m = clazz.getDeclaredMethod("privateChildMethod");
            System.out.println("✔ Found: " + m.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("⚠ Not found: " + e.getMessage());
        }

        System.out.println("\n📜 3. getMethods() → public + 상속 포함");
        Method[] publicMethods = clazz.getMethods();
        for (Method m : publicMethods) {
            System.out.println("✔ Public method: " + m.getDeclaringClass().getSimpleName() + "." + m.getName());
        }

        System.out.println("\n📜 4. getDeclaredMethods() → 현재 클래스의 모든 메서드");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println("✔ Declared method: " + m.getName());
        }
    }
}