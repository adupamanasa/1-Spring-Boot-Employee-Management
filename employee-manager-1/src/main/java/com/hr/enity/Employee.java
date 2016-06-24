package com.hr.enity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@NamedQuery(name="Employee.findByEmpNo",
                query="SELECT e FROM Employee e WHERE empNo = :empNo")
@Table(name="employees")
public class Employee {
	
	@Id
	@Column(name="emp_no")
	private long empNo;

	@Column(name="first_name",length=14)
	@NotEmpty
	private String firstName;

	@Column(name="last_name", length=16)
	@NotEmpty
	private String lastName;

	@Column(name="gender", length=2)
	//@NotEmpty
	private String gender;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="birth_date")
	private Date birthDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="hire_date")
	private Date hireDate;
	

	public long getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString(){
	return "Employee No="+empNo+", First Name="+firstName+", Last Name="+lastName+", Birth Date="+birthDate+", Gender="+gender+", Hire Date="+hireDate;
	}
	
}
