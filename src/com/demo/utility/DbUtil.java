package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;

import com.demo.controllers.RegisterServlet;

public class DbUtil {
	
	static final Logger LOGGER = Logger.getLogger(DbUtil.class);  
	Connection con=null;
	public  Connection getConnection() {
		
		String user="system";
		String pass="admins";
		String driverUrl="jdbc:oracle:thin:@localhost:1521:xe";
		String driverClass="oracle.jdbc.driver.OracleDriver";
		
		
		try {
			Class.forName(driverClass);
		 con=DriverManager.getConnection(driverUrl, user, pass);
		 LOGGER.info("Connectin Estabilished Successfully"+con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
			
		return con;
		
		
		
	}
	

}
