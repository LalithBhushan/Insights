package com.dr.java8;

import java.time.LocalDateTime;

public interface TimeClient {

	void setTime(int hour,int minute,int second);
	
void setDate(int day,int year,int month);
void setDateAndTime(int day,int year,int month,int hour,int minute,int second);

LocalDateTime getLocalDateAndTime();
}
