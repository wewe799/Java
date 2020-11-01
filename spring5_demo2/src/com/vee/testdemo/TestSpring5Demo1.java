package com.vee.testdemo;

import com.vee.autowire.Emp;
import com.vee.bean.Orders;
import com.vee.collecctiontype.Book;
import com.vee.collecctiontype.Course;
import com.vee.collecctiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Course course = context.getBean("Mybean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testCollection4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4.获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testCollection5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
