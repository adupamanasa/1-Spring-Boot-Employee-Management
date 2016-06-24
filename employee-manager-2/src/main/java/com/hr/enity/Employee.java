package com.hr.enity;


import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Type;

@Entity
@NamedQuery(name="Employee.findByEmpNo",
                query="SELECT e FROM Employee e WHERE empNo = :empNo")
@Table(name="employees")
public class Employee {
	
	@Id
	@Column(name="emp_no")
	private long empNo;

	@Column(name="first_name")
	@NotNull
	@Size(min=2, max=15)
	private String firstName;

	@Column(name="last_name")
	@NotNull
	@Size(min=2, max=15)
	private String lastName;

	@Column(name="gender", length=1)
	@NotNull
	private String gender;
	
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="birth_date")
	@NotNull @Past
	private LocalDate birthDate;
    
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="hire_date")
	@NotNull
	private LocalDate hireDate;
	

	public long getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
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

	public LocalDate getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString(){
	return "Employee No="+empNo+", First Name="+firstName+", Last Name="+lastName+", Birth Date="+birthDate+", Gender="+gender+", Hire Date="+hireDate;
	}
	
}
