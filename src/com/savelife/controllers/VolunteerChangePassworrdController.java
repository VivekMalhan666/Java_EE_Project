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


import com.savelife.daos.VolunteerDao;

import com.savelife.daosimpl.VolunteerDaoImpl;

import com.savelife.models.Volunteer;


@WebServlet("/VolunteerChangePasswordController")
public class VolunteerChangePassworrdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Volunteer v=(Volunteer)session.getAttribute("volunteer");
		String s1=request.getParameter("newpwd");
		String s2=request.getParameter("confirmpwd");
		if(s1.equals(s2)){
			VolunteerDao cp=new VolunteerDaoImpl();
			boolean obj=cp.changePassword(v.getEmailId(),s1,s2);
			 if(obj==true)
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("VolunteerHome.jsp");
					request.setAttribute("errorMsg","success");
					rd.forward(request, response);
				}
			 else{
				 RequestDispatcher rd=request.getRequestDispatcher("VolunteerChangePassword.jsp");
					request.setAttribute("errorMsg","failed in updating Password");
					rd.forward(request, response);
				 
			 }
			
			
	}}}


