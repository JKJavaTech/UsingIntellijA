package com.example.empservice.controller;

import com.example.empservice.repository.RepositoryImpl;
import com.example.empservice.model.Employee;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
public class EmployeeController {

    private static Logger logger= Logger.getLogger("EmployeeController.class");

    @Autowired
    private RepositoryImpl repositoryImpl;

    @PostMapping("/employeeCreate")
    public Employee createEmpData(@RequestParam Map<String,String> requestParam){
        int empId= Integer.parseInt(requestParam.get("id"));
        System.out.println("The ID WAS "+empId);
        String empName=requestParam.get("name");
        System.out.println("THE NAME WAS "+empName);
        String empDesignation=requestParam.get("designation");
        System.out.println("THE DESIGNATION WAS "+empDesignation);
        double empSalary= Double.parseDouble(requestParam.get("salary"));
        System.out.println("THE SALARY WAS "+empSalary);
        Employee emp=new Employee(empId,empName,empDesignation,empSalary);
        return repositoryImpl.saveEmpData(emp);
    }

    @GetMapping("/page-one")
    public List<Employee> getDataUsingPaginarion(){
        //Need to create the pagable Object
        PageRequest pageRequest=PageRequest.of(0,5);
        return repositoryImpl.getAllUsingPagination(pageRequest).get().toList();
    }
}