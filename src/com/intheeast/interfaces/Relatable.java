package com.intheeast.interfaces;


// Relatable는 슈퍼클래스(부모 클래스)로 Object 클래스를 확장(상속)함
public interface Relatable /*extends Object*/{

	public int isLargerThan(Relatable other);
	
	double getArea();
	    
	 	// Generic ...
	    // Class Object is the root of the class hierarchy.
	 	// Every class has Object as a super class(부모클래스)
	    // 자바에서는 다중 상속을 지원하지 않기 때문에,
	 	// 두 클래스가 상속 관계에 있다라고 함은, 한 클래스는 부모 클래스이고 다른 클래스는 자식 클래스
	    // findLargest 메서드 호출자가 이 메서드 아규먼트로 Relatable 참조변수의 값을 전달
	 	// object1에는 Relatable 참조 변수의 값이 대입되었다...
	 	// Object object1 의미는? Object 클래스 객체의 인스턴스에 대한 참조 값을 저장하는 참조변수...
	 	
	 	// 현재 이 메서드 호출자는 Relatable 참조 변수에 저장된 참조 값을 해당 메서드의
	 	// 아규먼트로 전달하고 있음
	 	// : 이것이 가능한 이유는 findLargest의 파라미터 데이터 타입이 
	 	//   Object 클래스 인스턴스에 대한 참조값을 저장하는 파라미터로 정의했기 때문
	 	//   Object 클래스는 클래스 계층구조의 최상위 클래스이기 때문
	 	//   :어떤 자바 클래스라도 결국은 Object 클래스를 상속하기 때문에...
	 	//   "is a" 관계...!!!
	 	// Relatable 참조 변수에 저장된 참조값은,
	 	// RetanglePlus 인스턴수에 대한 참조값...
	 	// RectanglePlus is a Object
	 	// RectanglePlus는 Object를 상속했기 때문에...
		// TrianglePuls is a Object...
		// TrianglePlus Object를 상속했기 때문에...
	 	public static Object findLargest(Object object1, Object object2) {
	    	Relatable obj1 = (Relatable)object1; // 형 변환(type casting)
	 	    Relatable obj2 = (Relatable)object2; // 형 변환(type casting)
	 	    if (obj1.isLargerThan(obj2) > 0)
	 	    	return object1;
	 	    else 
	 	        return object2;
	 	}
	    // Object는 최상의 클래스이기 때문에 어떤 참조도 받을수 있다.
	    public static Object findSmallest(Object object1, Object object2) {
	    	Relatable obj1 = (Relatable)object1;
	        Relatable obj2 = (Relatable)object2;
	        	if (obj1.isLargerThan(obj2) < 0)
	        		return object1;
	    	    else 
	    	        return object2;
	    }
	    
	    
	    public static boolean isEqual(Object object1, Object object2) {
	    		Relatable obj1 = (Relatable)object1;
	    		Relatable obj2 = (Relatable)object2;
	    		if ((obj1).isLargerThan(obj2) < 0)
	        		return (boolean) object1;
	    	    else 
	    	        return (boolean) object2;
	    }
}
