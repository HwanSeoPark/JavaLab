package com.intheeast.Operators;

public class BitDemo {
	
	public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        
        // val & bitmask : & -> bitwise and 연산(같은 자리에 있는 bit끼리 연산)
        // bitwise and 연산을 수행할 때,
        // 왼쪽, 오른쪽 피연산자의 동알한 bit위치에 있는 두 비트(0,1)별로 and 연산을 함.
        // bitwise and 연상늘 수행할 때 이진수 1은 true, 이진수 0은 false라고 생각하면 됨
        // bitmask : 0x000F --> 0b0000_0000_0000_1111
        // val     : 0x2222 --> 0b0010_0010_0010_0010
        //                      0b0000_0000_0000_0010  -> 십진수로 2
        
        int ret = val & bitmask;
        
        return ;
        
        // prints "2"
        // System.out.println(val & bitmask);
    }
}
