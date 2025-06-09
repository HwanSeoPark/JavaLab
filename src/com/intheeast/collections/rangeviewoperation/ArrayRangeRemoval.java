package com.intheeast.collections.rangeviewoperation;

import java.util.Arrays;

public class ArrayRangeRemoval {
    public static void main(String[] args) {
        // 원래 배열
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 제거할 범위의 시작 인덱스와 끝 인덱스 (반개방 범위)
        int fromIndex = 2;
        int toIndex = 5;

        // 새로운 배열의 크기
        int newSize = array.length - (toIndex - fromIndex);

        // 새로운 배열 생성
        int[] newArray = new int[newSize];

        // 원래 배열의 요소를 새로운 배열로 복사
        int index = 0;
        // Offset 개념!!!
        for (int i = 0; i < array.length; i++) {
            if (i < fromIndex || i >= toIndex) {
                newArray[index++] = array[i];
            }
        }

        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(array));
        System.out.println("범위 제거 후 배열: " + Arrays.toString(newArray));
    }
}
