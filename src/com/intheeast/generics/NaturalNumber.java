package com.intheeast.generics;

// 신텍스 에러는 아님!!
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    // ...
    
    public static void main(String[]...args) {
    	// NaturalNumber<T extends Integer> 제너릭 클래스의 인스턴스를 만드는 메서드
    	NaturalNumber<Integer> intG = new NaturalNumber<>(0);
    }
}