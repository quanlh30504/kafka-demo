package com.example.kafkaSpring.service;

import com.example.kafkaSpring.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {


    @KafkaListener(topics = "${spring.kafka.json-topic}", groupId = "myGroup")
    public void listenMessage(User user){
        log.info("Message -> " + user);
    }
}
