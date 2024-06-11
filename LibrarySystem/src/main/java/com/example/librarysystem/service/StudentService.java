package com.example.librarysystem.service;

import com.example.librarysystem.bean.Book;
import com.example.librarysystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Book createBook(Book book){
         return studentRepo.save(book);
    }
}
