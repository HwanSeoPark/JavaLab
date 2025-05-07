package com.intheeast.inheritance.Polymorphism.equivalency;

public class PersonMain {

	public static void main(String[] args) {
		
		 // Person 객체 생성
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Jane", 30);

        // hashCode 메서드 사용 예제
        System.out.println("HashCode of person1: " + person1.hashCode());
        System.out.println("HashCode of person2: " + person2.hashCode());
        System.out.println("HashCode of person3: " + person3.hashCode());

        // equals 메서드 사용 예제
        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false

        // Person 객체를 HashSet에 저장하여 중복 제거 예제
        java.util.HashSet<Person> personSet = new java.util.HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Number of unique persons: " + personSet.size()); // 2 (person1과 person2는 동일한 객체로 간주)
    }
	

}
