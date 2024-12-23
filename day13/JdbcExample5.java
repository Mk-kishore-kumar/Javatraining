package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExample5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		
		
		//data of database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		DatabaseMetaData dsdata = con.getMetaData();
		System.out.println(dsdata.getDatabaseProductName());
		System.out.println(dsdata.getDriverName());
		System.out.println(dsdata.getDriverVersion());
		   
	
     	con.close();

		
		
		
		
		

	}

}
