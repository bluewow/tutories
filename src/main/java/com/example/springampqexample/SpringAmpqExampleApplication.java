package com.example.springampqexample;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableRabbit
@EnableScheduling
@SpringBootApplication
public class SpringAmpqExampleApplication {

//    @Profile("usage_message")
//    @Bean
//    public CommandLineRunner usage() {
//        return new RabbitAmqpRunner();
//    }
//
//    @Profile("!usage_message")
//    @Bean
//    public CommandLineRunner tutorial() {
//        return new RabbitAmqpTutorialsRunner();
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAmpqExampleApplication.class, args);
    }

}
