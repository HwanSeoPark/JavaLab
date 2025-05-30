package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.List;

public class ListEqualityExample {
	public static void main(String[] args) {
        // 첫 번째 리스트 생성
        List<String> list1 = new ArrayList<>();
        list1.add("John");
        list1.add("Alice");
        list1.add("Bob");

        // 두 번째 리스트 생성
        List<String> list2 = new ArrayList<>();
        list2.add("John");
        list2.add("Alice");
        list2.add("Bob");

        // 세 번째 리스트 생성 (순서가 다름)
        List<String> list3 = new ArrayList<>();
        list3.add("Alice");
        list3.add("John");
        list3.add("Bob");

        // 네 번째 리스트 생성 (내용이 다름)
        List<String> list4 = new ArrayList<>();
        list4.add("John");
        list4.add("Alice");
        list4.add("Eve");

        // 두 리스트가 동일한지 비교
        System.out.println("list1 equals list2: " + list1.equals(list2)); // true
        System.out.println("list1 equals list3: " + list1.equals(list3)); // false
        System.out.println("list1 equals list4: " + list1.equals(list4)); // false

        // 두 리스트의 hashCode 비교
        System.out.println("list1 hashCode equals list2 hashCode: " + (list1.hashCode() == list2.hashCode())); // true
    }
}
