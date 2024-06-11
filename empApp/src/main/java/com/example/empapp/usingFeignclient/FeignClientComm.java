package com.example.empapp.usingFeignclient;

import com.example.empapp.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usingFeign",url = "http://localhost:8082")
public interface FeignClientComm {

    @GetMapping("/address/getDatabyId/{id}")
    Address getAddress(@PathVariable int id);
}
