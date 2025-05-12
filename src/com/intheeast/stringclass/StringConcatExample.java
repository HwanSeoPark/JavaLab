package com.intheeast.stringclass;

public class StringConcatExample {

	public static void main(String... args) {
		
		String hello = "hello ";
		String world = "world";
		
		String concates = hello.concat(world);
						// 문자열을 이어주는 인스턴스 메서드
		
		concates = "My name is ".concat("Rumplestiltskin");
					// 이런 코딩은 하드코딩임
		
		System.out.println(hello.concat(world));
		System.out.println(concates);
		
		return;
	}
}
