package com.intheeast.controlflowstatements;

public class SwitchDemoFallThrough {

	public static void main(String[] args) {
        // Empty List : element가 현재 하나도 없음
		java.util.ArrayList<String> futureMonths =
				// ↓ 이 리스트의 엘리먼트는 스트링이다
				new java.util.ArrayList<String>();
        		// 풀리 퀄리파이드 네임(Fully Qualified Name)
			 	// java.util 자바에서 지원해주는 도우미(유틸리티) 기능 패키지
		
		int month = 8;

        switch (month) {
            case 1: 
            	futureMonths.add("January");// 여기서 add는 리스트에 엘리먼트를 추가하는 메서드
            case 2: 
            	futureMonths.add("February");
            case 3: 
            	futureMonths.add("March");
            case 4: 
            	futureMonths.add("April");
            case 5: 
            	futureMonths.add("May");
            case 6: 
            	futureMonths.add("June");
            case 7: 
            	futureMonths.add("July");
            case 8: 
            	futureMonths.add("August");
            case 9:  
            	futureMonths.add("September");
            case 10:
            	futureMonths.add("October");
            case 11:
            	futureMonths.add("November");
            case 12:
            	futureMonths.add("December");
            	break;
            default:
            	break;
        }
        		// isEmpty : 리스트에 엘리먼트가 없으면 true
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String weekName : futureMonths) {
               System.out.println(weekName);
            }
        }
    }
}
