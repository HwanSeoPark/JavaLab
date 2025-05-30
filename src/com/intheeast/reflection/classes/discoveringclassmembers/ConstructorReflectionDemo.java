package com.intheeast.reflection.classes.discoveringclassmembers;

import java.lang.reflect.Constructor;

// 한 클래스 내에서 public는 단 한개만 적용 가능하다
// 패키지 관리를 위해서
class Example {
    public Example() {
        System.out.println("👋 public no-arg constructor called");
    }

    public Example(String name) {
        System.out.println("📣 public constructor with String: " + name);
    }

    public Example(String name, Integer age, String address) {
        System.out.println("📣 public constructor with String: " + name + age + address);
    }

    
    private Example(int id) {
        System.out.println("🔒 private constructor with int: " + id);
    }
}

public class ConstructorReflectionDemo {
    public static void main(String[] args) {
        Class<?> clazz = Example.class;
        // 위 코드랑 등가 아래처럼 작성 가능
//      Example example = new Example();
        // <?>, <? extedns T> 읽기만 가능... 쓰기는 안됨
        // <? super Integer> 쓰기는 됨... 
//      Class<?> clazz = example.getClass();

        try {
            // 1. public 생성자(String) 사용
            Constructor<?> publicCtor = clazz.getConstructor(String.class);
            Object publicInstance = publicCtor.newInstance("ChatGPT");
            System.out.println("✔ publicInstance created: " + publicInstance.getClass().getSimpleName());

            // 2. public 생성자(String, int, String) 사용
            Constructor<?> publicCtor3 = clazz.getConstructor(String.class, Integer.class, String.class);
            Object publicInstance3 = publicCtor3.newInstance("ChatGPT", 10, "Seoul");
            System.out.println("✔ publicInstance created: " + publicInstance3.getClass().getSimpleName());
            
            // 3. private 생성자(int) 사용
            // setAccessible을 true로 설정하면 리플렉션 기능으로 private을 깨고 호출할 수 있다.
            Constructor<?> privateCtor = clazz.getDeclaredConstructor(int.class);
            privateCtor.setAccessible(true);  // 접근 가능하게 설정
            Object privateInstance = privateCtor.newInstance(42);
            System.out.println("✔ privateInstance created: " + privateInstance.getClass().getSimpleName());

            // 4. public 기본 생성자() 사용
            Constructor<?> noArgCtor = clazz.getConstructor();
            Object defaultInstance = noArgCtor.newInstance();
            System.out.println("✔ defaultInstance created: " + defaultInstance.getClass().getSimpleName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}