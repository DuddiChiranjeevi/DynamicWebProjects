package com.andhra_bank.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.andhra_bank.pojo.UserDetails;

public class JdbcConfig {
public static  Connection getStatement() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
	return con;
	
}
}
