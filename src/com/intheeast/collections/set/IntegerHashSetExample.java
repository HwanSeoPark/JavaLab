package com.intheeast.collections.set;

import java.util.HashSet;
import java.util.Set;

public class IntegerHashSetExample {
    public static void main(String[] args) {
       
    	Set<Integer> integerSet = new HashSet<>();

    	// Hash Table의 사이즈가 늘린다?
    	// Hash Table가 16(16개의 버킷을 저장)
    	// Thredshold(임계치) 12...
    	for (int i=0; i<20; i++) {
    		if (i > 11) {
    			int a = 0;
    		}
    		integerSet.add(i);
    	}	
//    	integerSet.add(10);
//      integerSet.add(20);
//      integerSet.add(30);

        System.out.println("HashSet의 크기: " + integerSet.size());

        // 모든 요소 출력
        // HashSet이 다음과 같이 향상된 for 구문을 사용할 수 있는 이유는?
        // : Iterable 인터페이스를 상속한 Collection 인터페이스
        // Iterable의 가상 메서드는? iterator 가상 메서드는 Iterator 인터페이스 구현체를 리턴
        // Iterator 인터페이스 구현체는???
        // hasNext와 next 메서드를 구현
        for (int item : integerSet) {
            System.out.println(item);
        }
        // Set 인터페이스에는 Index가 없다
        // 요소 제거
        integerSet.remove(10);
        System.out.println("HashSet의 크기: " + integerSet.size());

        // 요소 존재 여부 확인
        System.out.println("30이 HashSet에 포함되어 있는가? " + integerSet.contains(30));
    }
}
