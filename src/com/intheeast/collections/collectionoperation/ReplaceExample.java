package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReplaceExample {
	// 제너릭 메서드
    public static <E> void replace(List<E> list, E val, E newVal) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); ) {
            if (val == null ? it.next() == null : val.equals(it.next())) {
                // ArrList의 set 메서드가 아니라,
            	// ListItr의 set 메서드임
                it.set(newVal); // set 메서드를 통해서 replace...
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("date");

        System.out.println("Before replace: " + list);

        // "banana"를 "kiwi"로 교체
        replace(list, "banana", "kiwi");

        System.out.println("After replace: " + list);

        // null 값을 테스트하기 위해 null 값을 추가
        list.add(null);
        System.out.println("Before replace null: " + list);

        // null을 "grape"로 교체
        replace(list, null, "grape");

        System.out.println("After replace null: " + list);
    }
}