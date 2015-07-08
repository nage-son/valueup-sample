/*
 * @(#)DatabaseConfiguration.java  2015. 07. 06
 *
 * Copyright(c) 2015 JoonHo Son.
 */

package com.test.valueup.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * DatabaseConfiguration
 *
 * @author JoonHo Son
 * @version 1.0.0 2015. 07. 06
 * @since 1.0.0
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration implements TransactionManagementConfigurer {
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/valueup_test?autoReconnect=true&characterEncoding=utf8&useUnicode=true");
        dataSource.setUsername("valueup");
        dataSource.setPassword("1111");

        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource());
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
            "classpath:mappers/*.xml"));

        return sessionFactory;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();

        configurer.setBasePackage("com.test.valueup");
        configurer.setAnnotationClass(org.springframework.stereotype.Repository.class);

        return configurer;
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return transactionManager();
    }
}
