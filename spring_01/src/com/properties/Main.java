package com.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Person;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-properties.xml");
		 DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		 System.out.println(dataSource.getConnection());
		 
	}

}
