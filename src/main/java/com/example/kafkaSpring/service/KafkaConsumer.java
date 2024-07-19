package com.example.kafkaSpring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notifications", groupId = "myGroup")
    public void listenNotification(String message){
        log.info("Message -> " + message);
    }

}
