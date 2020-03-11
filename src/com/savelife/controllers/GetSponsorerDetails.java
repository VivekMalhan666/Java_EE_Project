package com.savelife.controllers;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savelife.daos.ChildDao;
import com.savelife.daos.UserDao;
import com.savelife.daosimpl.ChildDaoImpl;
import com.savelife.daosimpl.UserDaoImpl;

import com.savelife.models.User;


@WebServlet("/getSponsorerDetails")

public class GetSponsorerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		int childId=Integer.parseInt(request.getParameter("childId"));
	
		
		ChildDao daoObj=new ChildDaoImpl();
		UserDao userDao=new UserDaoImpl();
		String email=userDao.getsponsorerUserById(childId);
		
		System.out.println("Email : "+email);
		
		User us=userDao.getUser(email);
		System.out.println("USer object = "+us);
		
		
			request.setAttribute("user",us);
			request.setAttribute("msg","Details of Sponsor");
			RequestDispatcher rd=request.getRequestDispatcher("AdminViewSponsorerDetails.jsp");
			rd.forward(request, response);
		}
		
	}


