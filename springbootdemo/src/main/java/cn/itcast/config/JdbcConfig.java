package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

@Configuration
public class JdbcConfig {


    /**
     * 获取一个数据源
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix="jdbc")
    public DataSource getDataSource(){
         return new DruidDataSource();

     }

}
