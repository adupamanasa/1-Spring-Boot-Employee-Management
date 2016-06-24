package com.hr.repository;

import com.hr.enity.Employee;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.dao.DataAccessException;

@Repository
public interface EmployeeRepository {
	
	List<Employee> findAll() throws DataAccessException; 

	Employee findById(long empNo)throws DataAccessException;

	void save(Employee employee) throws DataAccessException;
	
//	void delete(long empNo) throws DataAccessException;

}
