package com.intheeast.cglibdemo.service;

public class GreetingService {
	
	public void sayHello(String name) {
		System.out.println("👋 Hello, " + name);
	}

// 디버깅시 여기 타켓 클래스의 메서드가 호출될때
// GreetingService$$EnhancerByCGLIB$$8c6cc991(GreetingService).sayHello(String) line: 6	
//              ↑   (GreetingService) 이걸로 타켓 클래스를 표시하는걸 볼수 있음
// GreetingService$$EnhancerByCGLIB$$ <-이게 SubClass

// CGLIB가 생성하는 Proxy클래스를 이용하는걸 볼수가 있음
	
	public void sayGoodBye(String name) {
		System.out.println("👋 Good bye, " + name);
	}
	
	public void sayGoodNight(String name) {
		System.out.println("👋 Good Night, " + name);
	}
	
	
}