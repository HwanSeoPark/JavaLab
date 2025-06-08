package com.intheeast.jdkproxy.baz;

public class DebugProxyTest {
    public static void main(String[] args) {
        // 원본 객체 생성
        Foo original = new FooImpl();

        // DebugProxy를 통해 프록시 인스턴스 생성
        Foo proxy = (Foo) DebugProxy.newInstance(original);

        try {
            System.out.println("=== [1] null 전달 테스트 ===");
            proxy.bar(null); // BazException 발생 예상
        } catch (BazException e) {
            System.out.println("⚠️ BazException 발생: " + e.getMessage());
        }

        try {
            System.out.println("\n=== [2] 유효한 객체 전달 테스트 ===");
            Object result = proxy.bar("Hello Proxy");
            System.out.println("🎯 리턴값: " + result);
        } catch (BazException e) {
            System.out.println("⚠️ BazException 발생: " + e.getMessage());
        }
    }
}
