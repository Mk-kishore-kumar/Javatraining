package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchProcess {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//step 2: making connection with database
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		System.out.println(2);
		
		//step 3: Creating statement
		
		String sql = "insert into kishore_employee1 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		// step 4: batch process executing the query
		
		ps.setInt(1, 203);
		ps.setString(2, "vijay");
		ps.setInt(3, 5400);
		ps.setInt(4, 2);
		ps.addBatch();//1 batch
		
		ps.setInt(1, 204);
		ps.setString(2, "surya");
		ps.setInt(3, 2300);
		ps.setInt(4, 1);
		ps.addBatch();//2 batch
		
		
		ps.setInt(1, 205);
		ps.setString(2, "ajith");
		ps.setInt(3, 3300);
		ps.setInt(4, 2);
		ps.addBatch();//3 batch
		
		ps.executeBatch();
		
		ps.close();
		con.close();
		
	}

}
