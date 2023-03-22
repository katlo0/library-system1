package com.kencode.libraria;

import com.kencode.libraria.impl.BookServiceImpl;
import com.kencode.libraria.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrariaApplication.class, args);
    }


}
