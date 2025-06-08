package com.intheeast.jdkproxy.duplicate;

class ClassB implements InterfaceB {
    @Override
    public void duplicateMethods() {
        System.out.println("ClassB: duplicateMethods");
    }
}