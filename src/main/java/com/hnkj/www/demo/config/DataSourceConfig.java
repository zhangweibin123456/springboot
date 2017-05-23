package com.hnkj.www.demo.config;

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Qualifier;  
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;  
import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;  
  
@Configuration  
public class DataSourceConfig {  
  
  
    @Bean(name = "primaryDS")  
    @Qualifier("primaryDS")  
    @ConfigurationProperties(prefix="spring.primary.datasource")  
    public DataSource secondaryDataSource(){  
        return DataSourceBuilder.create().build();  
    }  
    
	/**
	 * 数据源1：JdbcTemplate
	 */
//	@Bean(name = "secondaryJdbcTemplate")
//	public JdbcTemplate secondaryJdbcTemplate(
//	        @Qualifier("secondaryDataSource") DataSource dataSource) {
//	    return new JdbcTemplate(dataSource);
//	}
	
	
  
} 