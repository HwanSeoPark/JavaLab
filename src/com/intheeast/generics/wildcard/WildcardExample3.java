package com.intheeast.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample3 {

	public static List<? super Integer> getSuperIntegerList() {
        List<Number> numList = new ArrayList<>();
        numList.add(10); // Integer는 Number의 하위 타입
        return numList;
    }

    public static void main(String[] args) {
        List<? super Integer> list = getSuperIntegerList();
        list.add(20); // 추가 가능
        // Object obj = list.get(0); // 읽을 땐 Object로만 안전
        System.out.println(list); // 출력: [10, 20]
    }
}
