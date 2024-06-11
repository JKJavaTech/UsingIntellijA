package com.example.empapp.usingFeignclient;

import com.example.empapp.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsingFeighImpl implements FeignClientComm {

    @Autowired
    public FeignClientComm feignClientComm;
    @Override
    public Address getAddress(int id) {
        return feignClientComm.getAddress(id);
    }
}
