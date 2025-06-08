package com.intheeast.jdkproxy.nontimeproxy.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.ZonedDateTime;

public class GreetingServiceImpl implements GreetingService {
	
	private static final String LOG_FILE = "method_invocation.log";
	
	public void sayHello(String name) {
		ZonedDateTime now = ZonedDateTime.now();
        System.out.printf("🕒 [%s] 메서드 호출됨: %s()%n", now, "sayHello");

		System.out.println("👋 Hello, " + name);
	}
	
	public void logToFile() {
		ZonedDateTime time = ZonedDateTime.now();
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.printf("[%s] 호출된 메서드: %s()%n", time, "sayHello");
        } catch (IOException e) {
            System.err.println("⚠️ 로그 파일 기록 실패: " + e.getMessage());
        }
    }

}
