package com.vee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update account set money = money + ? where username = ?";
        jdbcTemplate.update(sql, 100,"mary");
    }

    //lucy转账100给mary
    @Override
    public void reduceMoney() {
        String sql = "update account set money = money - ? where username = ?";
        jdbcTemplate.update(sql, 100,"lucy");
    }
}
