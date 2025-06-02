package com.intheeast.reflection.arraysandenumeratedtypes.enums;

import java.lang.reflect.Field;
import static java.lang.System.out;

enum TraceLevel { OFF, LOW, MEDIUM, HIGH, DEBUG }

class MyServer {
    private TraceLevel level = TraceLevel.OFF;
}

public class SetTrace {
    public static void main(String... args) {
    	TraceLevel newLevel = TraceLevel.valueOf(args[0]);

	    try {
	        MyServer svr = new MyServer();
	        Class<?> c = svr.getClass();
	        Field f = c.getDeclaredField("level");
	        f.setAccessible(true);
	        TraceLevel oldLevel = (TraceLevel)f.get(svr);
	        out.format("Original trace level:  %s%n", oldLevel);
	
	        if (oldLevel != newLevel) {
	        	f.set(svr, newLevel);
	        	out.format("    New  trace level:  %s%n", f.get(svr));
	        }
	
	        // 실제 코드에서는 이 예외를 더 우아하게 처리해야 합니다.
	    } catch (IllegalArgumentException x) {
	        x.printStackTrace();
	    } catch (IllegalAccessException x) {
	        x.printStackTrace();
	    } catch (NoSuchFieldException x) {
	        x.printStackTrace();
	    }
    }
}