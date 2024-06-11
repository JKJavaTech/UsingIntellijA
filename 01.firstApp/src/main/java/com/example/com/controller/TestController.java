package com.example.com.controller;

import com.example.com.model.Message;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin( origins = "http://localhost:3000")
public class TestController {

   private static List<String> listMessages =null;

    @PostMapping("/hello")
    public String getMessage(@RequestParam("message") String message){
        Message message1=new Message(message);
        listMessages=new ArrayList<>();
        listMessages.add(message1.getMessage());
        System.out.println("The List Message Was "+listMessages);
        return message1.getMessage();
    }

    @GetMapping("/date")
    public String getDate(){
      Date date = new Date();
      return date.toLocaleString();
    }

    @GetMapping("/listData")
    public List<String> getAllData(){
        return listMessages;
    }


}
