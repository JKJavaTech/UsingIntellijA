package com.example.empapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpAddBean {

    private int id;
    private String name;
    private String streetName;
    private String country;
}
