package com.intheeast.classes.nestedclass.interfacequiz;

import com.intheeast.interfaces.Shape;

public class Triangle implements Shape {
	
	private Point[] vertices = new Point[Shape.TRI_VER_NUM];
	// Point 클래스 객체의 인스턴스 참조 값을 저장할 수 있는 Element가
	// 3개인 Array가 만들어짐
	// vertices[0] = null
	// vertices[1] = null
	// vertices[2] = null
	// 이 배열의 Element(참조 변수)는 결국 무엇을 저장
	// : 참조 값을 저장
	
	public static final int TOP_VERTEX_INDEX = 0;
	
	public Triangle(Point[] points) {
		if (points.length == 3) {
			for (int i=0; i<vertices.length; i++) {
				vertices[i] = points[i];
			}
		} else {
			System.out.println("Triangle Constructor Ooops!!!");
		}		
	}

	@Override
	public double calculateArea() {
		double base = Math.abs(vertices[1].getX() - vertices[2].getX());
		double height = Math.abs(vertices[TOP_VERTEX_INDEX].getY() - vertices[1].getY());
		double area = (base * height) / 2;
		return area;
	}

	@Override
	public Point[] getVertices() {
		
		return vertices;
	}

	@Override
	public void printName() {
		System.out.println(Shape.TRIANGLSE);		
	}

}
