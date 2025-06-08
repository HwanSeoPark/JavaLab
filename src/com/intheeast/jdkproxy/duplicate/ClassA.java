package com.intheeast.jdkproxy.duplicate;

class ClassA implements InterfaceA {
    @Override
    public void duplicateMethod() {
        System.out.println("ClassA: duplicateMethod");
    }
}