package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.ListIterator;

public class CustomList2 extends ArrayList<String> {
	public int indexOf(String e) {
	  for (ListIterator<String> it = listIterator(); it.hasNext(); ) {
	      if (e == null ? it.next() == null : e.equals(it.next())) {
	          return it.previousIndex();
	      }
	  }
	  // Element not found
	  return -1;
	}
	
	public static void main(String[] args) {
		// Type Parameter가 지정되지 않은 NonGeneric 클래스인데...
		
	    CustomList2 list = new CustomList2();
	    list.add("apple");
	    list.add("banana");
	    list.add("cherry");
	    list.add("date");
	
    System.out.println("Index of 'banana': " + list.indexOf("banana")); // 출력: Index of 'banana': 1
    System.out.println("Index of 'cherry': " + list.indexOf("cherry")); // 출력: Index of 'cherry': 2
    System.out.println("Index of 'fig': " + list.indexOf("fig"));       // 출력: Index of 'fig': -1
	}
}
