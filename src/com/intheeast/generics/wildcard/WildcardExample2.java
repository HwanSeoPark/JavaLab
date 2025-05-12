package com.intheeast.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample2 {

	public static List<? extends Number> getNumberList() {
        List<Integer> intList = new ArrayList<>();
        intList.add(42);
        return intList;
    }

    public static void main(String[] args) {
        List<? extends Number> list = getNumberList();
        Number n = list.get(0); // 안전하게 읽기 가능
        System.out.println(n);  // 출력: 42
    }
}
