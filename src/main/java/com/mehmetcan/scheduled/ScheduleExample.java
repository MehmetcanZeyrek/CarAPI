package com.mehmetcan.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleExample {

	
	//@Scheduled(cron = "*/5 * * * * *")
	public void write1To10() {
		System.out.println("message");
		
	}
}
