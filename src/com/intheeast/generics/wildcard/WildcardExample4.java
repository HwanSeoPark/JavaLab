package com.intheeast.generics.wildcard;

import java.util.List;

public class WildcardExample4 {

	// 절대 Unbounded Wildcard 배열을 쓰지 마세요!!!
	public static List<?>[] getWildcardArray() {
        List<?>[] arr = new List<?>[2];
        arr[0] = List.of("One", "Two");
        arr[1] = List.of(1, 2, 3);
        return arr;
    }

    public static void main(String[] args) {
        for (List<?> l : getWildcardArray()/*리턴 값이 List<?>[]*/) {
            System.out.println(l);
        }
    }
}
