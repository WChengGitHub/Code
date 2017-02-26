package com.genertic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beans-genertic-di.xml");
		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.add();
	}
}
