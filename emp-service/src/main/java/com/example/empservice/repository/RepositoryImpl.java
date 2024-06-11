package com.example.empservice.repository;

import com.example.empservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryImpl{
    @Autowired
    private EmpRepository empRepository;

    public Employee saveEmpData(Employee empData){
          return  empRepository.save(empData);
    }

    public Page<Employee> getAllUsingPagination(Pageable pageable){
        return empRepository.findAll(pageable);
    }

}
