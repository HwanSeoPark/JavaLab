package com.intheeast.exceptions.throwed;

import java.util.EmptyStackException;

public class MyStack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // 스택에 요소 추가 (push)
    public void push(Object obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    // 스택에서 요소 제거 후 반환 (pop)
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Object obj = objectAt(size - 1);
        setObjectAt(size - 1, null);  // 메모리 누수 방지 (GC 대상화)
        size--;
        return obj;
    }

    // 스택의 현재 크기 반환
    public int size() {
        return size;
    }

    // 내부 메서드: index 위치의 객체 반환
    private Object objectAt(int index) {
        return elements[index];
    }

    // 내부 메서드: index 위치에 객체 설정
    private void setObjectAt(int index, Object obj) {
        elements[index] = obj;
    }

    // 배열이 꽉 찼을 때 용량 증가
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return size == 0;
    }
}