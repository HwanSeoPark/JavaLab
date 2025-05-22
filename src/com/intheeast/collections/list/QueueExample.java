package com.intheeast.collections.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class QueueExample {

	public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 엘리먼트 추가
        // First In(Push)
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐에서 엘리먼트 제거 및 출력
        // First Out(Pop)
        System.out.println("Removed with remove(): " + queue.remove()); // 1
        System.out.println("Removed with poll(): " + queue.poll());     // 2
        System.out.println("Removed with remove(): " + queue.remove()); // 3

        // 큐가 비어 있는 경우 remove() 메서드 사용 시 예외 발생
        try {
            System.out.println("Attempt to remove with remove(): " + queue.remove());
        } catch (NoSuchElementException e) { // UnChecked Exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 큐가 비어 있는 경우 poll() 메서드 사용 시 null 반환
        System.out.println("Attempt to remove with poll(): " + queue.poll()); // null
    }
}