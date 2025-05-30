package com.intheeast.reflection.members.fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static java.lang.System.out;

// ENUM$VALUES에는 (ENUM$VALUES는 컴파일러가 만듬)
// private static final이 적용 돼 있음
// 생성자 Spy(BLACK)로 만들어지는 인스턴스 하나랑
// 생성자 Spy(WHITE)로 만들어지는 인스턴스 하나
// ENUM$VALUES는 위 두개의 인스턴스를 저장하는 배열
enum Spy { BLACK , WHITE }

public class FieldModifierSpy {
    volatile int share; // package-priavte[default]는 상수값으로 0이다 -> 등록 자체가 안되어있음
    public int instance;
    private transient static final Inner inner = null;
    
    class Inner {  // 이너 클래스도 멤버임, 근데 필드 멤버는 아니다
    	
//    	public FieldModifierSpy$Inner(final FieldModifierSpy this$0) {
//    		this.this$0 = this$0;
//    		System.out.println("Outer Class : " + String.valueOf(this$0));
//    	} ↑ 컴파일러가 내부적으로 이렇게 만듬
	public Inner() {
		System.out.println("Outer Class : " + FieldModifierSpy.this);
								// 컴파일러가 내부적으로  FieldModifierSpy.this를
								//                String.valueOf(this$0)으로 만듬
   		}
    }

    public static void main(String... args) {
    	
		try {
		    Class<?> c = Class.forName(args[0]);
		    int searchMods = 0x0;
		    for (int i = 1; i < args.length; i++) {
		    	searchMods |= modifierFromString(args[i]);
		    	// 제어자는 상수값으로 정리되어 있음
		    	// 그래서 상수값을 얻어 옴
		    }
	
		    Field[] flds = c.getDeclaredFields();
		    out.format("Fields in Class '%s' containing modifiers:  %s%n",
			       c.getName(),
			       Modifier.toString(searchMods));
		    boolean found = false;
		    for (Field f : flds) {
				int foundMods = f.getModifiers();
				// Require all of the requested modifiers to be present
				if ((foundMods & searchMods) == searchMods) {
				    out.format("%-8s [ synthetic=%-5b enum_constant=%-5b ]%n",
					       f.getName(), f.isSynthetic(), // .isSynthetic() -> 컴파일러가 만들었냐? 라는 메서드
					       f.isEnumConstant()); // isEnumConstant() -> 열거(enum)형 상수냐? 라는 메서드
				    found = true;
				}
		    }
	
		    if (!found) {
		    	out.format("No matching fields%n");
		    }
	
	        // production code should handle this exception more gracefully
		} catch (ClassNotFoundException x) {
		    x.printStackTrace();
		}
    }

    private static int modifierFromString(String s) {
		int m = 0x0;
		if ("public".equals(s))           m |= Modifier.PUBLIC;
		else if ("protected".equals(s))   m |= Modifier.PROTECTED;
		else if ("private".equals(s))     m |= Modifier.PRIVATE;
		else if ("static".equals(s))      m |= Modifier.STATIC;
		else if ("final".equals(s))       m |= Modifier.FINAL;
		else if ("transient".equals(s))   m |= Modifier.TRANSIENT;
		else if ("volatile".equals(s))    m |= Modifier.VOLATILE;
		return m;
    }
}