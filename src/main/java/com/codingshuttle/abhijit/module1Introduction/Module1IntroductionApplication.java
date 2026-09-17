package com.codingshuttle.abhijit.module1Introduction;

import com.codingshuttle.abhijit.module1Introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {



//	@Autowired
//	final NotificationService notificationService; // dependency injection
//
//	public Module1IntroductionApplication(NotificationService notificationService) {
//		this.notificationService = notificationService;  // constructor dependency injection //preferred
//	}

	@Autowired
	Map<String, NotificationService> notificationServicesMap = new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args)  throws Exception{
          //NotificationService notificationService= new EmailNotificationService();

		 // notificationService.send("hello");

		for(var notificationService: notificationServicesMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}

}
