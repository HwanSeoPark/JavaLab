package com.intheeast.inheritance.overrides;

public class Main {

	public static void main(String[] args) {
	 
		Animal myAnimal = new Animal();
    	Animal myDog = new Dog();
    	Animal myCat = new Cat();

    	
    	
        // 슈퍼클래스의 메서드 호출
        myAnimal.speak(); // 출력: Animal makes a sound

        // 하위 클래스에서 재정의된 메서드 호출
        myDog.speak(); // 출력: Dog barks
        myCat.speak(); // 출력: Cat meows


	
	
	
	}

}
