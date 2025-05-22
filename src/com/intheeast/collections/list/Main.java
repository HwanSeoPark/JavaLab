package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String... args) {
		// Array와 비교해서 어떤 장점을?
		// : Offset!!! (Array장점) : 배열의 첫번째 엘리먼트의 
		// 							주소만 알면 됨.
		//                          엘리먼트의 동일한 데이터 타입
		//                          연속적인 메모리 공간에 엘리먼트가 저장됨
		// 장점 : Element의 Insert/Delete 자유로움
		// 단점 : 연속적인 메모리 공간에
		//       Element가 저장되지 않음.
		//       -> 어딘가에 엘리먼트의 저장 위치 정보가 관리.
		List<String> list =
				new ArrayList<>();
	}
}
