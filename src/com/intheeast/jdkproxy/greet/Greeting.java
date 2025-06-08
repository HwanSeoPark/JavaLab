package com.intheeast.jdkproxy.greet;

public interface Greeting {
	
    default void sayHello() {
        System.out.println("🙋‍♂️ Hello from the default method!");
    }

    void sayBye();
    
    static void sayGoodNigth() {
        System.out.println("🙋‍♂️ Hello from the static method!");
    }
}