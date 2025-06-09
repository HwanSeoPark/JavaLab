package com.intheeast.collections.rangeviewoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        // 원본 리스트 생성
        List<String> list = 
        		new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape"));

        int fromIndex = 2;
        int toIndex = 5;

        // subList를 사용하여 범위의 요소를 제거
        // chaining method call
        list.subList(fromIndex, toIndex).clear();
        System.out.println("After clear: " + list);

        // 리스트를 다시 설정
        list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape"));

        // subList를 사용하여 범위 내 요소의 인덱스를 찾기
        int i = list.subList(fromIndex, toIndex).indexOf("date");
        System.out.println("Index of 'date' in subList: " + i); // subList 내에서의 인덱스

        list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "date", "fig", "grape"));

        toIndex = 6;
        // subList를 사용하여 범위 내 요소의 마지막 인덱스를 찾기
        int j = list.subList(fromIndex, toIndex).lastIndexOf("date");
        System.out.println("Last index of 'date' in subList: " + j); // subList 내에서의 마지막 인덱스
    }
}