package com.ems.service;

import com.ems.model.Employee;

import com.ems.repo.EmployeeRepo1;

public class EmployeeService {

	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	public String insertEmployeeValidation(Employee employee) {
		String result;

		if (employee == null) { // validation of employee
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0
				|| employee.getDepartment().getDno() == 0) {
			result = "Invalid employee Data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not saved";
			}
		}
		return result;

	}

	public String deleteEmployeeValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);

			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object Not Found";
			}
		}

		return result;
	}

//
	public String updateEmployeeValidation(Employee employee) {
		String result = "";

		if (employee == null) {
			result = "Employee Object is Null";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);

			if (flag) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object Not Found";
			}
		}

		return result;
	}

	public String findEmployeeValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);

			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}

		return result;
	}

//
	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAllEmployee().toString();
	}

}
