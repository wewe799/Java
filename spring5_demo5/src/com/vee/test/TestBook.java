package com.vee.test;

import com.vee.entity.Book;
import com.vee.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
        /*Book book = new Book();
        book.setUserId("1");
        book.setUsername("Java");
        book.setUstatus("a");

        bookService.addBook(book);*/

        //修改
        /*Book book = new Book();
        book.setUserId("1");
        book.setUsername("Javaupup");
        book.setUstatus("vv");

        bookService.updateBook(book);

        //删除
        bookService.deleteBook("1");*/

        //查询返回某个值
        /*int count = bookService.findCount();
        System.out.println(count);*/

        //查询返回对象
        /*Book book = bookService.findOne("1");
        System.out.println(book);*/

        /*List<Book> all = bookService.findAll();
        System.out.println(all);*/

        //批量添加
        /*List<Object[]> bathArgs = new ArrayList<>();

        Object[] o1 = {"2","aaa", "a"};
        Object[] o2 = {"3","bbb", "b"};
        Object[] o3 = {"4","ccc", "c"};
        bathArgs.add(o1);
        bathArgs.add(o2);
        bathArgs.add(o3);

        bookService.batchAdd(bathArgs);*/


        List<Object[]> bathArgs = new ArrayList<>();

        Object[] o1 = {"2"};
        Object[] o2 = {"3"};
        bathArgs.add(o1);
        bathArgs.add(o2);

        bookService.bathDelete(bathArgs);
    }
}
