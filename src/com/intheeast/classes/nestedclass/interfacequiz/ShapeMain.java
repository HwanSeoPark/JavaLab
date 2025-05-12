package com.intheeast.classes.nestedclass.interfacequiz;

import com.intheeast.interfaces.Shape;

	public class ShapeMain {
		
		public static Shape makeTriangle() {
			Point[] vertices = new Point[3];
			vertices[0] = new Point(5, 10); // new 연산자는 내부적으로 VM에게 해당 클래스 인스턴스를
											// 생성해달라고 요청!!!
											// VM이 인스턴스의 참조 값을 리턴합니다...
											// new Point(5, 10) expression 값으로...
			vertices[1] = new Point(2, 2);
			vertices[2] = new Point(7, 2);
			
			Shape triangle = new Triangle(vertices);
			return triangle;
		}

		public static Shape makeSquare() {
			Point[] vertices = new Point[4];
			vertices[0] = new Point(2, 7);
			vertices[1] = new Point(2, 2);
			vertices[2] = new Point(7, 2);
			vertices[3] = new Point(7, 7);
			
			Shape square = new Square(vertices);
			return square;
		}
		
		
		
		public static void main(String[] args) {

			Shape triangle = makeTriangle();
			double triangleArea = triangle.calculateArea();
			Point[] triangleVertices = triangle.getVertices();
			triangle.printName();
			
			Shape square = makeSquare();
			double squareArea = square.calculateArea();
			Point[] squareVertices = square.getVertices();
			square.printName();
			
			return ;
		}

	

}
