package com.soumen.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Soumen Karmakar
 * 13/12/2019
 */
@Service
public class Consumer {

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Message consumed : " + message);

    }

}
