package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
    @Value("${jdbc.driverClassName}")
    String driverClassName;
     @Value("${jdbc.url}")
    String url;
     @Value("${jdbc.username}")
    String username;
     @Value("${jdbc.password}")
    String password;

    /**
     * 获取一个数据源
     * @return
     */
    @Bean
    public DataSource getDataSource(){
         DruidDataSource dataSource = new DruidDataSource();
         dataSource.setDriverClassName(driverClassName);
         dataSource.setUrl(url);
         dataSource.setUsername(username);
         dataSource.setPassword(password);
         return dataSource;
     }

}
