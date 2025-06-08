package com.intheeast.jdkproxy.helloworld;

public class HelloWorldImpl implements HelloWorld {
    private String language = "English";
    private String greeting = "Hello";

    @Override
    public void sayHello() {
        System.out.println(greeting + ", world!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, world!");
    }

    @Override
    public void greet(String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
        if ("English".equalsIgnoreCase(language)) {
            this.greeting = "Hello";
        } else if ("Spanish".equalsIgnoreCase(language)) {
            this.greeting = "Hola";
        } else if ("French".equalsIgnoreCase(language)) {
            this.greeting = "Bonjour";
        } else {
            this.greeting = "Hello"; 
        }
    }

    @Override
    public String getGreeting() {
        return greeting;
    }
}