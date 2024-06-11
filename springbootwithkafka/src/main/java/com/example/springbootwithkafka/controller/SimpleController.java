package com.example.springbootwithkafka.controller;

import com.example.springbootwithkafka.model.Employee;
import com.example.springbootwithkafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/kafka/message")
public class SimpleController {

    @Autowired
    Producer producer;

//    @GetMapping("/producerMessage")
//    public void getMessage(@RequestParam("message") String message){
//        producer.sendMsgToTopic(message);
//    }

    @PostMapping("/createEmp")
    public void getEmpData(@RequestBody List<Employee> empData){
        producer.sendMsgEmpToTopic(empData);
    }
}
