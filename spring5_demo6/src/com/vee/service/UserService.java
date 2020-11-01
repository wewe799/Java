package com.vee.service;

import com.vee.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {

    //注入Dao
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        //lucy少100
        userDao.reduceMoney();

        //mary多100
        userDao.addMoney();
    }
}