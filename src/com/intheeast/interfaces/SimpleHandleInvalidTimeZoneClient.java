package com.intheeast.interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class SimpleHandleInvalidTimeZoneClient implements HandleInvalidTimeZoneClient {

	 private LocalDateTime dateAndTime;
	
	 public SimpleHandleInvalidTimeZoneClient() {
	        dateAndTime = LocalDateTime.now();
	    }
	    
	    // 아주 옛날... 스마트 폰이 없던 시대,,,
	    // 한국에서 미국 시애틀로 출장을 가는데,,,
	    // 한국에서 출발할 때는 시계의 TimeZone은 서울인데
	    // 시애틀 도착전에, TimeZone을 시애틀로 변경하려 한다면,
	    public void setTime(int hour, int minute, int second) {
	    	// TemporalAccessor temporal
	    	// LocalDataTime 클래스가 TemporalAccessor 인터페이스를 구현함
	        LocalDate currentDate = LocalDate.from(dateAndTime);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second);
	        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	    }
	    
	    // data 정보 : 2025-04-22
	    public void setDate(int day, int month, int year) {
	        LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime currentTime = LocalTime.from(dateAndTime);
	        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	    }
	    
	    public void setDateAndTime(int day, int month, int year,
	                               int hour, int minute, int second) {
	        LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
	        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	    }
	    
	    public LocalDateTime getLocalDateTime() {
	        return dateAndTime;
	    }
	    
	    public String toString() {
	        return dateAndTime.toString();
	    }

	    public static void main(String... args) {
	    	SimpleHandleInvalidTimeZoneClient shitzc =
	    			new SimpleHandleInvalidTimeZoneClient();
//	    	ZoneId zid;
	    	
//	    	shitzc.getZonedDateTime("Asia/Tokyo");
	    	
	    	// 상속받은 인터페이스에서는 부모 인터페이스의 static 메서드를 호출할 수 없다.
	    	// HandleInvalidTimeZoneClient.getZoneId("Asia/Tokyo");
	    	TimeClient.getZoneId("Asia/Tokyo");
	    
	    }
}
