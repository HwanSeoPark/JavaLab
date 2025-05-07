package com.intheeast.classes;

public class DataArtist {

	
	// draw 메서드에 대한 Overloading 이라고 함
	// 자바는 서로 다른 메서드 시그니처를 가진 메서드를 구별
	public void draw(String s) {
	 
    }
	// 이 경우를 보면 리턴값이 달라도 같은 메서드 취급
	// 결국 리턴값은 상관없고 메서드시그니처( 메서드 +(파라미터리스트))가 같으면 같은 메서드 취급
	// Duplicate method draw(String) in type DataArtist
//	public int draw(String s) {
//    }

    public void draw(int i) {
         
    }
    public void draw(double f) {
        
    }
    public void draw(int i, double f) {
  
    }
	
}
