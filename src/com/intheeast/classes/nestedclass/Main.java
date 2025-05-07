package com.intheeast.classes.nestedclass;

import com.intheeast.classes.nestedclass.DefiningInnerAndStaticClassOuterClass.StaticNestedClass;

public class Main {
	
	public static void testAllNestedClasses() {
		System.out.println("Inner class:");
        System.out.println("------------");
       
        DefiningInnerAndStaticClassOuterClass outerObject = 
        		new DefiningInnerAndStaticClassOuterClass();
        
        // Inner[non-static nested] class의 인스턴스를 만드는 방법
        // 무조건 Outer class의 인스턴스 작업이 선행되어야 함
        DefiningInnerAndStaticClassOuterClass.InnerClass innerObject = 
        		outerObject.new InnerClass();
       
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        
        StaticNestedClass staticNestedObject = new StaticNestedClass(); 
        // static nested class 도 인스턴스 화 할수 있긴하다.
        // static nested class의 인스턴스가 필요하다면,
        // 굳이 outer class의 static nested class로 정의할 필요가 있는가?
        // 그냥 outer class가 위치한 패키지에 별도의 클래스로 정의하는 것이 나을지도 모른다.
        
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nStatic nested class accessed from OuterClass:");
        System.out.println("---------------------------------------------");
        outerObject.callStaticNestedMethod();

        System.out.println("\nTop-level class:");
        System.out.println("----------------");
        
        // 교재에서 일컫는 최상위 레벨의 클래스라는 것은,
        // 단순히, 중첩 클래스 관점에서 보면...
        // 일반적인 클래스 또는 중첩 클래스를 정의한 클래스임!!!
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);     
	}
	
	/*
	public static void testInnerClasses() {
		OuterClass outer = new OuterClass(10);

        // 디폴트 생성자를 사용하여 비정적(non-static) 내부 클래스의 인스턴스 생성
		// OuterClass 외부에서 OuterClass의 non-static nested class를 생성하려면,
		// 항상 OuterClass 인스턴스를 먼저 생성하여야 함!!!
        InnerClass inner1 = outer.new InnerClass();
        inner1.innerMethod();

        // 파라미터를 전달받는 생성자를 사용하여 내부 클래스의 인스턴스 생성
        InnerClass inner2 = outer.new InnerClass(20);
        inner2.innerMethod();

        // 외부 클래스의 메서드를 내부 클래스에서 호출
        inner2.callOuterMethod();

        // 내부 클래스에서 외부 클래스의 필드를 수정
        inner2.modifyOuterField(100);

        // 외부 클래스에서 내부 클래스의 메서드 호출
        outer.callInnerMethod();

        // 외부 클래스에서 내부 클래스의 인스턴스를 변경
        outer.setInnerClassInstance(50);
        outer.callInnerMethod();

        // 외부 클래스에서 내부 클래스의 인스턴스를 생성하는 메서드 사용
        InnerClass inner3 = outer.createInnerClassInstance(30);
        inner3.innerMethod();
	}
	*/
	public static void main(String[] args) {
		//Main.testInnerClasses();
		
		Main.testAllNestedClasses();
		
	}

}
