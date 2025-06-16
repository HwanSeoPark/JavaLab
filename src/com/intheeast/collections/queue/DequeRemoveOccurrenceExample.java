package com.intheeast.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRemoveOccurrenceExample {

    public static void main(String[] args) {
        // Deque 인스턴스 생성
        Deque<String> deque = new ArrayDeque<>();

        // 요소 추가
        deque.add("A");
        deque.add("B");
        deque.add("A");
        deque.add("C");
        deque.add("A");
        deque.add("D");
        deque.add("E");
        deque.add("F");
        deque.add("G");
        deque.add("H");
        deque.add("I");
        deque.add("J");
        deque.add("K");
        deque.add("L");
        deque.add("M");
        deque.add("N");
        deque.add("O"); // 17개
        
        deque.add("P");
        deque.add("Q"); // 19
        deque.add("S");
        deque.add("T");
        deque.add("U");
        deque.add("V");
        deque.add("W");
        deque.add("X");
        deque.add("Y");
        deque.add("Z");
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        deque.add("5");
        deque.add("6");
        deque.add("7");
        deque.add("8");
        deque.add("9");
        deque.add("10");
        deque.add("11");
        
        
        
        // 초기 Deque 상태 출력
        System.out.println("Initial Deque: " + deque);

        // removeFirstOccurrence 메서드로 첫 번째 "A" 제거
        boolean removedFirst = deque.removeFirstOccurrence("A");
        System.out.println("After removeFirstOccurrence(\"A\"): " + deque + " (removed: " + removedFirst + ")");

        // removeLastOccurrence 메서드로 마지막 "A" 제거
        boolean removedLast = deque.removeLastOccurrence("A");
        System.out.println("After removeLastOccurrence(\"A\"): " + deque + " (removed: " + removedLast + ")");

        // 존재하지 않는 엘리먼트 제거 시도
        boolean removedNonExistent = deque.removeFirstOccurrence("Z");
        System.out.println("After removeFirstOccurrence(\"Z\"): " + deque + " (removed: " + removedNonExistent + ")");

        // 최종 Deque 상태 출력
        System.out.println("Final Deque: " + deque);
    }
}