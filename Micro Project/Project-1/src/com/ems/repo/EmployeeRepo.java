package com.ems.repo;

import java.util.Iterator;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

public class EmployeeRepo {

	public boolean doInsert(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee);// true or false go to service layer

	}

	public boolean doDelete(int id) {
		boolean flag = false;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();

		while (it.hasNext()) {
			Employee temp = it.next();// for each iteration ill get current emp obj 1 id

			if (temp.getEid() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();

		while (it.hasNext()) {
			Employee temp = it.next();// for each iteration ill get current emp obj 1 id

			if (temp.getEid() == employee.getEid()) {
				list.set(index, employee);// replace object set method
				it.remove();
				flag = true;
				break;
			}
			index++;
		}
		return flag;
	}

	public Employee doFind(int id) {
		Employee employee = null;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();

		while (it.hasNext()) {
			Employee temp = it.next();// for each iteration ill get current emp obj 1 id

			if (temp.getEid() == id) {
				employee = temp;
				break;
			}
		}
		return employee;
	}

	public List<Employee> doFindAll() {
		return DBUtil.getListDBInstance();// returning list of employee
	}
}
