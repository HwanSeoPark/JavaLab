package com.intheeast.reflection.classes.retrievingclassobjects;

public class ClassforName {

	public static void main(String[] args) {
		// Void도 클래스가 있다
		Void voidClass;
		
		Class c = null;
		// MyLocaleServiceProvider는 텅빈 클래스라 예외 처리함
		try {
			c = Class.forName("com.intheeast.reflection.classes.retrievingclassobjects.MyLocaleServiceProvider");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cDoubleArray = null;
		try {
			cDoubleArray = Class.forName("[D");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cStringArray = null;
		try {
			cStringArray = Class.forName("[[Ljava.lang.String;");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
