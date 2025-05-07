package com.intheeast.classes;

import java.awt.Point;
import java.awt.Polygon;

public class PolygonExample extends Polygon{

	public PolygonExample() {}
	
	private int[] ordinates = new int[5];
	
	// 파라미터의 아규먼트로 배열을 전달받음
	// 이 배열의 엘리먼트의 데이터 타입은 정수
	public void setPoint(int[] ordinates) {
		for(int i=0; i<this.ordinates.length; i++) {
			this.ordinates[i] = ordinates[i];
		}
	}
	
	
	// 파라미터의 아규먼트로 배열을 처음으로 전달해 봤다
	// 이 배열의 엘리먼트의 데이터 타입은 Point 클래스 객체의 인스턴스에 대한
	// 참조 값
//	public Polygon polygonFrom(Point[] corners) {
//		
//		for (Point point : corners) {
//			System.out.println(point);
//			this.addPoint(point.x, point.y);
//		}		
//		return this;
//	}
	
	// Duplicate method polygonFrom(Point...) in type PolygonExample
	// Point[] corners와 Point... corners는 동일한 코드임
	// Arbitray Number of Arguments
	// : 이 메서드에게 전달할 Point 타입의 아규먼트 개수가 지정되지 않았다
	//   이 메서드를 호출하는 호출자는 이 메서드를 호출할 때,
	//   이 메서드의 Point 타입의 아규먼트 하나를 전달할 수도 있고,
	//   두 개를 전달할 수도 있고
	//   세 개를 전달할 수도 있고,
	//   ... (정해지지 않았다)
	public Polygon polygonFrom(Point... corners) {
	    
		for (Point point : corners) {
			System.out.println(point);
			this.addPoint(point.x, point.y);
		}
	
	    return this; // 자기 자신을 리턴할 수 있다.
	}
	// 잘못된 varargs(Variable Argument)
//	public void afterVariableArgumet(String ...strings, int a ) {
//									// 아규먼트가 몇개올지도 모르는데, int a값을 알수가 없다
//	}
	
	
}
