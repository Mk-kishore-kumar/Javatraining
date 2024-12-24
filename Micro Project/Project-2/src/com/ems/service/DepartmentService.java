package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.EmployeeRepo1;

public class DepartmentService {

	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;

		if (department == null) { // validation of employee
			result = "Department Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid employee Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "department Object Saved";
			} else {
				result = "department Object Not saved";
			}
		}
		return result;

	}

	public String deleteDepartmentValidation(int id) {

		String result = "";

		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);

			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object Not Found";
			}
		}

		return result;
	}

//
	public String updateDepartmentValidation(Department department) {
		String result = "";

		if (department == null) {
			result = "department Object is Null";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);

			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found";
			}
		}

		return result;
	}

	public String findDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);

			if (department != null) {
				result = department.toString();
			} else {
				result = "department Object Not Found";
			}
		}

		return result;
	}

////
	public String findAlldepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}
