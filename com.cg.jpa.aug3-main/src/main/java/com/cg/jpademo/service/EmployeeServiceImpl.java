package com.cg.jpademo.service;

import javax.persistence.EntityExistsException;

import com.cg.jpa.aug3.dao.EmployeeDao;
import com.cg.jpa.aug3.dao.EmployeeDaoImpl;
import com.cg.jpa.aug3.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee employee) {
		dao.beginTransaction();
		try {
			dao.addEmployee(employee);
			dao.commitTransaction();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
	}

	@Override
	public void removeEmployee(Employee employee) {
		dao.beginTransaction();
		dao.removeStudent(employee);
		dao.commitTransaction();
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee;
		employee = dao.getEmployeeById(id);
		System.out.println("findEmployeeById in EmployeeServiceImpl");
		return employee;
	}
}


