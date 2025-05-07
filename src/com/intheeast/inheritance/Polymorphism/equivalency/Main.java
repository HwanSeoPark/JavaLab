package com.intheeast.inheritance.Polymorphism.equivalency;

public class Main {

	/* String 클래스에 있는 메서드
	public boolean equal(Object anObject) {
		// 동일성
		// 동일성은 동등성(객체가 저장하고 있는 상태[필드값]의 동일여부)을 보장한다.
		if(this == anObject) {
		return true;
		}
		
		// 사실 aString(String) 로컬 변수가 있음
		// String aString = (String)anObject;
		// 동일하지 않지만, 동등한지를 체크함
		// module, seal, anObject에 있는 값을 String 형으로 변환한 값을 aString 변수에 저장
		return(anObject instanceof String aString)
				&&(!COMPACT_STRINGS||this.coder == aString.coder)
				&& StringLatin1.equals(value,aString.value);
		
	}
	*/	
	
	// 동등성
	public static void checkEquivalency() {
		Book firstBook  = new Book(new String("0201914670")); // <- FM식으로 작성하면
		Book secondBook = new Book("0201914670");
		// Book 클래스의 equals(Object 클래스의 equals을 오버라이드한 메서드)을
		// 호출함
		if (firstBook.equals(secondBook)) {
		    System.out.println("objects are equal");
		} else {
		    System.out.println("objects are not equal");
		}
	}
	
//	 동일성 
	public static void checkEqual() {
		Book book = new Book();
		Book isSame = book;
	
		// Object 클래스의 equals 메서드의 호출하는 상황.
		// 즉, 아직 Book 클래스에 equals을 오버라이드하지 않았음.
		boolean ret = book.equals(isSame);
		
		return;
	}
	
	
	public static void main(String... args) {
		
//		checkEqual();
		
		checkEquivalency();
	}
}
