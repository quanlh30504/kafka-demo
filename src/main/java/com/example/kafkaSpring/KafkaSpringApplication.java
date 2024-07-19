package com.example.kafkaSpring;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringApplication.class, args);
	}
//
//	@Bean
//	NewTopic notification(){
//		return new NewTopic("notification",2, (short) 1);
//	}
}
