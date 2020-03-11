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

import com.savelife.daos.UserDao;
import com.savelife.daosimpl.UserDaoImpl;
import com.savelife.models.User;


@WebServlet("/UpdateUserController")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	String s1=request.getParameter("firstname");
		String s2=request.getParameter("lastname");
		String s3=request.getParameter("email");
		String s4=request.getParameter("address");
		String s5=request.getParameter("PinCode");
		String s6=request.getParameter("City");
		String s7=request.getParameter("State");
		String s8=request.getParameter("mobileno");
		String s9=request.getParameter("gender");
		
		
		User ur=new User();
		ur.setFirstName(s1);
		ur.setLastName(s2);
		ur.setEmailId(s3);
		ur.setAddress(s4);
		ur.setPinCode(s5);
		ur.setCity(s6);
		ur.setState(s7);
		ur.setMobileNo(s8);
    	ur.setGender(s9);

    	UserDao dao=new UserDaoImpl();
    	boolean r=dao.updateUser(ur);
    	if(r){
    		HttpSession session=request.getSession();
    		session.setAttribute("user",ur);
    		request.setAttribute("msg", "User Updated Successfully");
    	
    		RequestDispatcher rd=request.getRequestDispatcher("UserViewProfile.jsp");
    		rd.forward(request, response);
    	}
    	else {
    		RequestDispatcher rd=request.getRequestDispatcher("UserUpdateProfile.jsp");
    		rd.forward(request, response);

    	}

	}

}
