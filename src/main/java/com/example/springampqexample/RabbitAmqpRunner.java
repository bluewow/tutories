package com.example.springampqexample;

import com.example.springampqexample.sample.Consumer;
import com.example.springampqexample.sample.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

public class RabbitAmqpRunner implements CommandLineRunner {

    @Autowired
    private ConfigurableApplicationContext ctx;

    @Autowired
    Producer producer;


    @Override
    public void run(String... args) throws Exception {
        producer.sendTo("TEST~~~~~~~~~~~~~~~~~~~1");
        producer.sendTo("TEST~~~~~~~~~~~~~~~~~~~2");
        producer.sendTo("TEST~~~~~~~~~~~~~~~~~~~3");
        ctx.close();
    }
}
