package com.example.springbootwithkafka.service;

import com.example.springbootwithkafka.model.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Consumer {

    @KafkaListener(topics = "WishMessage-Topic",groupId = "WishMessage_Group")
    public void listenToTopic(String receivedMessage) {
        System.out.println("Received message: " + receivedMessage);
    }

    @KafkaListener(topics = "empTopic",groupId = "empTopic-Group")
    public List<Employee> getEmployeeData(List<Employee> employee){
        return employee;
    }
}
