package com.genertic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	protected BaseResiposity<T> baseResiposity;
	
	public void add()
	{
		System.out.println("add...");
		System.out.println(baseResiposity);
	}
	
}
