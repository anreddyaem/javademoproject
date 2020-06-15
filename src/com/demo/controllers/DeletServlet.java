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
 * Servlet implementation class DeletServlet
 */
@WebServlet("/DeletServlet")
public class DeletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletServlet() {
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
		
		String empId=request.getParameter("empId");
		
		
		Employee obj=new AddEmployImpl();   //Object done 
		
		
		try {
			;
			boolean b=obj.delete(empId);
			if(b) {
				System.out.println("Deleted ...Sucess");
			}else {
				System.out.println("Delete Operation Fail..");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
