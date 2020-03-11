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

import com.savelife.daos.ChildDao;
import com.savelife.daosimpl.ChildDaoImpl;
import com.savelife.models.Child;


@WebServlet("/Donate")
public class DonateChildController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		HttpSession session=request.getSession();
	
		Object obj=session.getAttribute("user");
		System.out.println("Obj = "+obj);
		
		String r=(String)session.getAttribute("role");
		
		if((obj==null)||(r.equals("Guest")))
		{
			request.setAttribute("msg","You need to Login first and if not registered please Singup first");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		else{
			
		int id=Integer.parseInt(request.getParameter("ChildId"));
	    ChildDao childDao=new ChildDaoImpl();
		Child child=childDao.getChildById(id);

		session.setAttribute("childObj",child);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("Donate.jsp");
		rd.forward(request, response);

		}
	}
}

	
	


