package com.example.kafkaSpring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic notification(){
        return new NewTopic("notifications",10,(short)1);
    }
    @Bean
    public NewTopic message(){
        return new NewTopic("messages",10,(short)1);
    }
}
