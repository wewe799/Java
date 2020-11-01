package com.vee.dao;

import com.vee.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookDao {

    //添加方法
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void bathUpdateBook(List<Object[]> bathArgs);

    void bathDeleteBook(List<Object[]> bathArgs);
}
