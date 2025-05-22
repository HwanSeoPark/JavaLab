package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionExample {

	public static void main(String[] args) {
		
		String[] strs = {"1", "2", "3"};
		// Array는 향상된 for 구문이 되는것처럼 보이지만 
		// 실행 안된다
		// 실제로는 JVM이 레거시한 for 구문으로 바꿔서 실행함
		// Array는 Iterable 인터페이스를 구현하지 않았다
		for (String str : strs) {
			System.out.println(str);
		}
		/* ↓ 이런식으로 바뀐다
		  for(int var3 = 0; var3 < var4; ++var3) {
            String str = var5[var3];
            System.out.println(str);
        }
		*/
		
		
		
        // Collection 인터페이스의 인스턴스 생성
		Collection<String> c = new HashSet<>();
		c.add("apple");
		c.add("banana");
		c.add("cherry");

		// Collection을 ArrayList로 변환하는 변환 생성자 사용
		List<String> list = new ArrayList<>(c);
		
		// Iterable 인터페이스를 설명을 위한 향상된 for 구문
		// ArrayList는 Iterable 인터페이스를 구현한 구현체 이기 때문에 가능
		for (String str : list) {
			System.out.println(str);
		}
		/* 실제 실행될때 컴파일러가 이렇게 코드를 바꿔서 실행함
		 * 실제 이렇게 작성해도 된다, 실행시 위의 코드와 똑같은 방식으로 실행됨
		 * 아래 while문과 등가
		 Iterator<String> itr = list.iterator();

         while(itr.hasNext()) {
             String str = (String)itr.next();
             System.out.println(str);
         }
	    */
		
		// Collection 인터페이스의 기본 메서드 사용 예시
		System.out.println("Size: " + c.size()); // 컬렉션의 크기
		System.out.println("Is empty: " + c.isEmpty()); // 컬렉션이 비어 있는지 여부
		System.out.println("Contains 'apple': " + c.contains("apple")); // 특정 객체가 컬렉션에 포함되어 있는지 여부
		
		c.add("date"); // 컬렉션에 요소 추가
		System.out.println("Added 'date': " + c);
		
		c.remove("banana"); // 컬렉션에서 요소 제거
		System.out.println("Removed 'banana': " + c);

		// Iterator 사용하여 컬렉션 반복
		// 향상된 for 구문과 등가
		Iterator<String> iterator = c.iterator();
		while (iterator.hasNext()) {
		    System.out.println("Iterator value: " + iterator.next());
		}
		
		// 전체 컬렉션을 대상으로 하는 메서드 사용 예시
		Collection<String> otherCollection = Arrays.asList("apple", "fig");
		System.out.println("Contains all: " + c.containsAll(otherCollection)); // 모든 요소가 포함되어 있는지 여부
		c.addAll(otherCollection); // 다른 컬렉션의 모든 요소 추가
		System.out.println("After addAll: " + c);
		
		c.removeAll(otherCollection); // 다른 컬렉션의 모든 요소 제거
		System.out.println("After removeAll: " + c);
		
		c.retainAll(otherCollection); // 다른 컬렉션에 있는 요소만 유지
		System.out.println("After retainAll: " + c);
		
		c.clear(); // 모든 요소 제거
		System.out.println("After clear: " + c);
		
		// 배열 작업을 위한 추가 메서드 사용 예시
		c.add("grape");
		c.add("honeydew");
		Object[] array = c.toArray();
		System.out.println("Array: " + Arrays.toString(array));
		
		String[] stringArray = c.toArray(new String[0]);
		System.out.println("String array: " + Arrays.toString(stringArray));
		
		// Stream 메서드 사용 예시 (JDK 8 이상)
		Stream<String> stream = c.stream();
		stream.forEach(System.out::println);

		Stream<String> parallelStream = c.parallelStream();
		parallelStream.forEach(System.out::println);
	}
}
