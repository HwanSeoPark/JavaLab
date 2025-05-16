package com.intheeast.exceptions.throwed;

public class InitCauseExample {

	 public static void main(String[] args) {
	        try {
	            // 첫 번째 예외 발생
	            throw new NumberFormatException("잘못된 숫자 형식입니다.");
	        } catch (NumberFormatException e) {
	            // 첫 번째 예외를 원인으로 두 번째 예외를 발생시킴
	            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("숫자 변환 중 오류가 발생했습니다.");
	            illegalArgumentException.initCause(e);
	            throw illegalArgumentException;
	        }
	    }
}
