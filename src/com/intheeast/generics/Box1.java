package com.intheeast.generics;

public class Box1<T> {

	private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    	// 상한제한
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box1<Integer> integerBox = new Box1<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(Integer.valueOf(1));

        // 타입 파라미터 상한제한으로 컴파일 타임 떄 강력한 타입 검사를 실시한 결과!!!
//      integerBox.inspect("some text"); // 에러: 여전히 String입니다!
        // The method inspect(U) in the type Box1<Integer> 
        // is not applicable for the arguments (String)
    
    }
}
