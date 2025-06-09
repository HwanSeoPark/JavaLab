package com.intheeast.collections.rangeviewoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListExample2 {
    public static void main(String[] args) {
        // 원본 리스트 생성
        List<String> list = 
        		new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape"));

        // subList를 일시적으로 사용하여 범위 연산 수행
        List<String> subList = list.subList(2, 5);
        System.out.println("Original subList: " + subList);

        // subList를 통해 범위 내 요소 수정
        subList.set(0, "kiwi");
        System.out.println("Modified subList: " + subList);
        System.out.println("Original list after subList modification: " + list);

        // 지원하는 리스트를 직접 수정하여 subList의 의미가 정의되지 않도록 함
        list.add(0, "melon");
        System.out.println("Original list after direct modification: " + list);
        try {
            System.out.println("SubList after original list modification: " + subList);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // subList의 subList를 수정하고 원래 subList를 계속 사용
        // : 다음과 같이 subList를 계속 사용할 경우, Modification Count가 등시성이 훼손됨으로써
        //   사용하지 않아야 함!!!
        List<String> nestedSubList = subList.subList(1, 2);
        nestedSubList.set(0, "orange");
        System.out.println("Nested subList: " + nestedSubList);
        System.out.println("Original subList after nested subList modification: " + subList);
    }
}
