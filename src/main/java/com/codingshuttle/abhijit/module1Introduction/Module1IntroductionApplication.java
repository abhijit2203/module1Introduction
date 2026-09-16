package com.codingshuttle.abhijit.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentServiceObj1;

	@Autowired
	PaymentService paymentServiceObj2;

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args)  throws Exception{

		System.out.println(paymentServiceObj1.hashCode());
		System.out.println(paymentServiceObj2.hashCode());

		paymentServiceObj1.pay();
		paymentServiceObj2.pay();
	}

}
