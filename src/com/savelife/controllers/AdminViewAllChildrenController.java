package com.savelife.controllers;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savelife.daos.ChildDao;
import com.savelife.daosimpl.ChildDaoImpl;



@WebServlet("/AdminViewAllChildren")
public class AdminViewAllChildrenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		ChildDao daoObj=new ChildDaoImpl();
		List<com.savelife.models.Child> childrenList=daoObj.getAllChildren();

		request.setAttribute("cList",childrenList);
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewChildren.jsp");
		rd.forward(request, response);


	}
		
	}


