package com.intheeast.collections.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AggregateOperationsExample {

	 public static void main(String[] args) {
	        // Collection c 생성
	        List<String> c = Arrays.asList("apple", "banana", "apple", "orange");

	        // aggregate operations를 사용하여 Set으로 수집
	        Set<String> set = c.stream().collect(Collectors.toSet());
	        
	        // Set의 내용 출력 (중복 요소는 제거됨)
	        set.forEach(System.out::println);
	    }
}
