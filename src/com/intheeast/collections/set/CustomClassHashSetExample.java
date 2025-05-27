package com.intheeast.collections.set;

import java.util.HashSet;

public class CustomClassHashSetExample {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 25);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("HashSet의 크기: " + personSet.size());

        // 모든 요소 출력
        for (Person person : personSet) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        // 요소 제거
        personSet.remove(person2);
        System.out.println("HashSet의 크기: " + personSet.size());

        // 요소 존재 여부 확인
        Person person4 = new Person("Alice", 25);
        System.out.println("person4가 HashSet에 포함되어 있는가? " + personSet.contains(person4));
    }
}