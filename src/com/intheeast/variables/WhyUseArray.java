package com.intheeast.variables;

public class WhyUseArray {
// 배열을 사용하면	
	public static void useArrayForId() {
		int[] studensId = new int[20];	
		for (int i=0; i<studensId.length; i++) { // .멤버 엑세스 연산자를 쓴걸로 보아 객체로 취급한다
			studensId[i] = i + 1;
		}		
		// for은 반목구문
		for (int i=0; i<studensId.length; i++) {
			studensId[i] = studensId[i] + 1000;
		}
	}
	
	public static void main(String ...args) {
// 배열이 없다면	
		int st1Id = 0;
		int st2Id = 0;
		int st3Id = 0;
		int st4Id = 0;
		int st5Id = 0;
		int st6Id = 0;
		int st7Id = 0;
		int st8Id = 0;
		int st9Id = 0;
		int st10Id = 0;
		int st11Id = 0;
		int st12Id = 0;
		int st13Id = 0;
		int st14Id = 0;
		int st15Id = 0;
		int st16Id = 0;
		int st17Id = 0;
		int st18Id = 0;
		int st19Id = 0;
		int st20Id = 0;
		
		st1Id = 1;
		st2Id = 2;
		st3Id = 3;
		st4Id = 4;
		st5Id = 5;
		st6Id = 6;
		st7Id = 7;
		st8Id = 8;
		st9Id = 9;
		st10Id = 10;
		st11Id = 11;
		st12Id = 12;
		st13Id = 13;
		st14Id = 14;
		st15Id = 15;
		st16Id = 16;
		st17Id = 17;
		st18Id = 18;
		st19Id = 19;
		st20Id = 20;
		
		st1Id = st1Id + 1000;
		st2Id = st2Id + 1000;
		st3Id = st3Id + 1000;
		st4Id = st4Id + 1000;
		st5Id = st5Id + 1000;
		st6Id = st6Id + 1000;
		st7Id = st7Id + 1000;
		st8Id = st8Id + 1000;
		st9Id = st9Id + 1000;
		st10Id = st10Id + 1000;
		st11Id = st11Id + 1000;
		st12Id = st12Id + 1000;
		st13Id = st13Id + 1000;
		st14Id = st14Id + 1000;
		st15Id = st15Id + 1000;
		st16Id = st16Id + 1000;
		st17Id = st17Id + 1000;
		st18Id = st18Id + 1000;
		st19Id = st19Id + 1000;
		st20Id = st20Id + 1000;		
	}

}