package com.intheeast.reflection.arraysandenumeratedtypes.arrays;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import static java.lang.System.out;

public class ArrayFind {
    public static void main(String... args) {
    	
	    boolean found = false;
	    try {
	        Class<?> cls = Class.forName(args[0]);
	        Field[] flds = cls.getDeclaredFields();
	        for (Field f : flds) {
	        	Class<?> c = f.getType();
		        if (c.isArray()) {
		            found = true;
		            out.format("%s%n"
		                               + "           Field: %s%n"
		                   + "            Type: %s%n"
		                   + "  Component Type: %s%n",
		                   f, f.getName(), c, c.getComponentType());
		        }
	        }
	        
	        if (!found) {
	        	out.format("No array fields%n");
	        }
	
	        // 실제 코드에서는 이 예외를 더 우아하게 처리해야 합니다.
	    } catch (ClassNotFoundException x) {
	        x.printStackTrace();
	    }
    }
}