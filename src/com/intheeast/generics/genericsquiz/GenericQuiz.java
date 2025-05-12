package com.intheeast.generics.genericsquiz;

public class GenericQuiz<T> implements Comparable<Integer>{

	@Override
	public int compareTo(Integer anotherInteger) {
		
		return compare();
	}

	private int compare() {
		
		return 0;
	}

	public static void main(String... args) {
		GenericQuiz<Integer> quizI = new GenericQuiz<>();
	}
	
}
