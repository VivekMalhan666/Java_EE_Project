package com.savelife.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.savelife.daos.LoginDao;

import com.savelife.daosimpl.LoginDaoImpl;



@WebServlet("/AdminViewAllEvents")
public class AdminViewAllEventsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		LoginDao daoObj=new LoginDaoImpl();
		List<com.savelife.models.Events> eventList=daoObj.getAllEvents();

		request.setAttribute("eList",eventList);
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewEvents.jsp");
		rd.forward(request, response);


	}
		
	}


