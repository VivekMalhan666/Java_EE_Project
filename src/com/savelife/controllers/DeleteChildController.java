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


@WebServlet("/deleteChild")
public class DeleteChildController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("ChildId"));

		ChildDao childDao=new ChildDaoImpl();
		boolean r=childDao.deleteChild(id);
		if(r==true){
			request.setAttribute("msg","Details of Child Deleted Succesfully");
		}
		else {
			request.setAttribute("msg","Problem in Deleting Child Details. Try again");
		}
		request.setAttribute("cList",childDao.getAllChildren());
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewChildren.jsp");
		rd.forward(request, response);

		}
	}

	
