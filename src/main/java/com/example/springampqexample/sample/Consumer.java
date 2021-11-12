package com.example.springampqexample.sample;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = "TEST")
    public void listen(String message) {
        System.out.println("message : " + message);
    }
}
