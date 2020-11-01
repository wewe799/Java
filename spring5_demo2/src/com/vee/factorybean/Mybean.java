package com.vee.factorybean;

import com.vee.collecctiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
