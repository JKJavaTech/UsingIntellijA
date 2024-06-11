package com.example.librarysystem.controller;


import com.example.librarysystem.bean.Book;
import com.example.librarysystem.repo.StudentRepo;
import com.example.librarysystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/student")
@RestController
public class LibraryController {

    @Autowired
    private StudentService studentService;

    @PostMapping ("/create")
    public Book addBook(@RequestBody Book book){
      // Book b1=new Book(book.getId(),book.getTitle(),book.getAuthor(),book.getDept());
      return studentService.createBook(book);

    }
}
