package com.intheeast.jdkproxy.duplicate;

import java.lang.reflect.Proxy;

public class DynamicProxyExample {
	
	public static void main(String[] args) {
        InterfaceA classA = new ClassA();
        InterfaceB classB = new ClassB();

        // newProxyInstance에 의해 생성된 $Proxy 클래스의 인스턴스를 만들기 위해
        // 호출하는 $Porxy 컨스트럭터의 아규먼트로 사용되는
        // MyInvocationHandler 인스턴스!
        Object proxyInstance = Proxy.newProxyInstance(
                DynamicProxyExample.class.getClassLoader(),
//                new Class<?>[]{InterfaceA.class, InterfaceB.class},
                new Class<?>[]{InterfaceB.class, InterfaceA.class},
                new MyInvocationHandler(classA, classB)
        );

        ((InterfaceA) proxyInstance).duplicateMethod();  // ClassA: duplicateMethod 출력
        // 프록시 인스턴스에서 중복 메서드가 호출되면, 
        // 해당 메서드를 포함한 첫 번째 인터페이스(직접 포함하거나 슈퍼 인터페이스를 통해 상속받은)의 
        // Method 객체가 호출 핸들러의 invoke 메서드에 전달됩니다.
        ((InterfaceB) proxyInstance).duplicateMethods();  // ClassA: duplicateMethod 출력
    }

}
