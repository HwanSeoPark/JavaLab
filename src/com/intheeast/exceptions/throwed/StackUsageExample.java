package com.intheeast.exceptions.throwed;

import java.util.EmptyStackException;

public class StackUsageExample {
    public static void main(String[] args) {
        // MyStack 인스턴스 생성
        MyStack stack = new MyStack();

        // 스택에 데이터 추가 (push)
        System.out.println("=== push 작업 ===");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // 현재 스택 크기 출력
        System.out.println("스택 크기: " + stack.size());

        // 스택에서 데이터 꺼내기 (pop)
        System.out.println("=== pop 작업 ===");
        while (!stack.isEmpty()) {
            Object item = stack.pop();
            System.out.println("Pop된 값: " + item);
        }

        // 다시 스택이 비었는지 확인
        System.out.println("스택이 비었나요? " + stack.isEmpty());

        // 빈 스택에서 pop 시도 (예외 발생)
        System.out.println("=== 예외 테스트 ===");
        // EmptyStackException은 RuntimeException을 상속하였기 때문에
        // Unchecked Exception. 그러므로 컴파일러가 예외 처리 코드 구현을 강제하지 않음
        //try {
            stack.pop();  // 여기서 EmptyStackException 발생
        //} catch (EmptyStackException e) {
            System.err.println("오류 발생: 스택이 비어 있습니다.");
        //}
    }
}