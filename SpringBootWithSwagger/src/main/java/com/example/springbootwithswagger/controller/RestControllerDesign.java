package com.example.springbootwithswagger.controller;

import com.example.springbootwithswagger.bean.Wish;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class RestControllerDesign {


    @PostMapping("/getData")
    public Wish getData(@RequestBody Wish wish){
        System.out.println("Get Wish Message "+wish.getWishMsg());
        Wish wish1 = new Wish();
        wish1.setWishMsg(wish.getWishMsg());
       return wish1;
    }
}
