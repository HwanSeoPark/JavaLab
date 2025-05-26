package com.intheeast.collections.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;




class Person {

	private String name;
	
	public Person(String name) {
	    this.name = name;
	}
	
	public String getName() {
	    return name;
	}

}

public class TreeSetExample {	
	public static void main(String[] args) {
	    // 사람들의 Collection 생성
	    List<Person> people = Arrays.asList(
	        new Person("John"),
	        new Person("Alice"),
	        new Person("Bob"),
	        new Person("Alice"),
	        new Person("Eve"),
	        new Person("Charlie")
	    );
	
	    /*
	     public interface Stream<T> extends BaseStream<T, Stream<T>>
	    
	     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
	     						// T는 Person, R은 String
	     public interface Function<T, R> 
	     
	     R apply(T t); {
	     	Person.getName(); <- 이런식으로 바뀜
	     }
	     */                         
	    // aggregate operations를 사용하여 TreeSet으로 수집
	    Set<String> set = people.stream() // 리턴 값 : Stream<Person>
	                            .map(Person::getName)
	                            .collect(Collectors.toCollection(TreeSet::new));
	
	    // TreeSet의 내용 출력 (중복 요소는 제거되며, 정렬됨)
	    set.forEach(System.out::println);
		
	}
}
