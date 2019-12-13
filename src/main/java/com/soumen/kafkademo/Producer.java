package com.soumen.kafkademo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Soumen Karmakar
 * 13/12/2019
 */
@Service
@RequiredArgsConstructor
public class Producer {
    private static final String TOPIC = "test";
    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("Producing Message : " + message);
        this.kafkaTemplate.send(TOPIC, message);

    }
}
