package com.intheeast.interfaces;

import com.intheeast.classes.nestedclass.interfacequiz.Point;

public interface Shape {
	
	public static final String TRIANGLSE = "TRIANGLSE";
	public static final String SQUARE = "SQUARE";
	public static final String CIRCLE = "CIRCLE";
	
	public static final int TRI_VER_NUM = 3;
	public static final int SQUARE_VER_NUM = 4;


    // 도형의 면적을 구하는 메서드
    double calculateArea();

    // 도형의 각 꼭지점을 구하는 메서드 (예: 좌표 목록 반환)
    Point[] getVertices();

    // 도형의 이름을 콘솔에 출력하는 메서드
    void printName();
}