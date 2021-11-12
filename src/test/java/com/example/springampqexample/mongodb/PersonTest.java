package com.example.springampqexample.mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonTest {

    @Autowired
    private PersonMongoDBRepository personMongoDBRepository;

    @Test
    void testMongDB() {
        Person person = new Person("test", "job");
        personMongoDBRepository.save(person);

        List<Person> persons = personMongoDBRepository.findAll();
        persons.stream().forEach(p -> System.out.println(p.toString()));

    }

}