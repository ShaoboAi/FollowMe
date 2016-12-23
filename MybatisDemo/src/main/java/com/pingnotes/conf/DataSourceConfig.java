package com.pingnotes.conf;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by shaobo on 12/22/16.
 */
@Configuration
@PropertySource("classpath:mysql/ds.properties")
public class DataSourceConfig {
    @Autowired
    Environment env;

    @Bean
    public DataSource dataSource(){
        PooledDataSource ds = new PooledDataSource();
        String driver = env.getProperty("driver");
        String url = env.getProperty("url");
        String username = env.getProperty("username");
        String passwd = env.getProperty("password");

        ds.setDriver(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(passwd);
        return ds;
    }
}
