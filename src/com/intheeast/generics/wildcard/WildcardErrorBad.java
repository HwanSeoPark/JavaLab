package com.intheeast.generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class WildcardErrorBad {

	static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
	    
		Number temp = l1.get(0); // l1.get(0)이 리턴하는 것이
								 // capture#1-of ? extends Number
		
	    // The method(l1) set(int, capture#2-of ? extends Number) 
	    // in the type List<capture#2-of ? extends Number> 
	    // is not applicable 
	    // for the arguments (int, capture#3-of ? extends Number)	    
	    // l2.get(0)이 리턴하는 것이 capture#3-of ? extends Number 임으로
		// ↓ 안됨
//		l1.set(0, l2.get(0)); 
	                          
	    // The method(l2) set(int, capture#4-of ? extends Number)
		// in the type List<capture#4-of ? extends Number> 
		// is not applicable for the arguments (int, Number)                     
//	    l2.set(0, temp);      
	                          
	    }

	// List<Integer>는 List<? extends Number>들 계층 구조
	public static void main(String... args) {		
		double d = 3.14d;
		int i = (int)d;
		
		
		
//		li.equals.(douV);
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double>  ld = Arrays.asList(10.10, 20.20, 30.30);
		swapFirst(li, ld);
		
	}


}
