package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jdbcdao")
@Lazy(true)
public class JDBCDaoImpl implements IDao{
	
	public JDBCDaoImpl() {
		System.out.println("JDBC DAO constructor");
	}

	@Override
	public String getName() {
		
		return "jdbc name";
	}

}
