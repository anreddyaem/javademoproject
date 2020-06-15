package com.demo.iemploy;

import java.util.List;

import com.demo.bean.Employ;

public interface Employee {
	
	public boolean addEmployees(Employ emp);
	public List<Employ> getEmployees();
	public boolean updateEmploy(String empId,String empName,String empSal,String empAddrs);	
	public boolean delete(String empId);
	public boolean validateLogin(String id,String name);
	public boolean isExistEmpId(String id);
	

}
