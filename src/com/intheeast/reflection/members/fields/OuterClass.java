package com.intheeast.reflection.members.fields;

import java.lang.reflect.Field;

public class OuterClass {

    private String outerField = "Outer Field";

    class InnerClass {
        private String innerField = "Inner Field";

        public void printOuterField() {
            System.out.println("Accessing from inner: " + outerField);
        }
    }

    public static void main(String[] args) {
        // 내부 클래스 인스턴스 생성
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();

        inner.printOuterField();

        // 내부 클래스의 합성 필드 출력
        System.out.println("\nDeclared Fields in InnerClass:");
        Field[] fields = InnerClass.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("Field: %s, Synthetic: %b\n", field.getName(), field.isSynthetic());
        }
    }
}
