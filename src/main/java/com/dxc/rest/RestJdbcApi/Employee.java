package com.dxc.rest.RestJdbcApi;

public class Employee {
private int empId;
private String employee;
private int age;
private String contact_Number;
private String email;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmployee() {
	return employee;
}
public void setEmployee(String employee) {
	this.employee = employee;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getContact_Number() {
	return contact_Number;
}
public void setContact_Number(String contact_Number) {
	this.contact_Number = contact_Number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", employee=" + employee + ", age=" + age + ", contact_Number=" + contact_Number
			+ ", email=" + email + "]";
}
}
