package com.intheeast.interfaces;

import java.time.*;

public interface TimeClient {

	 void setTime(int hour, int minute, int second);
	    void setDate(int day, int month, int year);
	    void setDateAndTime(int day, int month, int year,
	        int hour, int minute, int second);
	    LocalDateTime getLocalDateTime();                           
	   
//	    ZonedDateTime getZonedDateTime(String zoneString);

////////////////////////////////////
//	    LocalDate setLocalDataTime(); ->LocalDate는 잘 쓰지 않는다(날짜)
//										LocalDateTime 사용(날짜 + 시간)

	static ZoneId getZoneId (String zoneString) {
	    try {
	        return ZoneId.of(zoneString);
	    } catch (DateTimeException e) {
	        System.err.println("Invalid time zone: " + zoneString +
	            "; using default time zone instead.");
	        return ZoneId.systemDefault();
	    }
	}
	//defualt 메서드는 구현체의 인스턴스를 만들어야 사용 가능 
	default ZonedDateTime getZonedDateTime(String zoneString) {
	    return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	}
}