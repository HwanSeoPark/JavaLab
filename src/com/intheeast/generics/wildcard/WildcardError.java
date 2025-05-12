package com.intheeast.generics.wildcard;

import java.util.List;

public class WildcardError {

	void foo(List<?> i) {    						 
		// ? get(int)
		// void set(int, ? element)
													 // CAP#1
		// i.get(0) -> 리턴하는 값은 Element : 알수 없는 타입 : capture#1-of
		// i.set(0, E element)
		// i.set(0, capture#2) <- 엘리먼트가 알수 없는 타입이지만 set을 사용해야하니 capture#2-of 로변경
		// get은 값만 가져오는 경우(읽기)라 괜찮음 set은 값을 넣을수(쓰기) 있어어 못하게 막음
//		i.set(0, i.get(0)); 
		    // The method set(int, capture#1-of ?) 
            // in the type List<capture#1-of ?> 
            // is not applicable for the arguments (int, capture#2-of ?)
 
		// fooHelper 메서드는 제너릭 메서드... 
		// 즉, 타입 파라미터의 아규먼트를 유추해야 함!!!
		// i가 List<?>... 
        fooHelper(i);
        // i의 데이터타입을 알수 없어서  
        // i에 컴파일러가 내부적으로 capture#1 임시 데이터 타입을 줌 
        
	}
	
	private <T> void fooHelper(List<T> list) {
        list.set(0, list.get(1)); // 테스트를 위해 0번째 엘리먼트를 
                                  // 1번째 엘리먼트로 set하는 코드로 변경함
    	// 타입 아규먼트로 capture#1 변수를 집어 넣음
    }
}
