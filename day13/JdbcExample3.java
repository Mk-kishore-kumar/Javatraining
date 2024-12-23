package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1: loading driver
		//by using class.forname
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(1);
		
		//step 2: making connection with database
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		System.out.println(2);
		//step 3: Creating statement
		
		String sql = "update kishore_employee1 set esalary= ? where eid =?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4: Executing the Query
		
		ps.setInt(1, 6000);
		ps.setInt(2, 201);
		//to execute use executeUpdate insert,delete,update
		//dml
		System.out.println(3);
		int n= ps.executeUpdate(); //Insert, delete, update not return anything
		//if it inserted successfully it return 1
		System.out.println(4);
		if(n == 1) {
			System.out.println("Employee record updated");
		} else {
			System.out.println("Employee record  Not updated");
		}
		
		//step 5: closing
		
		ps.close();
		con.close();
		
		
		
		
		

	}

}