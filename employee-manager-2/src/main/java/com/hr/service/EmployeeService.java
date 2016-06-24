package com.hr.service;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import com.hr.enity.Employee;

public interface EmployeeService {

	Employee findEmployeeById(long empNo) throws DataAccessException;

	void saveEmployee(Employee employee) throws DataAccessException;

	List<Employee> findEmployees() throws DataAccessException;

    Page<Employee> findPagedEmployees(Pageable pageable) throws DataAccessException;
	
//	void deleteEmployee(long empNo) throws DataAccessException;

}
