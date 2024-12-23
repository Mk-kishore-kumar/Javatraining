package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcExample7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1: loading driver
		//by using class.forname
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(1);
		
		//step 2: making connection with database
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		System.out.println(2);
		
		//step 3: Creating statement
		
		String sql = "select * from kishore_employee1";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//executing query
		System.out.println(3);
		int n= ps.executeUpdate(); //Insert, delete, update not return anything
		//if it inserted successfully it return 1
		
		ResultSet  rs  = ps.executeQuery();//select
		System.out.println(4);
		
		ResultSetMetaData rsdata= rs.getMetaData();
		 System.out.println(rsdata.getColumnCount());
		 
		 for (int i = 1; i <= rsdata.getColumnCount(); i++) {
			 
			System.out.println(rsdata.getColumnName(i));
		}
		
		
		 
		
		while(rs.next()) {
			System.out.println(rs.getInt("eid")+" "+rs.getString("dname")+" "+rs.getInt("esalary")+" "+rs.getInt(n));
		}
		//step 5: closing
		
		ps.close();
		con.close();
		rs.close();
		
		
		
		
		

	}

}
