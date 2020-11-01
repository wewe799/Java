package com.vee.service;

import com.vee.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


//value的默认值是类名称首字母小写
//@Component(value = "userService")
@Service
public class UserService {

    @Value(value = "aaa")
    private String name;

    //定义Dao类型属性
    @Autowired
    private UserDao userdao;


    public void add() {
        System.out.println("service add..."+name);
        userdao.add();
    }
}
