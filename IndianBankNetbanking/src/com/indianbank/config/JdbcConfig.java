package com.indianbank.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConfig {
	public static Connection getStatement() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_application", "root", "root");
		
		
		return con;
	}

}
