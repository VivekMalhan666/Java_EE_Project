package com.savelife.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.savelife.daos.VolunteerDao;

import com.savelife.daosimpl.VolunteerDaoImpl;


@WebServlet("/AdminViewActiveVolunteer")
public class AdminViewActiveVolunteerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		VolunteerDao daoObj=new VolunteerDaoImpl();
		List<com.savelife.models.Volunteer> volunteerList=daoObj.getActiveVolunteer();

		request.setAttribute("vList",volunteerList);
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewActiveVolunteer.jsp");
		rd.forward(request, response);


	}
	}

	


