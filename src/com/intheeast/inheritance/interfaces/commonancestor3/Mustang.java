package com.intheeast.inheritance.interfaces.commonancestor3;

// Horse 상속하지 않고 Mammal interface만 구현한 경우 에러 발생
// The type Mustang must implement the inherited 
// abstract method Mammal.identifyMyself()
public class Mustang extends Horse implements Mammal {

	public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }

}
