package com.intheeast.collections.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeSetExample {	
	
	public static void findDups(String[] args) {
		// fm대로 작성한 메서드		
//		List<String> list = Arrays.asList(args);
//		Stream<String> stream = list.stream();
//		Set<String> distinctWords = stream.collect(Collectors.toSet());
		// 체이닝 메서드로 작성하면(위 메서드랑 등가)		
		Set<String> distinctWords = 
				// 체이닝(chaining) 메서드 호출
				Arrays.asList(args) // -> asList가 List<String>를 리턴함
					  .stream() // Collection의 stream 메서드, 가능한 이유는 List가 Collection을 상속해서
					            // 이 stream은 Stream<String>를 리턴함
				      .collect(Collectors.toSet()); 
		// 이렇게 특정 타입을들 아는 이뉴는
		// 리플렉션 API기능을 통해 컴파일러가 유추함

		System.out.println(distinctWords.size()+ 
		        					" distinct words: " + 
	        						distinctWords);
	}
	
	public static <E> Set<E> removeDups(Collection<E> c) {
	    return new LinkedHashSet<E>(c);

	}
	
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
	    
	    Set<Person> persons = new LinkedHashSet<>(people);
	    // List의 정보만 받고 싶을때
	    // element는 Person으로 유지
	
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
	    // 자바에서 정의한 Stream이란 개념이 있음.
	    // : 그러나 큰 의미 없음. 단지 1바이트 단위로 특정 데이터를 조작할 수 있다는 의미임
	    // 선언형 프로그래밍
	    Set<String> set = people.stream() // 리턴 값 : Stream<Person>
	                            ./*<String>*/map(Person::getName) // 리넡 값: Stream<String>
	                            .collect(Collectors.toCollection(TreeSet::new)); // TreeSet::new -> new TreeSeto() 메서드랑 등가
	    						// collect는 Collectors를 통해서 
	    						// Stream타입을 Collection으로 만들어주는 메서드
	    // 이 stream 메서드는 특정 데이터(name)를 빼와 전달함
	    
	    
	    // TreeSet의 내용 출력 (중복 요소는 제거되며, 정렬됨)
	    // TreeSet은 알파벳 순서대로 정렬해서 출력함 -> Tree 알고리즘 개념
	    set.forEach(System.out::println);
		
	}
}
