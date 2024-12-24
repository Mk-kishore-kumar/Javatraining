package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EmployeeView {
	static Scanner sc = new Scanner(System.in);
	static int eid, esalary, dno;
	static String ename, dname;

	/**
	 * It is user interface to display options
	 */

	/**
	 * It is getting input(Data) from user. passing it to caller.
	 * 
	 * @return Employee
	 */

	public static Employee insertEmployeeView() {
		System.out.println("Enter employee id, name and salary, dno");
		Department department = new Department();
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		department.setDno(dno);
		return new Employee(eid, ename, esalary, department);

	}

	public static int deleteEmployeeView() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}

//
	public static Employee updateEmployeeView() {
		// in update we are updateing everything
		System.out.println("Enter employee id, name and salary, dno to update employee");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(eid, ename, esalary, department);

	}

	public static int findEmployeeView() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}

}