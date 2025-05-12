package com.intheeast.stringclass;

public class StringDemo {

	public static void main(String[] args) {
		
//		StringFormat stringFormat = new StringFormat();
		
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                palindrome.charAt(i); // 문자 : character
            						  // 문자열의 각 문자는 어디에 저장? 배열
            						  // 배열은 각 엘리먼트의 순서를 지정하는 index
            					      // String의 인스턴스 메서드인 charAt 파라미터(i)는 무엇을 의미?
                                      // 각 문자의 인덱스를 달라고 전달하라고 함        
        } 
        // 위의 for 메서드와 동일한 메서드
        palindrome.getChars(0, // 이 문자열의 0번째 인덱스인 문자부터 
        		len, // 17개(문자열의 범위)
        		tempCharArray, // tempCharArray 배열에 복사한다.
        		0); // tempCharArray 배열의 0번째 인덱스인 char 변수부터...
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j]; 
            				// 인덱스의 내림차순
            				// length - 1은 마지막 엘리먼트 인덱스 값
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
    }
}
