package com.intheeast.classes.anonymous;

public class HelloWorldAnonymousClasses {
	
	
	public HelloWorld sayGoodBye() {
		HelloWorld goodBye = new HelloWorld() {
		      
	    	String name = "john";
	        public void greet() {
	            greetSomeone("goodbye");
	        }
	        public void greetSomeone(String someone) {
	            System.out.println("goodbye " + someone);
	        }
	    };
	    
	    return goodBye;
	    
	}
	
	
	
	
	public void sayHello() {
	   
		// new HelloWorld() : 익명 클래스 객체를 만드는 문법
		// 인터페이스 이름을 클래스 컨스트럭터 호출식처럼 사용하고 있음.
		// sayHello 메서드안에서 HelloWorld 인터페이스를 구현하였음
		// : 굳이 익명클래스 사용 이유?
		// -> 특정 메서드를 위한 구현체를 만들수 있음
	    HelloWorld frenchGreeting = new HelloWorld() {
	      
	    	String name = "tout le monde";
	        public void greet() {
	            greetSomeone("tout le monde");
	        }
	        public void greetSomeone(String someone) {
	            name = someone;
	            System.out.println("Salut " + name);
	        }
	    };
	    
	    HelloWorld spanishGreeting = new HelloWorld() {
		       
    		String name = "mundo";
	        public void greet() {
	            greetSomeone("mundo");
	        }
	        public void greetSomeone(String someone) {
	            name = someone;
	            System.out.println("Hola, " + name);
	        }
	    };
	
//	    englishGreeting.greet();
	    frenchGreeting.greetSomeone("Fred");
	    spanishGreeting.greet();
		}
	
		public static void main(String... args) {
			HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
			myApp.sayHello();
		
			HelloWorld one = myApp.sayGoodBye();
			HelloWorld two = myApp.sayGoodBye();
			HelloWorld third = myApp.sayGoodBye();
	    }            
}
