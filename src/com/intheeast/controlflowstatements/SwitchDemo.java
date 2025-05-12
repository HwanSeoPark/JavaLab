package com.intheeast.controlflowstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		 int month = 3;
		 String monthString;
	     
		 
		 // swith 조건식에 사용될 수 있는 데이터 타입은 다음과 같습니다.
		 // byte, short, char, int 기본[primitive] 데이터 타입 
		 // 그리고
		 // Enum, String, Character, Byte, Short, Integer		 
		 switch (month) {
	            case 1: 
	            	monthString = "January"; 
	            	break;
	            case 2:  
	            	monthString = "February";
	            	break;
	            case 3:  
	            	monthString = "March"; 
	            	break;
	            case 4:
	            	monthString = "April";
	            	break;
	            case 5:
	            	monthString = "May";
	            	break;
	            case 6:
	            	monthString = "June"; 
	            	break;
	            case 7:
	            	monthString = "July"; 
	            	break;
	            case 8:
	            	monthString = "August"; 
	            	break;
	            case 9: 
	            	monthString = "September"; 
	            	break;
	            case 10:
	            	monthString = "October"; 
	            	break;
	            case 11: 
	            	monthString = "November"; 
	            	break;
	            case 12:
	            	monthString = "December";
	            	break;
	            default:
	            	monthString = "Invalid month";
	            	break;
	        }
	        System.out.println(monthString);
	}

}
