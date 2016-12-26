package com.pingnotes.conf;

import com.pingnotes.util.ClsPathResourceUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by shaobo on 12/21/16.
 */

@Configuration
public class DaoConfiguration {
    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        Resource[] resources = ClsPathResourceUtils.scan();
        bean.setMapperLocations(resources);
        return bean;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sessionFactory) {
        SqlSessionTemplate template = new SqlSessionTemplate(sessionFactory);
        return template;
    }

    /**
     * this scanner is used for finding all mapper interfaces, not for mapper xml files
     *
     * @return
     */
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer bean = new MapperScannerConfigurer();
        bean.setBasePackage("com.pingnotes.mapper");
        return bean;
    }

}
