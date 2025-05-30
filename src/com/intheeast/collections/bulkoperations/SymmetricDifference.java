package com.intheeast.collections.bulkoperations;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("apple");
        s1.add("banana");
        s1.add("cherry");

        Set<String> s2 = new HashSet<>();
        s2.add("banana");
        s2.add("date");
        s2.add("fig");

        // 대칭 차집합을 계산
        Set<String> symmetricDiff = new HashSet<>(s1);
        symmetricDiff.addAll(s2); // 합집합
        System.out.println("현재는 합집합:" + symmetricDiff);
        
        Set<String> tmp = new HashSet<>(s1);
        tmp.retainAll(s2); // 교집합
        symmetricDiff.removeAll(tmp);

        // 결과 출력
        System.out.println("교집합:" + tmp);
        System.out.println("마지막 대칭 차집합: " + symmetricDiff);
    }
}
