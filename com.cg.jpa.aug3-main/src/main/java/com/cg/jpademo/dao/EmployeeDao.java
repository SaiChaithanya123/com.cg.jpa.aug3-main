package com.cg.jpademo.dao;

import javax.persistence.EntityExistsException;

import com.cg.jpa.aug3.entities.Employee;

public interface EmployeeDao {

	public abstract Employee getEmployeeById(int id);

	public abstract void addEmployee(Employee employee) throws EntityExistsException;

	public abstract void removeEmployee(Employee employee);

	public abstract void updateEmployee(Employee employee);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}