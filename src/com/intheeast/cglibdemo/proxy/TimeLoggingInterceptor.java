package com.intheeast.cglibdemo.proxy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.ZonedDateTime;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TimeLoggingInterceptor implements MethodInterceptor {
	
	// C:\development\Workspace\codes\java_proj\JavaLabs
	private static final String LOG_FILE = "method_invocation.log";
	
	private ZonedDateTime printZoneDateTime(Method method) {
		ZonedDateTime now = ZonedDateTime.now();
        System.out.printf("🕒 [%s] 메서드 호출됨: %s()%n", now, method.getName());
        return now;
	}
	
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
    	ZonedDateTime now = printZoneDateTime(method);
    	
        Object result = proxy.invokeSuper(obj, args);

        logToFile(now, method); // 호출 이후 로그 파일 기록
        
        return result;
    }
    
    private void logToFile(ZonedDateTime time, Method method) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.printf("[%s] 호출된 메서드: %s()%n", time, method.getName());
        } catch (IOException e) {
            System.err.println("⚠️ 로그 파일 기록 실패: " + e.getMessage());
        }
    }
}