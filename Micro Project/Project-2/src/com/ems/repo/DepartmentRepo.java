package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

public class DepartmentRepo {

	public boolean doInsertDepartment(Department department) {
		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "insert into kishore_department values(?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Insert query not executed");
		}
		return flag;

	}

	public boolean doDeleteDepartment(int id) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "delete kishore_department where dno =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Delete query not executed");
		}
		return flag;

	}

//
//	
//
	public boolean doUpdateDepartment(Department department) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "update kishore_department set dname=? where dno=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, department.getDname());

			ps.setInt(2, department.getDno());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("update query not executed");
		}
		return flag;

	}

//	
//
	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from kishore_department where dno =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();

				department.setDname(rs.getString("dname"));
				department.setDno(rs.getInt("dno"));

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return department;
	}

	public List<Department> doFindAllDepartment() {

		List<Department> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from kishore_department";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Department department = new Department();

				department.setDname(rs.getString("dname"));
				department.setDno(rs.getInt("dno"));

				list.add(department);

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return list;
	}

}
