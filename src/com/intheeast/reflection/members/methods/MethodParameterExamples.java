package com.intheeast.reflection.members.methods;

import java.lang.reflect.*;
import java.util.function.*;
import static java.lang.System.out;

public class MethodParameterExamples {
    
    public class InnerClass { }
    
    enum Colors {
        RED, WHITE;
    }
    
    public static void main(String... args) {
        out.println("InnerClass:");
        MethodParameterSpy.printClassConstructors(InnerClass.class);
        
        out.println("enum Colors:");
        MethodParameterSpy.printClassConstructors(Colors.class);
        MethodParameterSpy.printClassMethods(Colors.class);
    }
}