package com.intheeast.Operators;

public class ArithmeticExample {

	 public static void main(String[] args) {

	        int a = 5, b = 10, c = 0;
	        boolean x = true, y = false;
	        
	        // multiplicative
	        int mul = a * b;
	        int div = b / a; // 나누기 연산자 : 나눌시 나오는 값(몫)
	        int mod = b % a; // 나머지 연산자 : 나누기시 나오는 나머지
	        				 //	ex ) 5 / 2 = 2(몫) 나머지 1			
	        System.out.println("multiplicative: * = " + mul + ", / = " + div + ", % = " + mod);
	        												// , : 아규먼트 세퍼레이터
	        // additive
	        int add = a + b;
	        int sub = b - a;
	        System.out.println("additive: + = " + add + ", - = " + sub);
	 }

}