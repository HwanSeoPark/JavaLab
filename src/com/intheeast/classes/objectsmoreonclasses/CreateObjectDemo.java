package com.intheeast.classes.objectsmoreonclasses;

public class CreateObjectDemo {

	public static void helloScope(Point point) {
		// 변수에 보관된 참조 값은 변수가 스코프(scope)를 벗어날 때 일반적으로 제거됩니다.
		// 로컬(참조) 변수 : 이 변수의 생명주기는... helloScope가 호출되고 리턴될 때
		//               소멸된다.
		Point hello = point;
		
		return;
	}
	
	public static void main(String[] args) {

		
		
        // 하나의 Point 객체와 두 개의 Rectangle 객체를 선언하고 생성합니다.
        Point originOne = new Point(23, 94);
        
        CreateObjectDemo.helloScope(originOne);
      
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // rectOne의 너비, 높이 및 면적을 출력합니다.
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // rectTwo의 위치를 설정합니다.
        rectTwo.origin = originOne;

        // rectTwo의 위치를 출력합니다.
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        // rectTwo를 이동시키고 새로운 위치를 출력합니다.
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    
      
 ///////////////////////////////////////////////////
        Rectangle rectThree = new Rectangle();
        int height = rectThree.getHeight();
 ////////////////////////////////////////////////////       
        // new Rectangle(), 이 expression이 생성하는 참조 값...
        // 참조 값에 멤버 엑세스 연산자를 사용해서 인스턴스의 멤버들을 사용 또는 호출할 수 있음.
        height = new Rectangle().getHeight();// 위에 두 코드랑 같은 코드	
        // chaining method 호출 방식... 빌드 패턴을... 
        
        
        Object obj;
        EmptyClass emptyClass = new EmptyClass();
        
        System.out.println("Good-Bye");
	}
}
