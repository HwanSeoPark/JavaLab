package com.intheeast.reflection.members.methods;

public enum Level {

	// enum 상수들..
	// 컴파일러가 알아서 만들어 준다.
	GOLD(3, null), SILVER(2, GOLD), BASIC(1, SILVER);	 
		
	private final int value;
	private final Level next; 
	
	// 컨스트럭터
	Level(int value, Level next) {  
		this.value = value;
		this.next = next; 
	}
	
	// 일반 메서드
	public int intValue() {
		return value;
	}
	
	// 일반 메서드
	public Level nextLevel() { 
		return this.next;
	}	

	// 데이터베이스에서는 자바의 enum 데이터 타입을 데이터베이스 테이블의 row의 컬럼으로  insert할 수 없음
	// 그래서 value를 호출해 Enum을 복원하는 코드가 있다
	public static Level valueOf(int value) {
		switch(value) {
		case 1: return BASIC;
		case 2: return SILVER;
		case 3: return GOLD;
		default: throw new AssertionError("Unknown value: " + value);
		}
	}

}
