package com.intheeast.reflection.classes.discoveringclassmembers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import static java.lang.System.out;

enum ClassMember { CONSTRUCTOR, FIELD, METHOD, CLASS, ALL }

public class ClassSpy {
    public static void main(String... args) {
    	
		try {
		    Class<?> c = Class.forName(args[0]);
		    out.format("Class:%n  %s%n%n", c.getCanonicalName());
	
		    Package p = c.getPackage();
		    out.format("Package:%n  %s%n%n",
			       (p != null ? p.getName() : "-- No Package --"));
	
		    for (int i = 1; i < args.length; i++) {
				switch (ClassMember.valueOf(args[i])) {
				case CONSTRUCTOR:
				    printMembers(c.getConstructors(), "Constructor");
				    break;
				case FIELD:
				    printMembers(c.getFields(), "Fields");
				    break;
				case METHOD:
				    printMembers(c.getMethods(), "Methods");
				    break;
				case CLASS:
				    printClasses(c);
				    break;
				case ALL:
				    printMembers(c.getConstructors(), "Constuctors");
				    printMembers(c.getFields(), "Fields");
				    printMembers(c.getMethods(), "Methods");
				    printClasses(c);
				    break;
				default:
				    assert false;
				}
		    }
	
	        // production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
		    x.printStackTrace();
		}
    }

    private static void printMembers(Member[] mbrs, String s) {
		out.format("%s:%n", s);
		for (Member mbr : mbrs) {
		    if (mbr instanceof Field)
		    	/* toGenericString 메서드
		    	 이 메서드는 타입 파라미터를 포함하여 해당 메서드를 설명하는 문자열을 리턴.
                 이 문자열은 메서드의 접근 제어자(있는 경우)로 시작하며, 
                 이어서 꺾쇠 괄호(<>)로 묶인 쉼표로 구분된 메서드의 타입 파라미터 목록(있는 경우), 
                 타입 파라미터의 제한(bound)이 있는 경우 이를 포함한 목록이 옴. 
                 그 다음에는 메서드의 제네릭 리턴 타입이 오고, 공백이 뒤따른 후, 
                 이 메서드를 선언한 클래스 이름, 마침표, 메서드 이름, 
                 괄호로 묶인 메서드의 제네릭 타입 파라미터 타입 리스트(쉼표로 구분됨)가 이어짐.
				 만약 이 메서드가 가변 인자를 받도록 선언된 경우, 
				 마지막 파라미터는 "Type\[]" 대신 "Type..."으로 표기.
				 공백은 액세스 제어자 간, 그리고 액세스 제어자와 타입 파라미터 
                 또는 리턴 타입 사이를 구분하는 데 사용.
				 타입 파라미터가 없으면, 해당 리스트는 생략. 
				 타입 파라미터 리스트가 존재할 경우, 클래스 이름 앞에 공백이 삽입.
				 메서드가 예외를 던지도록 선언된 경우, 
				 파라미터 리스트 뒤에 공백, `throws` 키워드, 
				 쉼표로 구분된 제네릭 예외 타입 리스트가 따라옴.
                 액세스 제어자는 자바 언어 명세서에 따라 표준 순서로 나열:
                 `public`, `protected`, `private` 중 하나가 먼저 오고, 
                 그 다음에는 다음 순서로 다른 지정자들이 옴:
				 `abstract`, `default`, `static`, `final`, `synchronized`, `native`, `strictfp`.
				 */
		    	out.format("  %s%n", ((Field)mbr).toGenericString());
		    else if (mbr instanceof Constructor)
		    	out.format("  %s%n", ((Constructor)mbr).toGenericString());
		    else if (mbr instanceof Method)
		    	out.format("  %s%n", ((Method)mbr).toGenericString());
		}
		
		if (mbrs.length == 0)
		    out.format("  -- No %s --%n", s);
		
		out.format("%n");
    }

    private static void printClasses(Class<?> c) {
		out.format("Classes:%n");
		Class<?>[] clss = c.getClasses();
		for (Class<?> cls : clss)
		    out.format("  %s%n", cls.getCanonicalName());
		
		if (clss.length == 0)
		    out.format("  -- No member interfaces, classes, or enums --%n");
		
		out.format("%n");
    }
}