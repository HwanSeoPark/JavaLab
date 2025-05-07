package com.intheeast.generics.wildcard;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LowerBoundedMain {
//public final class Integer extends Number
//    implements Comparable<Integer>, Constable, ConstantDesc
	
	public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // Example with List<Integer>
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println("Integer list: " + integerList);

        // Example with List<Number>
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("Number list: " + numberList);

        // Example with List<Object>
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.println("Object list: " + objectList);

        // Example with List<Comparable>
        // Integer은 Comparable 인터페이스를 구현한 구현체
        // <? super Integer> 하한제한
        // List<Comparable>의 참조변수 comparableList의 List 엘리먼트에 Comparable을 아규먼트로 전달 가능하다
        List<Comparable> comparableList = new ArrayList<>();
        addNumbers(comparableList);
        System.out.println("Comparable list: " + comparableList);

        // Example with LinkedList<Object>
        List<Object> linkedObjectList = new LinkedList<>();
        addNumbers(linkedObjectList);
        System.out.println("Linked Object list: " + linkedObjectList);
    }
}
