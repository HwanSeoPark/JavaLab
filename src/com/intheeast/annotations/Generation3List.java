package com.intheeast.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

@ClassPreamble (
	author = "John Doe",
	date = "3/17/2002",
	currentRevision = 6,
	lastModified = "4/12/2004",
	lastModifiedBy = "Jane Doe",
	// Note array notation
	reviewers = {"Alice", "Bob", "Cindy"}
)

@SuppressWarnings("Generation3List")
public class Generation3List {

	//@Target({TYPE, 
	//		   FIELD, 
	//         METHOD, 
	//         PARAMETER,
	//         CONSTRUCTOR,
	//         LOCAL_VARIABLE,
	//         MODULE})
	
	@SuppressWarnings("a")
	private int a;
	
	@SuppressWarnings("default constructor")
	public Generation3List() {
		
	}
	
	@SuppressWarnings("hello")
	public void hello() {
		@SuppressWarnings("hello local")String hello = "Hello!";
	}
	
	public void world(@SuppressWarnings("world")String world) {
		
	}
	
	// good 참조값이 null 이면 안된다(특정 문자열 값을 주는지 확인한다)
//	public void good(@NonNull String good) {
//		
//	}

	// raw type 쓰지마라
//	public class MyClass<@NonNull T> {
//	    // 클래스 내용
//	} 

}
