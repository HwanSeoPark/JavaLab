package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperationsExample {

	public static void main(String[] args) {
        // 기본 리스트 생성
        List<String> targetList =
        		new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        /*asList 따라가면  여기서 a는 컴파일러가 아규먼트를 보고 String인지 판단함
          public static <T> List<T> asList(T... a) {
          return new ArrayList<>(a);
    	  }
    	  여기서 a가 ArrayList의 elementData역할을 함
         */
               
        // containsAll 예제
        List<String> listToCheck = Arrays.asList("apple", "banana");
        boolean containsAllResult = targetList.containsAll(listToCheck);
        System.out.println("containsAll result: " + containsAllResult); // true

        // addAll 예제
        List<String> listToAdd = Arrays.asList("grape", "honeydew", "bae");
        targetList.addAll(listToAdd);
        System.out.println("After addAll: " + targetList); // [apple, banana, cherry, date, fig, grape, honeydew]

        targetList.remove(0);
        //String bae = "bae";
        String bae = new String("bae"); // 동일성은 다르지만 동등성은 같다
        if (bae.equals(targetList.get(6))) // 6한이유 -> 위에 한번 remove해서 
        	System.out.println("값이 동등함");
        targetList.remove(bae);
        
        // removeAll 예제
        List<String> listToRemove = Arrays.asList("apple", "fig");
        targetList.removeAll(listToRemove);
        System.out.println("After removeAll: " + targetList); // [banana, cherry, date, grape, honeydew]

        // retainAll 예제
        List<String> listToRetain = Arrays.asList("banana", "date");
        targetList.retainAll(listToRetain);
        System.out.println("After retainAll: " + targetList); // [banana, date]

        // clear 예제
        targetList.clear();
        System.out.println("After clear: " + targetList); // []
    }
}
