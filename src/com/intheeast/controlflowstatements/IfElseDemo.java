package com.intheeast.controlflowstatements;

public class IfElseDemo {
	
	public static boolean returnBooleanValue( ) {
		
		return true;
	}
	
	public static void main(String[] args) {

        int testscore = 76;
        char grade; // grade -> 유니코드
        
        
        // 조건문이 false 이기 때문에 if의 블록의 statement는 실행되지 않고,
        // else 블록안의 statement가 실행됨
        if (testscore >= 90) {
            grade = 'A';       
        }   
        else {
            grade = 'F';
        }
        // if로 로직을 구성할수있으면 else 안써도 된다
	
        System.out.println("Grade = " + grade);
        
        // else if의 조건문이 true일때 스테이트먼트가 실행
        // 여기의 조건문들이 전부다 false라면 마지막 else 블록안의 스테티트먼트가 실행됨
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) { // 이 조건문이 true라 이 스테이트먼트 실행
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
	               
        System.out.println("Grade = " + grade);
    }
}
