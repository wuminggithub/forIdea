package com.itcast.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    public void test2() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println("con:"+connection);



    }

    @Test
    public void test1() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

        ResourceBundle bd = ResourceBundle.getBundle("jdbc");
        String driver = bd.getString("jdbc.driver");
        String url = bd.getString("jdbc.url");
        String username = bd.getString("jdbc.username");
        String password = bd.getString("jdbc.password");



    }
}
