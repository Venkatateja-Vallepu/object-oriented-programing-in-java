package com.cashapona.oops.may31;
class Employee{
	private int employeeId;
	private String employeeName;
	private double employeeSalarey;
	private String employeeAddress;
	private int employeeAge;
	private int employeeExperience;
	private String employeeRole;
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
	public double getEmployeeSalarey() {
		return employeeSalarey;
	}
	public void setEmployeeSalarey(double employeeSalarey) {
		this.employeeSalarey = employeeSalarey;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
}
public class Encapsulation {
	public static void main(String[]args){
	Employee e=new Employee();
	e.setEmployeeId(1);
	e.setEmployeeName("venkat");
	e.setEmployeeSalarey(16600.0);
	e.setEmployeeAddress("bheemavram");
	e.setEmployeeAge(23);
	e.setEmployeeExperience(1);
	e.setEmployeeRole("javaDeveloper");
	System.out.println(e.getEmployeeId());
	System.out.println(e.getEmployeeName());
	System.out.println(e.getEmployeeSalarey());
	System.out.println(e.getEmployeeAddress());
	System.out.println(e.getEmployeeAge());
	System.out.println(e.getEmployeeExperience());
	System.out.println(e.getEmployeeRole());
}}