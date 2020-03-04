package com.itcast.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private DataSource dataSource;


    public void out() {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        template.update("update account set money=money-10 where name ='张三'");

    }

    public void in() {

    }
}
