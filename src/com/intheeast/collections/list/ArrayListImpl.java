package com.intheeast.collections.list;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListImpl {

	static {
		// Set은 수학의 집합을 모델링한 컬렉션
		Set<String> c = new HashSet<>();
		c.add("1");
		c.add("2");
		c.add("1");
		/*
		 // wildcard upper bounding : Type Argument 제한
	      public ArrayList(Collection<? extends E> c) {
	        Object[] a = c.toArray(); // 엘리먼트의 값을 Array로 변환한다
	        if ((size = a.length) != 0) {
	            if (c.getClass() == ArrayList.class) {
	                elementData = a;
	            } else {
	                           // 복사가 아닌 배열을 새로 만드는 메서드
	                elementData = Arrays.copyOf(a, size, Object[].class);
	            }
	        } else {
	            // replace with empty array.
	            elementData = EMPTY_ELEMENTDATA;
	        }
	    }
        ↓ */		
		List<String> list = new ArrayList<String>(c);
		// Set의 리스트를 List로 만들고 싶을떄 Set의 참조변수를 아규먼트로 전달하고 있음
		// c가 Set 참조변수의 아규먼트
		
		
	}

	public static void main(String[] args) {
		/*
		 public ArrayList() {
		        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		    }
		↓ */
		// 엘리먼트가 하나도 없는 배열[ElementData] 생성
		// 엘리먼트가 하나도 없는 배열을 만들수 있으나
		// 엘리먼트를 추가 할수 없음!!!
		List<String> strList = new ArrayList<>();
		
		// 새로운 배열을 만든다 : 엘리먼트가 10개인 배열 
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		strList.add("5");
		strList.add("6");
		strList.add("7");
		strList.add("8");
		strList.add("9");
		strList.add("10");
		
		strList.add("11");
		
		
	}

}
