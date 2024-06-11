package com.example.librarysystem.repo;

import com.example.librarysystem.bean.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends CrudRepository<Book, Integer> {
}
