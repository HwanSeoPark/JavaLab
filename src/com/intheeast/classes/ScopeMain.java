package com.intheeast.classes;

public class ScopeMain {

	// ScopeMain 클래스 변수인 scopeMainStr의 scope?
	// Jvm이 실행되면 메서드 영역에 scopeMain의 변수의 정보가 올라가
	// ScopeMain 클래스 코드가 Jvm 가비지 콜렉션 타겟이 되는 순간까지 어디서든 사용가능
	public static String scopeMainStr = "Scope Problem";
	
	public static void whatIsScope() {
		
		int a = 0; // Local/Auto 변수
				   // 이 변수를 사용할 수 있는 범위는 이 braces 범위만 가능
	
	}
	
	public static void main(String[] args) {
//		a = 1; // a cannot be resolved to a variable

		
	}

}
