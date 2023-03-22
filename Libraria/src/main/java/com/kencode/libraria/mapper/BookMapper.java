package com.kencode.libraria.mapper;

import com.kencode.libraria.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface BookMapper {

    @Select("select * from Book")
    List<Book> findAllBooks();

    @Insert("Insert into Book (Name, Author, Genre, Synopsis, IBM) values (#{Name}, #{Author}, #{Genre}, #{Synopsis}, #{IBM})")
    void saveBook(Book book);

    @Select("select * from Book where Name = #{Name}")
    List<Book> getBookname(String Name);
}
