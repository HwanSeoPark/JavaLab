package com.intheeast.collections.set;

import java.util.HashSet;
import java.util.Set;

public class IntegerHashSetExample {
    public static void main(String[] args) {
       
    	Set<Integer> integerSet = new HashSet<>();

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
