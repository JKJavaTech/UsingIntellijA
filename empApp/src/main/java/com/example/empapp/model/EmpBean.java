package com.example.empapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpBean {
    private int emp_id;
    private String emp_name;
    private int emp_age;
}
