package com.intheeast.reflection.arraysandenumeratedtypes.enums;

import java.util.Arrays;
import static java.lang.System.out;

enum Eon { HADEAN, ARCHAEAN, PROTEROZOIC, PHANEROZOIC }

public class EnumConstants {
    public static void main(String... args) {
	    try {
	        Class<?> c = (args.length == 0 ? Eon.class : Class.forName(args[0]));
	        if (c.isEnum()) {
		        out.format("Enum name:  %s%nEnum constants:  %s%n",
		               c.getName(), Arrays.asList(c.getEnumConstants()));
		        if (c == Eon.class)
			        out.format("  Eon.values():  %s%n",
			               Arrays.asList(Eon.values()));
	        }
	        // 실제 코드에서는 이 예외를 더 우아하게 처리해야 합니다.
	    } catch (ClassNotFoundException x) {
	        x.printStackTrace();
	    }
    }
}