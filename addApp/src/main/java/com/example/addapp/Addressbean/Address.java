package com.example.addapp.Addressbean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private int addId;
    private String streetName;
    private String country;
}
