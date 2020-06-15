package com.demo.bean;

public class Employ {
	
	//alt shift s r  //settrs getts
	//alt shift s s to string
	private String empId;
	private String empName;
	private String empSalary;
	private String empAdrrs;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAdrrs() {
		return empAdrrs;
	}
	public void setEmpAdrrs(String empAdrrs) {
		this.empAdrrs = empAdrrs;
	}
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAdrrs=" + empAdrrs
				+ "]";
	}
	
	
	
	

}
