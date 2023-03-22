package com.kencode.libraria.controller;

import com.kencode.libraria.impl.BookServiceImpl;
import com.kencode.libraria.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081")
public class BookController {

    @Autowired
    private BookServiceImpl bookimpl;

    @GetMapping("/books")
    public List<Book> fetchAllBooks(){
        return bookimpl.getAllBooks();
    }
}
