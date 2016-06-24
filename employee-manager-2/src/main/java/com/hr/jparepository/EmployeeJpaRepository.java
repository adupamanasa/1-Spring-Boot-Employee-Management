package com.hr.jparepository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.hr.enity.Employee;
import java.util.List;
import com.hr.repository.EmployeeRepository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface EmployeeJpaRepository extends EmployeeRepository, PagingAndSortingRepository<Employee,Long> {

	@Query("SELECT e from Employee e WHERE e.lastName='Demian' and e.gender='F'")
	List<Employee> findAll() throws DataAccessException;

	@Query("SELECT e FROM Employee e WHERE e.empNo =:empNo")
	Employee findById(@Param("empNo") long empNo); 

	@Query("SELECT e from Employee e WHERE e.lastName='Demian'")
	Page<Employee> findAll(Pageable pageable) throws DataAccessException;
}
