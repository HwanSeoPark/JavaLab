package com.intheeast.generics.typeinference.sub;

public class Box<T> {

	private T value;

    // 일반 생성자
    public Box(T value) {
        this.value = value;
    }

    // 제너릭 생성자 - 다른 타입으로부터 유연하게 생성
    public <U> Box(U input, Converter<U, T> converter) {
        // converter의 구현체가 Object::toString이라면,
    	// 실제, Double.toString이 호출됨 : U가 Double이기 때문에!!!
    	// 이 toString 메서드는 Double의 field인 value[데이터타입은 double]값에
    	// 해당하는 문자열을 리턴함...
    	// 리턴값은 T의 타입 아규먼트(String)임
    	// 문제는 U의 타입 아규먼트(Double)임...
        this.value = converter.convert(input);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
