package com.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PostData {
	
//	 @Autowired
//     private static JdbcTemplate jdbcTemplate;
	 
	 private static final String SQL = "select * from user";  
	 
	public static void addData() {
 JdbcTemplate jdbcTemplate = new JdbcTemplate();
// DataSource datasource = new DataSource("")
// jdbcTemplate.setDataSource(dataSource);
		System.out.print(jdbcTemplate.queryForList(SQL));
	}
	 
	 
	public static void main(String args[]) {
       addData();
	}

}
