package com.intheeast.tsetexample;

public class TestMain {

	public static void main(String[] args) {
		
		FieldTestExample fieldtestexample = new FieldTestExample();
	
		System.out.println("Quizz의 초기화되지 않은 필드 값:" + 
					fieldtestexample.getAlphabet());
		
		fieldtestexample.Alphabet();

	}
}	
			
