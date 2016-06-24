package com.hr.service;

import com.hr.repository.EmployeeRepository;
import com.hr.enity.Employee;
//import com.hr.jparepository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataAccessException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	    
	    private EmployeeRepository employeeRepository;
	    
	    @Autowired
	    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }
	    @Override
	    public Employee findEmployeeById(long empNo) throws DataAccessException {
	            return employeeRepository.findById(empNo);
	        }
	    @Override
	    public List<Employee> findEmployees() throws DataAccessException {
	    	List<Employee> results= this.employeeRepository.findAll();
	            return results;
	        }
	    @Override
	    public void saveEmployee(Employee employee) throws DataAccessException {
	            employeeRepository.save(employee);
	        }

//	    @Override
//	    public void deleteEmployee(long empNo) throws DataAccessException {
//	            employeeRepository.delete(empNo);
//	        }

}
