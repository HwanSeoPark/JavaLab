package com.intheeast.inheritance.overrides;

public class Animal {

	 // 슈퍼클래스의 메서드
    public Animal speak() {
        System.out.println("Animal makes a sound");
        return this;
    }

    
    // static 메서드는 사실, Animal 클래스와 별개다.
    // Animal 인스턴스가 없어도 사용할 수 있는 메서드
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
 
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }




}
