package com.example.kafkaSpring.controller;

import com.example.kafkaSpring.model.User;
import com.example.kafkaSpring.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/producer")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/{message}")
    public ResponseEntity<String> sendNotification(@PathVariable String message){
        kafkaProducer.sendNotification("notifications",message);
        return ResponseEntity.ok("Successfully");
    }
    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Successfully");
    }


}
