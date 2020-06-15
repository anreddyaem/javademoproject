package com.demo.employimpl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.demo.bean.Employ;
import com.demo.controllers.RegisterServlet;
import com.demo.iemploy.Employee;
import com.demo.utility.DbUtil;

public class AddEmployImpl implements Employee {
	static final Logger LOGGER = Logger.getLogger(AddEmployImpl.class); 
	Connection con=null;
	PreparedStatement preparedStatement=null;
	ResultSet rs=null;
	@Override
	public boolean addEmployees(Employ emp) {
		
		LOGGER.info("addEmployees Called");
		// TODO Auto-generated method stub
		//Query
		//connectioin 
		//preparestatem
		//setting data
		//executeQuery or execute Update
		boolean flag=false;
		String sql="insert into emps values(?,?,?,?)";
		
		DbUtil util=new DbUtil();
		try {
			con=util.getConnection();	
			
			LOGGER.info("Connection Success in AddEmployee Method"+con);
	     
		   preparedStatement=con.prepareStatement(sql);
	       preparedStatement.setString(1, emp.getEmpId());
	       preparedStatement.setString(2, emp.getEmpName());
	       preparedStatement.setString(3, emp.getEmpSalary());
	       preparedStatement.setString(4, emp.getEmpAdrrs());
	       
	      int i= preparedStatement.executeUpdate();
	      
	      if(i==1) {
	    	  flag=true;
	    	 LOGGER.info("Registration  Successfully Completed");
	      }else {
	    	  flag=false;
	    	  LOGGER.info("Registratin Failed ..Try Again");
	      }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			
		}
		
		
		return flag;
	}
	@Override
	public List<Employ> getEmployees() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement preparedStatement=null;
		String sql="select * from emps";
		List<Employ> empList=null;
		DbUtil util=new DbUtil();
		try {
			
			con=util.getConnection();			
			System.out.println("Connection got in Impl class"+con);
	     
			preparedStatement=con.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			empList=new ArrayList<>();
			while (rs.next()) {
				Employ emp=new Employ();
				emp.setEmpId(rs.getString(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSalary(rs.getString(3));
				emp.setEmpAdrrs(rs.getString(4));
				empList.add(emp);
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}	
			
		}
		
		
		
		
		return empList;
	}
	@Override
	public boolean updateEmploy(String empId,String empName,String empSal,String empAddrs) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=null;
		PreparedStatement preparedStatement=null;
		String sql="UPDATE emps SET EMPNAME=?,EMPSAL=?,EMPADS=? WHERE EMPID=?";
		DbUtil util=new DbUtil();
		try {
			con=util.getConnection();			
			
			System.out.println("empId ****impl"+empId);
			System.out.println("empName ****impl"+empName);
			System.out.println("empSal ****impl"+empSal);
			System.out.println("empAddrs ****impl"+empAddrs);
			
			preparedStatement=con.prepareStatement(sql);
		      
		       preparedStatement.setString(1,empName);
		       preparedStatement.setString(2,empSal);
		       preparedStatement.setString(3,empAddrs);
		       preparedStatement.setString(4,empId);
		      int i= preparedStatement.executeUpdate();
		      if(i>0) {
		    	  flag=true;
		    	  System.out.println("One Record Updated Success..");
		      }else {
		    	  flag=false;
		    	  System.out.println("Sorry! unable to update record");
		      }
		       
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
			StringWriter sw=new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			System.out.println("error ----"+sw);
		}finally {
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}	
			
		}
		
		
		
		return flag;
	}
	@Override
	public boolean delete(String empId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=null;
		PreparedStatement preparedStatement=null;
		String sql="DELETE FROM emps WHERE EMPID=?";
		DbUtil util=new DbUtil();
		
		try {
			con=util.getConnection();
			
			preparedStatement=con.prepareStatement(sql);
		       preparedStatement.setString(1,empId );
		      
		      int i= preparedStatement.executeUpdate();
		      if(i==1) {
		    	  flag=true;
		    	  System.out.println("One Record Deleted Success..");
		      }else {
		    	  flag=false;
		    	  System.out.println("Failed Try Again..");
		      }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}		
			
		}
		return flag;
	}
	@Override
	public boolean validateLogin(String id, String name) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=null;
		PreparedStatement preparedStatement=null;
		String sql="select * from emps where EMPID=? and EMPNAME=?";
		ResultSet rs=null;
		DbUtil util=new DbUtil();
		
		
		try {
			
          con=util.getConnection();			 
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,name);
			rs=preparedStatement.executeQuery();
			
			if(rs.next()) {
				
				flag=true;
			}else {
				flag=false;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}		
			
		}
		return flag;
	}
	@Override
	public boolean isExistEmpId(String id) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		Connection con=null;
		PreparedStatement preparedStatement=null;
		String sql="select * from emps where EMPID=?";
		ResultSet rs=null;
		DbUtil util=new DbUtil();
		
		try {
			  con=util.getConnection();			 
				preparedStatement=con.prepareStatement(sql);
				preparedStatement.setString(1,id);
				rs=preparedStatement.executeQuery();
				
				if(rs.next()) {
					
					flag=true;
				}else {
					flag=false;
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(con !=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}		
			
		}
		return flag;
	}

}
