package com.intheeast.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class SubRelation {

	public static void main(String[] args) {
        // Create a list of Integer
        // List<Integer>는 integerList 참조 변수의 데이터 타입
		// 참조 변수의 데이터 타입 : 타입 아규먼트가 Integer인 제너릭 인터페이스 구현체
		//                    엘리먼트 데이터 타입이 Integer인 리스트.
		List<Integer> integerList =
        		new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // E set(int index, E element);
        integerList.set(0, Integer.valueOf(6));
        
        // Assign integerList to List<? extends Integer>
        // Integer를 상속한 하위 클래스들 중에 하나가 타입 아규먼트가 될 수 있는
        // 엘리먼트를 가지는 리스트 
        // List<? extends Integer> : 파라미터화된 타입
        // ? extends Integer : 타입 아규먼트
        List<? extends Integer> intList = 
        /*형변환 (List<? extends Integer>)*/integerList; // 자동으로 형변환 됨

        // Assign intList to List<? extends Number>
        List<? extends Number> numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>

        // Read elements from numList
        for (Number num : numList) {
            System.out.println("Number: " + num);
        }


        // Demonstrating that we cannot add elements to intList or numList
        // intList는 Integer을 상속한 하위 타입으로 상한 제한이 있으므로,
        // Integer
        // 또는 Integer를 상속한 하위 클래스
        //(사실, Integer가 final 클래스이기 때문에 하위 클래스가 없긴 하지만) 들이
        // 특정 클래스(아래 예에서는 AutoBoxint으로 인한 Integer)의 엘리먼트를
        // 이 리스트에 추가하는 것이 신텍스 에러임
//      intList.add(6);  // Compile error: cannot add element to List<? extends Integer>
//      numList.add(6);  // Compile error: cannot add element to List<? extends Number>

        // However, we can still read elements as Number
        Number firstNumber = numList.get(0);
        System.out.println("First number: " + firstNumber);

        // Creating a list of Double to demonstrate more flexibility with Number
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        // Assign doubleList to List<? extends Number>
        List<? extends Number> anotherNumList = doubleList;

        // Read elements from anotherNumList
        for (Number num : anotherNumList) {
            System.out.println("Number from anotherNumList: " + num);
        }
    }
	
}
