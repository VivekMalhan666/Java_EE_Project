package com.savelife.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savelife.daos.UserDao;
import com.savelife.daosimpl.UserDaoImpl;
import com.savelife.models.User;


@WebServlet("/user")
public class UserRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    response.setContentType("text/html");
	        PrintWriter out= response.getWriter();
			String s1=request.getParameter("firstname");
			String s2=request.getParameter("lastname");
			String s3=request.getParameter("email");
			String s4=request.getParameter("password");
			String s5=request.getParameter("address");
			String s6=request.getParameter("Pincode");
			String s7=request.getParameter("City");
			String s8=request.getParameter("State");
			String s9=request.getParameter("mobileno");
			String s10=request.getParameter("gender");
			
			
		    User ur = new User();
		    ur.setFirstName(s1);
		    ur.setLastName(s2);
		    ur.setEmailId(s3);
		    ur.setPassword(s4);
		    ur.setAddress(s5);
		    ur.setPinCode(s6);
		    ur.setCity(s7);
		    ur.setState(s8);
		    ur.setMobileNo(s9);
		    ur.setGender(s10);
			
			
			
			UserDao urd=new UserDaoImpl();
			 boolean obj=urd.register(ur);
			 if(obj==false){
				     RequestDispatcher rd=request.getRequestDispatcher("User.jsp");
				     request.setAttribute("errorMsg","failed in registering");
		    		 rd.forward(request, response);
		   
		    	}
		    	else {
		    		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		    		  request.setAttribute("errorMsg","Successfully registered");
		    		rd.forward(request, response);
			 
	}			 
			 
}
}

