package com.intheeast.reflection.classes.retrievingclassobjects;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MethodsthatReturnClasses {
	
	// 클래스 내애서도 인터페이스 정의 가능
	public interface hello {
		public void helloWorld();
	}
	
	public static void main(String[] args) {
		// 주어진 클래스의 슈퍼 클래스를 리턴.
//		Class clazz = java.lang.String.class; // <- 보통 관례로 Class의 참조변수는 clazz로 쓴다
//		Class c2 = clazz.getSuperclass();
		// ↓ 등가
		Class c1 = java.lang.String.class.getSuperclass();
		
		// .getClasses();
		// 상속된 멤버를 포함하여 
		// 클래스의 멤버인 모든 public 클래스(static nested 또는 inner 클래스), 
		// 인터페이스 및 enum형을 리턴합니다.
		Class<?>[] cs = Character.class.getClasses();
		for (Class clazz : cs)
		    System.out.println(clazz.getTypeName());

		System.out.println("-------------------------------");
		
		Class<?>[] cs2 = Character.class.getDeclaredClasses();
		for (Class clazz : cs2)
		    System.out.println(clazz.getTypeName());
		
		System.out.println("-------------------------------");
		
		
		try {
			//Modifier.PUBLIC;
			Field f = System.class.getField("out"); // out이라는 필드를 가져 오겠다
			Class c = f.getDeclaringClass();
			int a = 0;
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(MyClass.c);
		
		Class c = Thread.State.class.getEnclosingClass();
		
		return ;
	}

}

class MyClass {
    static Object o = new Object() {
        public void m() {} 
    };
    
    static Class<?> c = o.getClass().getEnclosingClass();
}
