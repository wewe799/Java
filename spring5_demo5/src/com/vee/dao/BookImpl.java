package com.vee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.vee.entity.Book;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


@Repository
public class BookImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {

        //创建sql语句
        String sql = "insert into book values(?, ?, ?)";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update book set username = ?, ustatus = ? where user_id = ?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from book where user_id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;
    }


    public Book findBookInfo(String id) {
        String sql = "select * from book where user_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);

        return book;
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return books;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into book values(?, ?, ?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void bathUpdateBook(List<Object[]> bathArgs) {
        String sql = "update book set username = ?, ustatus = ? where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, bathArgs);
        System.out.println(ints);
    }

    @Override
    public void bathDeleteBook(List<Object[]> bathArgs) {
        String sql = "delete from book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, bathArgs);
        System.out.println(ints);
    }


}
