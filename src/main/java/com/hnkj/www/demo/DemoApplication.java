package com.hnkj.www.demo;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication {

	/**
	 * 数据源1：JdbcTemplate
	 */
//	@Bean(name = "secondaryJdbcTemplate")
//	public JdbcTemplate secondaryJdbcTemplate(
//	        @Qualifier("secondaryDataSource") DataSource dataSource) {
//	    return new JdbcTemplate(dataSource);
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
