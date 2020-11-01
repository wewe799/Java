package com.vee.service;

import com.vee.dao.BookDao;
import com.vee.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    //查询表中记录数
    public int findCount() {
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id) {
        return bookDao.findBookInfo("1");
    }

    //查询返回集合
    public List<Book> findAll() {
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void bathUpdate(List<Object[]> bathArgs) {
        bookDao.bathUpdateBook(bathArgs);
    }

    //批量删除
    public void bathDelete(List<Object[]> bathArgs) {
        bookDao.bathDeleteBook(bathArgs);
    }
}
