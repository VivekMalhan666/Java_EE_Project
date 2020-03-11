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


@WebServlet("/changePassword")
public class UserChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		User u=(User)session.getAttribute("user");
		String s1=request.getParameter("newpwd");
		String s2=request.getParameter("confirmpwd");
		if(s1.equals(s2)){
			UserDao cp=new UserDaoImpl();
			boolean obj=cp.changePassword(u.getEmailId(),s1,s2);
			 if(obj==true)
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
					request.setAttribute("errorMsg","success");
					rd.forward(request, response);
				}
			 else{
				 RequestDispatcher rd=request.getRequestDispatcher("UserChangePassword.jsp");
					request.setAttribute("errorMsg","failed in updating Password");
					rd.forward(request, response);
				 
			 }
			
			
			
			
		}
	}

}
