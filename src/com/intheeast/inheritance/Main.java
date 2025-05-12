package com.intheeast.inheritance;

import com.intheeast.inheritance.SubClass2.SubNestedClass;
import com.intheeast.inheritance.SuperClass2.NestedClass;

public class Main {

	public static void main(String[] args) {
		
		SuperClass2 sp2 = new SuperClass2();
		// SuperClass2의 멤버인 class NestedClass가 보이질 않음!!!
		// sp2.
		
		
		SubClass2 sc = new SubClass2();
		System.out.printf("getPrivateField:%d \n", sc.getPrivateField());
		System.out.printf("getSuperPrivateField:%d \n", sc.getSuperPrivateField());

		NestedClass nc = sc.new NestedClass();
		nc.accessPrivateField();
		
		SubNestedClass snc = sc.new SubNestedClass();
		snc.accessSuperPrivateField();

	}

}
