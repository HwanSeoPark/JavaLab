package com.intheeast.reflection.members.methods;

import java.lang.reflect.*;

public class ExceptionTypeTest {

    public <T extends Exception> void testMethod() throws T {}
    // 위 메서드는 컴파일 후, 타입 소거로 인해 다음과 같이 됨.
    // public void testMethod() throws Exception {}

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = ExceptionTypeTest.class.getMethod("testMethod");

        System.out.println("▶ getExceptionTypes:");
        // getExceptionTypes은 단순한 클래스 정보만 제공함 (Class<?>)
        for (Class<?> ex : method.getExceptionTypes()) {
            System.out.println("  " + ex);
        }

        System.out.println("▶ getGenericExceptionTypes:");
        // getGenericExceptionTypes()는 
        // 제네릭 타입 파라미터, 파라미터화 타입, 와일드카드 등 복잡한 타입 정보까지 보존하여 제공
        for (Type ex : method.getGenericExceptionTypes()) {
            System.out.println("  " + ex.getTypeName());
        }
    }
    /* 실행 결과:
     ▶ getExceptionTypes:
  	   class java.lang.Exception
	 ▶ getGenericExceptionTypes:
       T
     이유:
	  * getExceptionTypes()는 컴파일 시점에 지워진 후의 타입을 리턴하므로 Exception만 출력.
      * getGenericExceptionTypes()는 제네릭 타입 정보(T extends Exception)를 유지하고 있으므로 T를 출력.
     */
}