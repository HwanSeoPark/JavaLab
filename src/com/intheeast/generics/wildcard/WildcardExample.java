package com.intheeast.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

	// 리턴 타입 List<?>인데 이 리스트의 엘리먼트는 제한이 없다
	public static List<?> getUnboundedList() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        return list;
    }

    public static void main(String[] args) {
        List<?> list = getUnboundedList();
        for (Object o : list) {
            System.out.println(o); // 출력: Hello
        }
    }
}
