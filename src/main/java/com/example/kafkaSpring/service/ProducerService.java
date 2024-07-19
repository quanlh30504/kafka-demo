package com.example.kafkaSpring.service;

import com.example.kafkaSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendNotification(String topic,String message){
        kafkaTemplate.send(topic,message);
    }

    public void sendMessage(User user){
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "messages")
                .build();
        kafkaTemplate.send(message);
    }
}
