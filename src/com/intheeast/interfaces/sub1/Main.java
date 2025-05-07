package com.intheeast.interfaces.sub1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void compareArea() {
		
		List<String> li;
		
	
		List<String> list =
				new ArrayList<String>();
	
		Collection<String> collection = (Collection<String>)list;
		// list는 ArrayList 객체 인스턴스의 참조타입
		// ArrayList는 List 인터페이스를 구현한 구현체
		// List는 Collection을 상속받고, Iterable도 상속받아서 이런 형태의
		// 코드 작성 가능
		Iterable<String> iterable = (List<String>)collection;
		
		
		Point pi = new Point(40, 40);
		Point pi2 = new Point(40, 40);
		
		Relatable rectangleRel = new RectanglePlus(
				pi, 
				40, 40);
		
		Relatable circleRel = (Relatable) new CirclePlus(pi, 20);
		////////////////////////////////////////////////
		Relatable.findSmallest(rectangleRel, circleRel);
		////////////////////////////////////////////////
		
		RectanglePlus rectanglePlus = new RectanglePlus(
				pi, 
				40, 40);
		CirclePlus circlePlus = new CirclePlus(pi, 20);
		////////////////////////////////////////////////////
		Relatable.findSmallest(rectanglePlus, circlePlus);		
		////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////
		Relatable.findSmallest((Object)rectanglePlus, (Object)circlePlus);
		/////////////////////////////////////////////////////////////////////
	}
	
	public static void main(String... args) {
		
		compareArea();
	}
}
