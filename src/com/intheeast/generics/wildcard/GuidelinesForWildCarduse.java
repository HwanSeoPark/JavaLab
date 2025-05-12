package com.intheeast.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class GuidelinesForWildCarduse {

	public static void copy(/*IN Variable*/List<? extends Integer> src, 
							/*OUT Variable*/List<? super Integer> dest) {
		
		for(int i = 0; i<src.size(); i++) {
			dest.add(src.get(i)); // set을 사용 가능함
									 // super 키워드를 사용하였기 때문에
									 // Integer를 포함한 조상 클래스
			                         // "is a" 관계이기에 set 메서드를 사용 가능함
			
		}
	}

	public static void copy2(/*IN Variable*/List<? extends Integer> src, 
							 /*OUT Variable*/List<? super Integer> dest) {

		// 코드가 in 및 out 변수로 변수에 액세스해야 하는 경우 	
		Integer intV = src.get(0);

	}
	
	public static void printObj(/*IN Variable*/List<?> src) {
		
		for(Object obj : src) {
		    System.out.println(obj.toString());
		}
				
	}

	
	public static void main(String... args) {
		List<Integer> list1 = new ArrayList<>();
		for(int i=0; i<5; i++) {
			list1.add(i);
		}
	
		List<Integer> list2 = new ArrayList<>();
		
		copy(list1, list2);
	
		printObj(list1);
	}
}
