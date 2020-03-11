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
import com.savelife.daosimpl.ChildDaoImpl;
import com.savelife.models.Child;


@WebServlet("/updateChild")
public class UpdateChildController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("ChildId"));

		ChildDao childDao=new ChildDaoImpl();
		Child child=childDao.getChildById(id);



		request.setAttribute("childObj",child);
		RequestDispatcher rd=request.getRequestDispatcher("UpdateChildForm.jsp");
		rd.forward(request, response);

		}
	}

	
	


