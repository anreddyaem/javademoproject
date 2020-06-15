package com.demo.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.demo.bean.Employ;
import com.demo.employimpl.AddEmployImpl;
import com.demo.iemploy.Employee;

/**
 * Servlet implementation class RegistrationAjaxServlet
 */
@WebServlet("/RegistrationAjaxServlet")
public class RegistrationAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger LOGGER = Logger.getLogger(RegistrationAjaxServlet.class);  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationAjaxServlet() {
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
		LOGGER.info("do Post RegisterServlet Started");
		
		String empId=request.getParameter("empid");
		String empName=request.getParameter("empname");
		String empSal=request.getParameter("empsal");
		String empAddrs=request.getParameter("empaddr");
		
		System.out.println("Employeid"+empId);
		System.out.println("EmployeName"+empName);
		System.out.println("EmployeSal"+empSal);
		System.out.println("EmployeAddres"+empAddrs);
		
		Employee obj=new AddEmployImpl();   //Object done 
	
		Employ em=new Employ();
		em.setEmpId(empId);
		em.setEmpName(empName);
		em.setEmpSalary(empSal);
		em.setEmpAdrrs(empAddrs);
		boolean b=obj.addEmployees(em);
		if(b) {

			request.getRequestDispatcher("./RegThankyou.jsp").forward(request, response);
			//do something
		}else {
			
			request.getRequestDispatcher("./RegFail.jsp").forward(request, response);
			
			//do something
		}
		
		//response.getWriter().print(b);
		
	}

}
