package com.intheeast.collections.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 엘리먼트 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐의 head 엘리먼트를 반환 (제거하지 않음)
        System.out.println("Head element with element(): " + queue.element()); // 1
        System.out.println("Head element with peek(): " + queue.peek());       // 1

        // 큐의 상태 출력
        System.out.println("Queue after element() and peek(): " + queue); // [1, 2, 3]

        // 큐에서 엘리먼트 제거
        queue.remove();
        queue.remove();
        queue.remove();

        // 큐가 비어 있는 경우 element() 메서드 사용 시 예외 발생
        try {
            System.out.println("Attempt to get head with element(): " + queue.element());
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 큐가 비어 있는 경우 peek() 메서드 사용 시 null 반환
        System.out.println("Attempt to get head with peek(): " + queue.peek()); // null
    }
}
