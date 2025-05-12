package com.intheeast.interfaces;

import java.awt.Point;

public class TrianglePlus implements Relatable {

	public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public TrianglePlus() {
        origin = new Point(0, 0);
    }
    public TrianglePlus(Point p) {
        origin = p;
    }
    public TrianglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public TrianglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public double getArea() {
        return (width * height)/2;
    }
    
    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
    	// Relatable 인터페이스를 구현한 구현체(클래스)의 인스턴스에 대한 참조값으로 형 변환이 가능함!
    	TrianglePlus otherRect 
            = (TrianglePlus)other; // 형 변환 메서드
        							// other이 RectangelePlus의 참조값이여야만
        							// 형 변환이 가능
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;               
    }

}
