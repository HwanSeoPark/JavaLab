package com.intheeast.inheritance.interfaces;

public class Pegasus extends Horse implements Flyer, Mythical {

	/* Horse class
	public String identifyMyself() {
        return "I am a horse.";
    }
    */
	 
	/* Flyer interface
	default public String identifyMyself() {
        return "I am able to fly.";
    }
	*/
	
	/* Mythical interface
	 default public String identifyMyself() {
        return "I am a mythical creature.";
    }
	*/
	
	// 클래스와 인터페의스의 메서드 이름이 같을때는
	// 인스턴스 메소드는 인터페이스 디폴트 메소드보다 우선시 됩니다.
	// 이름이 같으면 결국 인터페이스에 있는 메서드는 영원히 못쓴다.
	public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        String str = myApp.identifyMyself();
        System.out.println(str);
    }
}
