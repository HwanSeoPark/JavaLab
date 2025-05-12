package com.intheeast.generics.typeinference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inference {
	
	static <T> T pick(T a1, T a2) { 
		return a2;
	}
	
	public static void main(String[] args) {
	
	// pick를 호출하는 시점에
	// 컴파일러가 타입 파라미터의 아규먼트 추론울 시작합니다.
	// : 타입 아규먼트 지정[Inference.<Serializable>()]을 생략했기 때문에... 
	Serializable s = /*Inference.<Serializable>*/pick("d", new ArrayList<String>());
	

	List<String> list = new ArrayList<>();
	list.add("korea");
	list.add("usa");
	list.add("england");
	list.add("japan");
	String[] strs = new String[list.size()];
	// strs 상태는? null 
//	<T> T[] toArray(T[] a); <- 메서드를 보고 T가 String이라고 추론함
	list.toArray(strs); // null 값인 배열에게 String 인스턴스에 대한 참조값을 세팅해줌
	// 타입 아규먼트가 생략되어있음
	// 컴파일러가 타입 아규먼트를 추론함
	// list.<String>toArray(strs);
	// 문맥을 보고 String이라고 추론함
	
	return;
	
	}
}

//public final class String
//implements java.io.Serializable
//
//public class ArrayList<E> extends AbstractList<E>
//implements List<E>, RandomAccess, Cloneable, java.io.Serializable

