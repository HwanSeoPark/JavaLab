package com.intheeast.reflection.classes.retrievingclassobjects;

import java.util.HashSet;
import java.util.Set;

public class ObjectGetClass {
	
	static {
		
	}
	
	public static void main(String[] args) {
		Class c1 = "foo".getClass();
		
		// Exception in thread "main" java.lang.NullPointerException: 
		// Cannot invoke "Object.getClass()" because the return value of "java.lang.System.console()" is null
		// : Java에서 System.console()은 현재 JVM이 콘솔(console) 환경에서 실행되고 있는 경우에만 
		//   유효한 Console 객체를 리턴함. 그런데 이클립스에서 JVM이 실행되는 경우에는 null을 리턴.
		//Class c2 = System.console().getClass();
		
		Class c3 = E.A.getClass();
		
		byte[] bytes = new byte[1024];
		Class c4 = bytes.getClass();
		
		Set<String> s = new HashSet<>();
		Class c5 = s.getClass();
		
		return ;
	}

}

enum E {A, B}