package com.demo.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.employimpl.AddEmployImpl;
import com.demo.iemploy.Employee;

/**
 * Servlet implementation class EmployIdExistServlet
 */
@WebServlet("/EmployIdExistServlet")
public class EmployIdExistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployIdExistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		boolean flag=false;
		String msg="";
		String empId=request.getParameter("id");
		
		System.out.println("EmpId getting ...."+empId);
		
		Employee obj=new AddEmployImpl();   //Object done 
		
		boolean b=obj.isExistEmpId(empId);
		
		if(b) {
			
			System.out.println("Inside if condition ********");
			msg=empId  +  " Number AlreadyExist Please Try With Another ";
			flag=true;
			
		}else {
			flag=false;
			
		}
		response.getWriter().write(msg);
	}

}
