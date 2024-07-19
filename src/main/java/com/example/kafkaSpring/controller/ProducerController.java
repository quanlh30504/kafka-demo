package com.example.kafkaSpring.controller;

import com.example.kafkaSpring.model.User;
import com.example.kafkaSpring.service.ProducerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/{message}")
    public ResponseEntity<String> sendNotification(@PathVariable String message){
        producerService.sendNotification("notifications",message);
        return ResponseEntity.ok("Successfully");
    }
    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody User user){
        producerService.sendMessage(user);
        return ResponseEntity.ok("Successfully");
    }


}
