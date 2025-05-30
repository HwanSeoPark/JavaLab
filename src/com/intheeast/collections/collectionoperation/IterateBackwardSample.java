package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IterateBackwardSample {

	public static void main(String[] args) {
	
		// 여기서 리턴하는 ArrayList는 Arrays클래스의 내부 ArrayList 클래스
		// java.util.Arrays$ArrayList
		List<String> list = Arrays.asList("apple", "banana", "cherry");

		// 여기서 리턴하는 ArrayList는 ArrayList클래스
		// java.util.ArrayList
        List<String> list2 = new ArrayList<>(list);
        
        // element를 역순을 가져오기 위해서,
        // ListItr을 생성할 때, cursor 값을 리스트 사이즈(list.size())로 설정함
        // : Iterator에서 cursor는 element의 Index를 가리킴
        //  hasNext/next가 아니라 hasPrevious와 previous를 사용함.(끝에서부터 진행하기 때문에)
        for (ListIterator<String> it 
        		= list.listIterator(list.size()); it.hasPrevious(); ) {
        	String t = it.previous();
            System.out.println(t);
        }
    }
}
