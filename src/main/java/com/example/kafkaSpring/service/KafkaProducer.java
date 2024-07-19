package com.example.kafkaSpring.service;

import com.example.kafkaSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${spring.kafka.topic}")
    private String topic;
    @Value("${spring.kafka.json-topic}")
    private String jsonTopic;
    public void sendNotification(String topic,String message){
        kafkaTemplate.send(topic,message);
    }

    public void sendMessage(User user){
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, jsonTopic)
                .build();
        kafkaTemplate.send(message);
    }
}
