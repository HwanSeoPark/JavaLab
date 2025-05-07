package com.intheeast.generics.typeinference.targettype;

import java.util.Collections;
import java.util.List;
import com.intheeast.generics.typeinference.Box;

public class TargetTypeExample {

	public static void process() {
		// emptyList 메서드는 결과적으로 다음의 인스턴스를 생성하는데,,,
		// new EmptyList<>(); -> 문제는 EmptyList의 타입 아규먼트가 생략되어 있음...
		// 그래서, EmptyList의 타입 파라미터의 타입 아규먼트를 추론해야함!!!
		List<String> listOne = Collections.emptyList();
		// List<String> listOne = EMPTY_LIST;
		// EMPTY_LIST는 스테틱 필드의 참조변수
		listOne.add("korea");
		listOne.add("usa");
		String korea = listOne.get(0);
		String usa = listOne.get(1);
		
		System.out.println("Good Bye");
	}
	
	
	public static void main(String[] args) {
		
		// SE7, 8 설치해서 테스트할 수는 있는데...
		// return (List<String>) EMPTY_LIST; 
		// Java SE 7 and 8: Using target type inference
        List<String> listOne = Collections.emptyList();
        System.out.println("listOne: " + listOne);

        // return (List<Integer>) EMPTY_List;
        List<Integer> listTwo = Collections.emptyList();
        
        List<Box<Integer>> listThree =
        		Collections.emptyList();
        
//        listThree.add(intBox);
//        listThree.add(intBox2);
        
//        // Using type argument in Java SE 7 and 8
//        List<String> listTwo = Collections.<String>emptyList();
//        System.out.println("listTwo: " + listTwo);
//
//        // Java SE 7: Type argument is required
//        processStringList(Collections.<String>emptyList()); // This works in both Java SE 7 and 8
//
//        // Java SE 8: Target type inference allows omitting type witness
//        processStringList(Collections.emptyList()); // This works in Java SE 8
    }

    static void processStringList(List<String> stringList) {
        // Process stringList
        System.out.println("Processing stringList: " + stringList);
    }
}
