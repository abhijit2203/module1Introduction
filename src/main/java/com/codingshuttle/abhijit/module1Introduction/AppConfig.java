package com.codingshuttle.abhijit.module1Introduction;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    //@Scope("request")
    PaymentService paymentService(){
        //more logic
        return new PaymentService();
    }
}
