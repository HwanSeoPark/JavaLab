package com.intheeast.generics.typeinference;

public class Box<T> {

	private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

//    public static void main(String[] args) {
//        Box<Integer> integerBox = new Box<Integer>();
//        integerBox.set(new Integer(10));
//        integerBox.inspect("some text"); // 에러: 여전히 String입니다!
//  }
}
