package com.example.kafkaSpring.service;

import com.example.kafkaSpring.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "notifications", groupId = "myGroup")
    public void listenNotification(String message){
        log.info("Message -> " + message);
    }

}
