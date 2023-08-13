package com.chubb.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig {
	public static Connection getStatement() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management_system","root","root");
		return con;
	}

}
