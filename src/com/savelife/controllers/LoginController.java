package com.savelife.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.savelife.daos.LoginDao;
import com.savelife.daos.UserDao;
import com.savelife.daos.VolunteerDao;
import com.savelife.daosimpl.LoginDaoImpl;
import com.savelife.daosimpl.UserDaoImpl;
import com.savelife.daosimpl.VolunteerDaoImpl;
import com.savelife.models.Login;
import com.savelife.models.User;
import com.savelife.models.Volunteer;



@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}
	
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out= response.getWriter();
		
		String s1=request.getParameter("email");
		String s2=request.getParameter("pwd");
		
		
		
		LoginDao loginDaoObj=new LoginDaoImpl();
		Login obj=loginDaoObj.validate(s1,s2);
		
		
	    if(obj==null) 
		  {
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			request.setAttribute("errorMsg","Email or Password is incorrect");
			rd.forward(request, response);
		  }
		else {
			String role=obj.getRole();
		    System.out.println("Role = "+role);
		    
			 if(role.equals("admin")) 
				{
				 UserDao userDaoObj =new UserDaoImpl();
	    	     User userobj=userDaoObj.getUser(s1);
	    	     userobj.setRole("admin");
	    	    System.out.println(userobj);
	    	     
	    	     
	    	     HttpSession session=request.getSession();
	    	     session.setAttribute("user",userobj);
	    	     session.setAttribute("role","admin");
		    	RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
				rd.forward(request, response);
				}
		    else
		    	if (role.equals("user")) 
		       {
		    		 UserDao userDaoObj =new UserDaoImpl();
		    	     User userobj=userDaoObj.getUser(s1);
		    	     HttpSession session=request.getSession();
		    	     session.setAttribute("user",userobj);
		    	     session.setAttribute("role","user");
		    	     RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
		    	     rd.forward(request, response);
		       }
	
		    	else if(role.equals("volunteer"))
		    	{
		    		 VolunteerDao volunteerDaoObj=new VolunteerDaoImpl();
		             Volunteer volunteerObj=volunteerDaoObj.getVolunteer(s1);
		             HttpSession session=request.getSession();
		             session.setAttribute("volunteer",volunteerObj);
		             session.setAttribute("role","volunteer");
		             RequestDispatcher rd=request.getRequestDispatcher("VolunteerHome.jsp");
	                
	                 rd.forward(request, response);
		    	}}		
   
   }}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	


