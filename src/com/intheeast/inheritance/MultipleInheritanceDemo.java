package com.intheeast.inheritance;

public class MultipleInheritanceDemo {

	 public static void main(String[] args) {
		 SubClassAnothers sub = new SubClassAnothers();
	     sub.printState();
	    }
}	 
	
	// 두 개의 슈퍼클래스를 정의합니다.
	class SuperClassA {
	    int state = 1;

	    SuperClassA() {
	        state = 2; // 생성자에서 state 값을 2로 설정
	    }

	    void printState() {
	        System.out.println("State from SuperClassA: " + state);
	    }
	}

	class SuperClassB {
	    int state = 3;

	    SuperClassB() {
	        state = 4; // 생성자에서 state 값을 4로 설정
	    }

	    void printState() {
	        System.out.println("State from SuperClassB: " + state);
	    }
	}

	// 다중 상속이 가능하다고 가정하고 두 슈퍼클래스를 상속받는 서브클래스를 정의합니다.
	class SubClassAnothers extends SuperClassA /*, SuperClassB*/ {
	    // 다중 상속이 허용되지 않기 때문에 두 번째 슈퍼클래스를 주석 처리했습니다.

	    // 메서드를 오버라이드하여 상태를 출력합니다.
	    @Override
	    void printState() {
	        // 만약 다중 상속이 가능하다면, 어떤 state를 출력해야 할지 애매해집니다.
	        super.printState(); // SuperClassA의 state 출력
	        // SuperClassB의 state도 출력해야 한다면?
	        // super.printState(); // SuperClassB의 state 출력 (애매해짐)
	    }
	}

	
	   
	
	    

	/* 위 예제에서 SubClass가 SuperClassA와 SuperClassB를 동시에 상속받는 경우를 가정해보면, 
	SubClass의 인스턴스는 두 개의 state 필드를 가지게 됩니다. 
	이로 인해 어떤 state를 참조해야 하는지 혼란이 발생합니다.

	SubClass의 생성자가 호출될 때 SuperClassA와 SuperClassB의 생성자가 호출되는데, 
	어느 생성자가 우선시 되는가?
	SubClass의 printState 메서드가 호출될 때 어느 슈퍼클래스의 state를 출력해야 하는가?
	이러한 문제를 피하기 위해 Java는 다중 상속을 허용하지 않습니다. 
	대신, 인터페이스를 사용하여 다중 상속의 장점을 활용하면서도 상태 충돌 문제를 피할 수 있습니다. 
	인터페이스는 필드를 가질 수 없기 때문에 상태의 다중 상속 문제를 유발하지 않습니다. */

