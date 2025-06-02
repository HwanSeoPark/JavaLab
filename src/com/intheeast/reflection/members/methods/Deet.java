package com.intheeast.reflection.members.methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import static java.lang.System.out;
import static java.lang.System.err;

public class Deet<T> {
	
    private boolean testDeet(Locale l) {
		// getISO3Language() may throw a MissingResourceException
		out.format("Locale = %s, ISO Language Code = %s%n", l.getDisplayName(), l.getISO3Language());
		return true;
    }

    private int testFoo(Locale l) { return 0; }
    
    private boolean testBar() { return true; }

    
    // arg0 : com.intheeast.reflection.members.methods.Deet
    // arg1 : ja
    // arg2 : JP
    // arg3 : JP
    public static void main(String... args) throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (args.length != 4) {
		    err.format("Usage: java Deet <classname> <langauge> <country> <variant>%n");
		    return;
		}
	
		try {
		    Class<?> c = Class.forName(args[0]);
		    //Object target = c.getDeclaredConstructor().newInstance();
		    Constructor<?> ctor = c.getDeclaredConstructor();
	        ctor.setAccessible(true);  // private 생성자에도 접근 가능
	        Object target = ctor.newInstance(); // 전달된 Deet 클래스 객체의 인스턴스를 생성
	        // Deet deet = new Deet(); 코드와 등가
	        
		    Method[] allMethods = c.getDeclaredMethods();
		    for (Method m : allMethods) {
				String mname = m.getName();
				if (!mname.startsWith("test")
				    || (m.getGenericReturnType() != boolean.class)) {
				    continue;
				}
				
		 		Type[] pType = m.getGenericParameterTypes();
		 		if ((pType.length != 1)
		 			// public boolean isAssignableFrom(Class<?> cls)
		 			// cls 타입의 객체를 현재 Class(Locale) 객체 타입으로 변환할 수 있는가?
		 			// :즉, cls 타입이 현재 클래스의 서브타입인지 확인.
				    || Locale.class.isAssignableFrom(pType[0].getClass())) {
		 		    continue;
		 		}
	
				out.format("invoking %s()%n", mname);
				try {
				    m.setAccessible(true);
				    // 
				    Object o = m.invoke(target, new Locale(args[1], args[2], args[3]));
				    out.format("%s() returned %b%n", mname, (Boolean) o);
		
				// Handle any exceptions thrown by method to be invoked.
				} catch (InvocationTargetException x) {
				    Throwable cause = x.getCause();
				    err.format("invocation of %s failed: %s%n",
					       mname, cause.getMessage());
				}
		    }
	
	        // production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
		    x.printStackTrace();
		} catch (InstantiationException x) {
		    x.printStackTrace();
		} catch (IllegalAccessException x) {
		    x.printStackTrace();
		}
    }
}