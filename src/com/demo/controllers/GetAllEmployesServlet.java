package com.demo.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Employ;
import com.demo.employimpl.AddEmployImpl;
import com.demo.iemploy.Employee;

/**
 * Servlet implementation class GetAllEmployesServlet
 */
@WebServlet("/GetAllEmployesServlet")
public class GetAllEmployesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllEmployesServlet() {
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
		String empId=request.getParameter("empid");
		
		Employee obj=new AddEmployImpl();   //Object done 
		
		try {
			List<Employ> objs=obj.getEmployees();
			
			request.setAttribute("employobj", objs);
			
			request.getRequestDispatcher("./show.jsp").forward(request, response);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
