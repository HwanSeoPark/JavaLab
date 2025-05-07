package com.intheeast.generics;
									   // Pair<Integer, String> 이렇게 작성해도됨
public class OrderedPair<K, V> implements Pair<K, V> {
	
    private K key;
    private V value;
    
    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }

    Pair<String, Integer> p1 = 
    		new OrderedPair<String, Integer>("Even", 8);
    
    Pair<String, String>  p2 = 
    		new OrderedPair<String, String>("hello", "world");

    
    public class OrderedPair2<T, G>{
       	
	  // G타입 파라미터의 타입 아규먼트로 Box<Integer>를 지정!	
//    OrderedPair2<String, Box<Integer>> p = 
//    		new OrderedPair2<>("primes", new Box<Integer>());
//    
    }
    
    
}