package com.intheeast.jdkproxy.dump;

//import sun.misc.ProxyGenerator;
import java.io.*;

public class DumpProxyClass {
    interface Hello {
        void sayHello();
    }

    public static void main(String[] args) throws Exception {
    	// JDK 19 Version에서 사용 가능함...
//        byte[] classData = ProxyGenerator.generateProxyClass(
//            "MyProxyClass",
//            new Class[]{Hello.class}
//        );
//
//        try (FileOutputStream fos = new FileOutputStream("MyProxyClass.class")) {
//            fos.write(classData);
//        }

        System.out.println("✅ MyProxyClass.class 파일 생성 완료");
    }
}
