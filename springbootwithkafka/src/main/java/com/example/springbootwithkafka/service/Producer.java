package com.example.springbootwithkafka.service;

import com.example.springbootwithkafka.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String,List<Employee>> kafkaTemplate;


//    public void sendMsgToTopic(String message){
//           kafkaTemplate.send("WishMessage-Topic",message);
//    }

    public List<Employee> sendMsgEmpToTopic(List<Employee> emp){
        kafkaTemplate.send("empTopic",emp);
        return emp;
    }
}
