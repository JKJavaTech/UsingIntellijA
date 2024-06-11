package com.example.addapp.controller;

import com.example.addapp.Addressbean.Address;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
public class AddressController {

    private static List<Address> addressList=new ArrayList<>();
    @RequestMapping(value = "/getAddress",method = RequestMethod.GET)
    public String getAddress(){
       return "Welcome to Address Class Controller";
    }

    @PostMapping("/createAddress")
    public List<Address> createAddress(@RequestBody Address address){
        addressList.add(address);
        return addressList;
    }

    @GetMapping("/getDatabyId/{id}")
    public Address getAddById(@PathVariable int id){
        return addressList.stream().filter((address)->address.getAddId()==id).findFirst().get();
    }

}
