package com.intheeast.classprv;


// Main 클래스는 Bicycle 클래스의 외부입니다.
public class Main {

	public static void main (String[] args) {
		
		// class name:Bicycle 변수이름 : bicycle
		// Reference Data type...Bicycle 클래스 객체가 절대 아님!!!
		Bicycle bicycle = 
				// new : C++에서 처음 소개되었음
				//       클래스 객체를 인스턴스화하는 키워드
				new Bicycle(); // 엔터를 쳐서 내려도 세미콜론이 한개이기 때문에 여전히 싱글 라인 statement이다

		bicycle.changeCadence(0); // . 은 public로 지정한 것만 액세스 가능하다
	// 커서를 대고 F3을 누르면 위치로 가고 Alt + 왼쪽방향키 누르면 다시 돌아돈다
		bicycle.changeGear(0);
		
		
		Main mainObject = new Main();
	}
}
