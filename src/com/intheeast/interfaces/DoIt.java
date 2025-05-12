package com.intheeast.interfaces;

public interface DoIt {

	 void doSomething(int i, double x);
	 int doSomethingElse(String s);
	 
//	 boolean didItWork(int i, double x, String y);
	 // 이렇게 가상메서드를 추가 해버리면
	 // DoIt 인터페이스를 구현한 클래스들은 이 가상 메서드를 다 작성해야한다
// 이런 상황에 사용하는게 default 메서드
	 default boolean didItWork(int i, double x, String y) {
		 // Method body
		 // ...
		 return true;
	 }
	 



}
