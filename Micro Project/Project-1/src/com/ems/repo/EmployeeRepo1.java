package com.ems.repo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;
/**
 * @author Kishore Kumar
 * @version 1.0
 */

public class EmployeeRepo1 {
	
	/** 
	 * 
	 * @param employee
	 * @return boolean
	 * It is performing create employee on Map DB
	 */

	public boolean doInsert(Employee employee) {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEid(), employee);
		return true;
	}

	public boolean doDelete(int id) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();// getting map instance
		if (map.containsKey(id)) {// Map is easy no need of iterator,contains enough
			map.remove(id);
			flag = true;
		}
		return flag;
	}

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getEid())) {
			map.put(employee.getEid(), employee);
			flag = true;
		}
		return flag;
	}

	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}

	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;// returning list of employee
	}
}
