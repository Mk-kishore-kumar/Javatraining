package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @author Kishore Kumar
 * @version 1.0 It is main class execution start from here
 */

public class EMSApp {

	static Scanner sc = new Scanner(System.in);

	/**
	 * It is user interface to display options
	 */

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}

	/**
	 * It is getting input(Data) from user. passing it to caller.
	 * 
	 * @return Employee
	 */

	public static Employee insertView() {
		System.out.println("Enter employee id, name and salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

		return employee;// model object
	}

	public static int deleteView() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}

	public static Employee updateView() {
		System.out.println("Enter employee id, name and salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

		return employee;// returning model object model object
	}

	public static int findView() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();// has-a
		String result = "";
		String msg = " ";
		Employee employee;
		int id = 0;

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();// globally decalared
				result = employeeService.updateValidation(employee);
				System.out.println(result);

				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
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
