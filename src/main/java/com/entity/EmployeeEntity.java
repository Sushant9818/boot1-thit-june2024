package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
private static final boolean True = false;
private int employeeId;
private	String employeeName;
private	String email;
private	String password;
private	int salary;

@Id
@GeneratedValue
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
			+ ", password=" + password + ", salary=" + salary + "]";
}






	
	
	

}
