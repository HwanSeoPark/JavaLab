package com.intheeast.classes.nestedclass;

public class OuterClass {

	 private int outerField;
	 private InnerClass innerClassInstance; // InnerClass 객체 참조 변수

	    public OuterClass(int outerField) {
	        this.outerField = outerField;
	        this.innerClassInstance = new InnerClass(); // 디폴트 생성자로 초기화
	    }

	    // 외부 클래스의 인스턴스 메서드
	    public void outerMethod() {
	        System.out.println("Outer class method.");
	    }

	    // non-static 내부 클래스
	    public class InnerClass {
	        private int innerField;

	        // 디폴트 생성자
	        public InnerClass() {
	            this.innerField = 0;
	        }

	        // 파라미터를 받는 생성자
	        public InnerClass(int innerField) {
	            this.innerField = innerField;
	        }

	        // 내부 클래스의 메서드
	        public void innerMethod() {
	            // 내부 클래스는 외부 클래스의 필드와 메서드에 접근할 수 있음
	            System.out.println("Outer field: " + outerField);
	            outerMethod();

	            // 내부 클래스의 자체 필드에 접근
	            System.out.println("Inner field: " + innerField);

	            // this 키워드 사용
	            System.out.println("Inner class this: " + this);
	            System.out.println("Outer class this: " + OuterClass.this);
	        }

	        // 내부 클래스에서 외부 클래스의 메서드를 호출하는 메서드
	        public void callOuterMethod() {
	            OuterClass.this.outerMethod();
	        }

	        // 외부 클래스의 필드를 수정하는 메서드
	        public void modifyOuterField(int newValue) {
	            OuterClass.this.outerField = newValue;
	            System.out.println("Outer field modified to: " + outerField);
	        }
	    }

	    // OuterClass에서 InnerClass의 메서드 호출
	    public void callInnerMethod() {
	        innerClassInstance.innerMethod();
	    }

	    // OuterClass에서 InnerClass 인스턴스를 변경하는 메서드
	    public void setInnerClassInstance(int innerField) {
	        this.innerClassInstance = new InnerClass(innerField);
	    }

	    // OuterClass에서 InnerClass 인스턴스를 생성하는 메서드
	    public InnerClass createInnerClassInstance(int innerField) {
	        return new InnerClass(innerField);
	    }

	
}
