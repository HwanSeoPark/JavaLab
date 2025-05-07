package com.intheeast.controlflowstatements;

public class StringSwitchDemo {
	
	// month 파라미터에 "August" 의 리터럴을 참조하고 있는 스트링 클래스 객체의 인스턴스 참조값을
	// 아규먼트로 전달하고 있음.
	public static int getMonthNumber(String month) {

        int monthNumber = 0;

        // null : 아무것도 참조하고 있지 않다.
        // String nextMonth = null;
        
        // 주의해서 보기!!
        if (month == null) {
            // 현재 getMonthNumber 메서드의
        	// return statement가 if(month == null) "블럭"의 statement로 작성되있음.
        	// 곧바로 getMonthNumber 메서드 호출자에게 리턴함!!!
        	return monthNumber;
        }

        // toLowerCase는 String 클래스의 인스턴스 메서드!!
        // toLowerCase : month 참조 변수가 참조하고 있는 String 클래스 객체의 인스턴스 필드에[value]의 스트링을
        // 소문자 타입으로 리턴한다
        // "Agust" -->"august"\
        // month.value ---> 전부 소문자화
        // String 클래스의 인스턴스 또는 static 메서드들을 친숙히 다뤄야 함.
        String lowerCaseString = month.toLowerCase();
        							// toLowerCase는 Java Api기능
        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
            StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
}
