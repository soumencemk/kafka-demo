package com.soumen.kafkademo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Soumen Karmakar
 * 13/12/2019
 */
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
    @Autowired
    private final Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}

