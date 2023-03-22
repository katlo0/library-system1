package com.kencode.libraria.impl;

import com.kencode.libraria.mapper.BookMapper;
import com.kencode.libraria.model.Book;
import com.kencode.libraria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllBooks(){
        return new ArrayList<>(bookMapper.findAllBooks());
    }

    public List<Book> getBookDetail(String name){
        return new ArrayList<>(bookMapper.getBookname(name));
    }

    public void addbook(Book book){
        this.bookMapper.saveBook(book);
    }
}
