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

/**
 * @author Kishore Kumar
 * @version 1.0
 */

public class EmployeeRepo1 {
	DepartmentRepo departmentRepo = new DepartmentRepo();

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing create employee on Map DB
	 */

	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "insert into kishore_employee1 values(?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Insert query not executed");
		}
		return flag;

	}

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "delete kishore_employee1 where eid =?";

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

	public boolean doUpdateEmployee(Employee employee) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "update kishore_employee1 set dname =?, esalary = ?, dno =? where eid=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("update query not executed");
		}
		return flag;

	}

	public Employee doFindEmployee(int id) {
		int departmentNumber;

		Employee employee = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from kishore_employee1 where eid =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("dname"));
				employee.setEsalary(rs.getInt("esalary"));
				departmentNumber = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(departmentNumber);
				employee.setDepartment(department);

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return employee;
	}

	public List<Employee> doFindAllEmployee() {

		List<Employee> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from kishore_employee1";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("dname"));
				employee.setEsalary(rs.getInt("esalary"));
				int departmentNumber = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(departmentNumber);
				employee.setDepartment(department);
				list.add(employee);

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return list;
	}

}
