package com.intheeast.classes.nestedclass.interfacequiz;

import com.intheeast.interfaces.Shape;

public class Square implements Shape {

	private Point[] vertices = new Point[Shape.SQUARE_VER_NUM];
	
	
	public static final int TOP_VERTEX_INDEX = 0;
	
	public Square(Point[] points) {
		if (points.length == 4) {
			for (int i=0; i<vertices.length; i++) {
				vertices[i] = points[i];
			}
		} else {
			System.out.println("Square Constructor Ooops!!!");
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
		System.out.println(Shape.SQUARE);		
	}
	
}
