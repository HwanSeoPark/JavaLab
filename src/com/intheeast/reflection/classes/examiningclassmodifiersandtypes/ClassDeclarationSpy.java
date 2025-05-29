package com.intheeast.reflection.classes.examiningclassmodifiersandtypes;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

import static java.lang.System.out;

public class ClassDeclarationSpy {
	
    public static void main(String... args) {
    	
    	ConcurrentNavigableMap cnm;
    	String s;
		try {
		    Class<?> c = Class.forName(args[0]);
		    /* <getCanonicalName 메서드>
		     기저 클래스(Class 객체가 참조하고 있는 실제 자바 클래스)의 정규 이름(canonical name)을 
		     [자바 언어 명세서(The Java Language Specification)]에 정의된 대로 리턴.
			 기저 클래스에 정규 이름이 없으면 null을 리턴.
			 정규 이름이 없는 클래스의 예는 다음과 같음.
			 * 로컬 클래스 (local class)
			 * 익명 클래스 (anonymous class)
			 * 숨겨진 클래스 (hidden class) 
			 * 구성 요소 타입(component type)에 정규 이름이 없는 배열 (예: 로컬 클래스의 배열 등)
		     */
		    out.format("Class:%n  %s%n%n", c.getCanonicalName());
		    out.format("Modifiers:%n  %s%n%n",
			       Modifier.toString(c.getModifiers()));
	
		    out.format("Generic Type Parameters:%n");
		    TypeVariable[] tv = c.getTypeParameters();
		    if (tv.length != 0) {
				out.format("  ");
				for (TypeVariable t : tv)
				    out.format("%s ", t.getName());
				out.format("%n%n");
		    } else {
		    	out.format("  -- No Type Parameters --%n%n");
		    }
	
		    out.format("Implemented Interfaces:%n");
		    Type[] intfs = c.getGenericInterfaces();
		    if (intfs.length != 0) {
				for (Type intf : intfs)
				    out.format("  %s%n", intf.toString());
				out.format("%n");
		    } else {
		    	out.format("  -- No Implemented Interfaces --%n%n");
		    }
	
		    out.format("Inheritance Path:%n");
		    List<Class> l = new ArrayList<Class>();
		    printAncestor(c, l);
		    if (l.size() != 0) {
				for (Class<?> cl : l)
				    out.format("  %s%n", cl.getCanonicalName());
				out.format("%n");
		    } else {
		    	out.format("  -- No Super Classes --%n%n");
		    }
	
		    out.format("Annotations:%n");
		    Annotation[] ann = c.getAnnotations();
		    if (ann.length != 0) {
				for (Annotation a : ann)
				    out.format("  %s%n", a.toString());
				out.format("%n");
		    } else {
		    	out.format("  -- No Annotations --%n%n");
		    }
	
	        // production code should handle this exception more gracefully
		} catch (ClassNotFoundException x) {
		    x.printStackTrace();
		}
    }

    private static void printAncestor(Class<?> c, List<Class> l) {
		Class<?> ancestor = c.getSuperclass();
	 	if (ancestor != null) {
		    l.add(ancestor);
		    printAncestor(ancestor, l);
	 	}
    }
}