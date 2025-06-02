package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReplaceSequenceExample {
	
	static {
		List<String> list =
				new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("graph");
		list.add("melon");
		
		for (String str : list) {
//			 list.remove(str);
			// 이렇게 작성하면 예외 발생
			// 그래서 for-each문에서는 remove를 사용하지 못함
			// modCount와 expectedModCount가 달라지는 Exception이 발생함
			// 그래서 이럴겨우 iterator 사용
			
			list.set(0, "xxx");
			// set은 가능
			// modCount와 expectedModCount가 달라지지 않는다
		}
		
		list.remove(0); // list 인터페이스의 remove
		list.remove("melon"); 
		list.set(0, "banana");
		list.set(list.size()-1, "melon");
	}
	
	
    public static <E> void replace(List<E> list, E val, List<? extends E> newVals) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); ) {
            if (val == null ? it.next() == null : val.equals(it.next())) {
                it.remove(); // iterator의 remove
                for (E e : newVals)
                    it.add(e);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "banana", "date"));

        System.out.println("Before replace: " + list);

        // "banana"를 {"kiwi", "lime"} 시퀀스로 교체
        List<String> newVals = Arrays.asList("kiwi", "lime");
        replace(list, "banana", newVals);

        System.out.println("After replace: " + list);

        // null 값을 테스트하기 위해 null 값을 추가
        list.add(null);
        System.out.println("Before replace null: " + list);

        // null을 {"grape", "melon"} 시퀀스로 교체
        List<String> nullNewVals = Arrays.asList("grape", "melon");
        replace(list, null, nullNewVals);

        System.out.println("After replace null: " + list);
    }
}