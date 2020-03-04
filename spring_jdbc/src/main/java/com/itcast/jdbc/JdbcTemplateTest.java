package com.itcast.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.itcast.domain.Account;
import com.itcast.service.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private TransferService transferService;
    @Test
    public void test1(){
        transferService.transferMoney();

//        JdbcTemplate template =new JdbcTemplate();
//        template.setDataSource(dataSource);
//        List<Account> acclist= template.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
//        System.out.println(acclist);

    }
}
