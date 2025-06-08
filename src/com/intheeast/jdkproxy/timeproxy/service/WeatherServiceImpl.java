package com.intheeast.jdkproxy.timeproxy.service;


public class WeatherServiceImpl implements WeatherService {
	 public String getWeather(String city) {
	     return city + "의 날씨는 맑음 ☀️";
	 }
}
