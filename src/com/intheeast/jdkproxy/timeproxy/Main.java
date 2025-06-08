package com.intheeast.jdkproxy.timeproxy;

import com.intheeast.jdkproxy.timeproxy.proxy.ProxyFactory;
import com.intheeast.jdkproxy.timeproxy.service.CalculatorService;
import com.intheeast.jdkproxy.timeproxy.service.CalculatorServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.GreetingService;
import com.intheeast.jdkproxy.timeproxy.service.GreetingServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.MathService;
import com.intheeast.jdkproxy.timeproxy.service.MathServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.NewsService;
import com.intheeast.jdkproxy.timeproxy.service.NewsServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.WeatherService;
import com.intheeast.jdkproxy.timeproxy.service.WeatherServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        printTitle("🚀 JDK Dynamic Proxy Demo");

        List<ServiceRunner> services = List.of(
            new ServiceRunner("👋 인사", () -> {
                GreetingService s = createProxy(new GreetingServiceImpl(), GreetingService.class);
                s.sayHello("John");
            }),

            new ServiceRunner("🧮 덧셈", () -> {
                MathService s = createProxy(new MathServiceImpl(), MathService.class);
                int result = s.add(10, 20);
                System.out.println("결과: " + result);
            }),

            new ServiceRunner("🌦️ 날씨", () -> {
                WeatherService s = createProxy(new WeatherServiceImpl(), WeatherService.class);
                System.out.println("결과: " + s.getWeather("서울"));
            }),

            new ServiceRunner("📰 뉴스", () -> {
                NewsService s = createProxy(new NewsServiceImpl(), NewsService.class);
                System.out.println("결과: " + s.getHeadline());
            }),

            new ServiceRunner("✖️ 곱셈", () -> {
                CalculatorService s = createProxy(new CalculatorServiceImpl(), CalculatorService.class);
                System.out.println("결과: " + s.multiply(3.5, 4.2));
            })
        );

        services.forEach(ServiceRunner::run);

        printFooter("✅ 모든 서비스 실행 완료");
    }

    // Generic Proxy 생성기
    private static <T> T createProxy(T target, Class<T> type) {
        return ProxyFactory.createProxy(target, type);
    }

    // 출력 꾸밈
    private static void printTitle(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("        " + title);
        System.out.println("=".repeat(60) + "\n");
    }

    private static void printFooter(String message) {
        System.out.println("\n" + "-".repeat(60));
        System.out.println("        " + message);
        System.out.println("-".repeat(60));
    }

    // 래퍼 클래스
    static class ServiceRunner {
        private final String title;
        private final Runnable action;

        public ServiceRunner(String title, Runnable action) {
            this.title = title;
            this.action = action;
        }

        public void run() {
            System.out.printf("▶ %s 서비스 실행 중...\n", title);
            try {
                action.run();
            } catch (Exception e) {
                System.out.println("❌ 오류 발생: " + e.getMessage());
            }
            System.out.println();
        }
    }
}