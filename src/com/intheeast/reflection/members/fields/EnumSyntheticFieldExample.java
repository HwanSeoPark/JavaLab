package com.intheeast.reflection.members.fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EnumSyntheticFieldExample {

    enum Color {
        RED, GREEN, BLUE
        
        /* 컴파일러가 내부적으로 아래처럼 생성함
        private static final Color[] $VALUES = { RED, GREEN, BLUE };

        public static Color[] values() {
            return $VALUES.clone();  // 배열 복사본 반환
        }
        */
    }

    public static void main(String[] args) {
        // values() 메서드는 암시적으로 $VALUES 필드를 사용함
        for (Color c : Color.values()) {
            System.out.println("Color: " + c);
        }

        System.out.println("\nDeclared Fields in enum Color:");
        Field[] fields = Color.class.getDeclaredFields();
        for (Field field : fields) {
            boolean isSynthetic = field.isSynthetic();
            int modifiers = field.getModifiers();
            System.out.printf("Field: %-15s | Synthetic: %-5s | Modifiers: %s\n",
                    field.getName(), isSynthetic, Modifier.toString(modifiers));
        }
    }
}