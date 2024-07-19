package com.example.kafkaSpring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.topic}")
    private String topic;
    @Value("${spring.kafka.json-topic}")
    private String jsonTopic;
    @Bean
    public NewTopic notification(){
        return new NewTopic(topic,10,(short)1);
    }
    @Bean
    public NewTopic message(){
        return new NewTopic(jsonTopic,10,(short)1);
    }
}
