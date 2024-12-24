package com.ems.main;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;
import com.ems.view.DepartmentView;
import com.ems.view.EmployeeView;

/**
 * @author Kishore Kumar
 * @version 1.0 It is main class execution start from here
 */

public class EMSApp {

	static Scanner sc = new Scanner(System.in);// global

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Insert Department");
		System.out.println("7. Delete department");
		System.out.println("8. Update department");
		System.out.println("9. Find Department");
		System.out.println("10.Find All Department");
		System.out.println("11. Exit");

		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();// has-a
		DepartmentService departmentServices = new DepartmentService();
		String result = "";
		String msg = " ";
		Employee employee;
		Department department;
		int id = 0;

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = EmployeeView.insertEmployeeView();
				result = employeeService.insertEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = EmployeeView.deleteEmployeeView();
				result = employeeService.deleteEmployeeValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = EmployeeView.updateEmployeeView();// globally decalared
				result = employeeService.updateEmployeeValidation(employee);
				System.out.println(result);

				break;
			case 4:
				id = EmployeeView.findEmployeeView();
				result = employeeService.findEmployeeValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllEmployeeValidation();
				System.out.println(result);
				break;// 5 more case for department
			case 6:
				department = DepartmentView.insertDepartmentView();
				result = departmentServices.insertDepartmentValidation(department);
				System.out.println(result);
				break;
			case 7:
				id = DepartmentView.deleteDepartmentView();
				result = departmentServices.deleteDepartmentValidation(id);
				System.out.println(result);
				break;
			case 8:
				department = DepartmentView.updateDepartmentView();
				result = departmentServices.updateDepartmentValidation(department);
				System.out.println(result);

				break;
			case 9:
				id = DepartmentView.findDepartmentView();
				result = departmentServices.findDepartmentValidation(id);
				System.out.println(result);
				break;
			case 10:
				result = departmentServices.findAlldepartmentValidation();
				System.out.println(result);
				break;
			case 11:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
