/**
 * BBD Service Inc
 * All Rights Reserved @2017
 */
package com.light.springboot.web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 *
 *
 * @author jiapingWang
 * @version $Id: DruidDataSourceConfiguration.java, v0.1 ${DATA} 10:15 jiapingWang Exp $$
 */
@Configuration
public class DruidDataSourceConfig {
    @Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driverClazz,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String userName,
            @Value("${jdbc.password}") String password,
            @Value("${jdbc.maxactive}") int maxActive,
            @Value("${jdbc.maxWait}") int maxWait,
            @Value("${jdbc.validationQuery}") String validateQuery,
            @Value("${jdbc.testOnBorrow}") boolean testOnBorrow,
            @Value("${jdbc.testWhileIdle}") boolean testWhileIdle,
            @Value("${jdbc.timeBetweenEvictionRunsMillis}") int timeBetweenEvictionRunsMillis,
            @Value("${jdbc.minEvictableIdleTimeMillis}") int minEvictableIdleTimeMillis,
            @Value("${jdbc.poolPreparedStatements}") boolean poolPreparedStatements,
            @Value("${jdbc.maxPoolPreparedStatementPerConnectionSize}") int maxPoolPreparedStatementPerConnectionSize)
    {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driverClazz);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        ds.setMaxActive(maxActive);
        ds.setMaxWait(maxWait);
        ds.setValidationQuery(validateQuery);
        ds.setTestOnBorrow(testOnBorrow);
        ds.setTestWhileIdle(testWhileIdle);
        ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        ds.setPoolPreparedStatements(poolPreparedStatements);
        ds.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        return ds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
