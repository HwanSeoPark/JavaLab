package com.intheeast.collections.collectionoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SwapShuffle {
	
	public static <E> void swap(List<E> a, int i, int j) {
	    E tmp = a.get(i);
	    a.set(i, a.get(j));
	    a.set(j, tmp);
	}    

	public static void shuffle(List<?> list, Random rnd) {
	    for (int i = list.size(); i > 1; i--)
	        swap(list, i - 1, rnd.nextInt(i));
	}
	
	public static void useCollectionShuffleAPI(List<?> list, Random rnd) {
		Collections.shuffle(list, new Random());
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        for (String a : args) {
            list.add(a);          
        }
        
        System.out.println("origin : " + list);
        
        shuffle(list, new Random());
        
        System.out.println("suffle : " + list);
        
        useCollectionShuffleAPI(list, new Random());
        
        System.out.println("collection suffle : " + list);
        
	}

}
