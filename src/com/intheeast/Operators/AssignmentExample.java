package com.intheeast.Operators;

public class AssignmentExample {
	 
	public static void main(String[] args) {

	        int a = 5, b = 10, c = 0;
	        boolean x = true, y = false;

	
	 // assignment
    c = a;       // c에 a의 값을 대입합니다. (c = 5)
  
    // c = c + b;
    c += b;      // c = c + b;   → c = 5 + 10 = 15
  
    // c = c - a; 
    c -= a;      // c = c - a;   → c = 15 - 5 = 10
  
    // c = c * 2; 
    c *= 2;      // c = c * 2;   → c = 10 * 2 = 20
  
    // c = c / 2;
    c /= 2;      // c = c / 2;   → c = 20 / 2 = 10
   
    // c = c % 3;	
    c %= 3;      // c = c % 3;   → c = 10 % 3 = 1
  
    
///////////////////////////////////////////////////////////////////    
    // c = c & 7;
    c &= 7;      // c = c & 7;   → c = 1 & 7 = 1 (비트 AND: 0001 & 0111 = 0001)
   
    // c = c ^ 2;
    c ^= 2;      // c = c ^ 2;   → c = 1 ^ 2 = 3 (비트 XOR: 0001 ^ 0010 = 0011)
  
    // c = c | 1;
    c |= 1;      // c = c | 1;   → c = 3 | 1 = 3 (비트 OR: 0011 | 0001 = 0011)
  
    // c = c << 1;
    c <<= 1;     // c = c << 1;  → c = 3 << 1 = 6 (비트를 왼쪽으로 1칸 이동: 0011 → 0110)
  
    // c = c >> 1;
    c >>= 1;     // c = c >> 1;  → c = 6 >> 1 = 3 (부호 유지하면서 오른쪽으로 1칸 이동: 0110 → 0011)
   
    // c = c >>> 1;
    c >>>= 1;    // c = c >>> 1; → c = 3 >>> 1 = 1 (부호 비트 무시, 0으로 채우며 오른쪽으로 1칸 이동: 0011 → 0001)

    System.out.println("assignment: result = " + c);
	}
}
