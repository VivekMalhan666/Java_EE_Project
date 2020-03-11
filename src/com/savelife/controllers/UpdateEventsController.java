package com.savelife.controllers;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.savelife.daos.LoginDao;
import com.savelife.daosimpl.LoginDaoImpl;
import com.savelife.models.Events;

@WebServlet("/updateEvent")

public class UpdateEventsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        //PrintWriter out= response.getWriter();
        int id=Integer.parseInt(request.getParameter("eventid"));

	    LoginDao loginDao=new LoginDaoImpl();
		Events event=loginDao.getEventById(id);



		request.setAttribute("eventObj",event);
		RequestDispatcher rd=request.getRequestDispatcher("UpdateEventsForm.jsp");
		rd.forward(request, response);

		}}
