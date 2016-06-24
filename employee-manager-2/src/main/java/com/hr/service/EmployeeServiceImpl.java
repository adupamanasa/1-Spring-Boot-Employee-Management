package com.hr.service;

import com.hr.repository.EmployeeRepository;
import com.hr.enity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import com.hr.jparepository.EmployeeJpaRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	    private static final int PAGE_SIZE = 10;

	    
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
//	    public void deleteEmployee(Employee employee) throws DataAccessException {
//	            employeeJpaRepository.delete(setEmpNo(employee));
//	        }

	    @Override
	    public Page<Employee> findPagedEmployees(Pageable pg) throws DataAccessException {
	    	  Page<Employee> results= this.employeeRepository.findAll(pg);
	    	   return results;
	    }
	    
}
