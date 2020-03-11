package com.savelife.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.savelife.daos.VolunteerDao;

import com.savelife.daosimpl.VolunteerDaoImpl;


@WebServlet("/RejectedVolunteerController")
public class RejectedVolunteerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		VolunteerDao daoObj=new VolunteerDaoImpl();
		String em=request.getParameter("emailid");
		String reason=request.getParameter("reason");
	
		System.out.println("In controller : "+em+" "+reason);
		
		boolean r=daoObj.rejectVolunteer(em);
		if(r==true){
			boolean s=daoObj.volunteerRejection(em,reason);
			if(s==true){
			request.setAttribute("msg","volunteer Rejected Successfully");
			request.setAttribute("vList",daoObj.getRejectedVolunteer());
			RequestDispatcher rd=request.getRequestDispatcher("AdminViewRejectedVolunteer.jsp");
			rd.forward(request, response);

		}
		}
		    else{
			request.setAttribute("msg","problem in Rejection");

		request.setAttribute("vList",daoObj.getActiveVolunteer());
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewActiveVolunteer.jsp");
		rd.forward(request, response);


	}
	}
}

	


