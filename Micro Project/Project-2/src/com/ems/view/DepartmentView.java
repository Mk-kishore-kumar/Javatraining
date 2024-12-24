package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentView {

	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;

	public static Department insertDepartmentView() {
		System.out.println("Enter departmentno and departmentname");

		dno = sc.nextInt();
		dname = sc.next();

//	Department department = new Department();
//	department.setDno(dno);

		return new Department(dno, dname);

	}

	public static int deleteDepartmentView() {

		System.out.println("Enter departmentnumber");

		return sc.nextInt();

	}

//
	public static Department updateDepartmentView() {
		// in update we are updateing everything
		System.out.println("Enter departmentNumber ,departmentName to update");

		dno = sc.nextInt();
		dname = sc.next();

		return new Department(dno, dname);

	}

	public static int findDepartmentView() {

		System.out.println("Enter department id");
		return sc.nextInt();
	}

}
