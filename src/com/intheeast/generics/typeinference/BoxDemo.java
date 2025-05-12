package com.intheeast.generics.typeinference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxDemo {
	
	static {
		// Map<K,V>
		Map<String, List<String>> myMap = 
				// HashMap<K,V>
				new HashMap<>(); // <> 안에 생략해도됨 컴파일러가 추론함
		     // new HashMap(); <- 이건 raw type : <>를 생갹해버림
		     // 이전 자바와의 호환성 때문에 쓰긴한다
	}
	
	
	// BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
	// BoxDemo.addBox(Integer.valueOf(20), List<Box<Integer>>);
	// U는 Integer
	public static <U> void addBox(U u, List<Box<U>> boxes) {
	    Box<U> box = new Box<>();
	    box.set(u);
	    boxes.add(box);
	  }
	
	public static <U> void outputBoxes(List<Box<U>> boxes) {
	    int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	  }

	public static void main(String[] args) {
		// ArrayList 엘리먼트는 Box<Integer>...
		// ArrayList의 타입 파라미터의 아규먼트는,
		// 파라미터화된 타입인 Box<Integer>를 지정함!!
		/*Array*/List<Box<Integer>> listOfIntegerBoxes =
					new ArrayList<>();
//		ArrayList<Box<Integer>> listOfIntegerBoxes =
//				new ArrayList<>();

		// Integer.valueOf 메서드는 Integer 클래스 컨스트럭터를 호출함
		// adddBox 1st 아규먼트는 Integer Class의 인스턴스 참조값
		//		   2nd 아규먼트는 ArrayList<Box<Integer>> 인스턴스에 대한 참조값
		BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.outputBoxes(listOfIntegerBoxes);
	  }
}
