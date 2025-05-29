package com.intheeast.reflection.classes.retrievingclassobjects;

public class DotclassSyntax {
	
	public static void main(String[] args) {
		boolean b;
		//Class c1 = b.getClass();   // 컴파일 타임 에러

		Class c1 = boolean.class;  // 올바른 코드
		
		Class c2 = java.io.PrintStream.class;
		
		Class c3 = int[][][].class;
		
		return ;
		
	}

}
