package com.savelife.controllers;


import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.savelife.daos.FeedbackDao;
import com.savelife.daosimpl.FeedbackDaoImpl;
import com.savelife.models.Feedback;


@WebServlet("/feedbackController")

public class FeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		String name=request.getParameter("name");
		String em=request.getParameter("email");
		String mobileno=request.getParameter("mobileno");
		String feed=request.getParameter("feedback");
		

		Feedback feedObj=new Feedback();
		feedObj.setName(name);
		feedObj.setEmail(em);
		feedObj.setMobileNo(mobileno);
		feedObj.setFeedback(feed);
		
		FeedbackDao daoObj=new FeedbackDaoImpl();
		boolean obj=daoObj.feedback(feedObj);
		if(obj==false){
			     RequestDispatcher rd=request.getRequestDispatcher("ContactUs.jsp");
			     request.setAttribute("errorMsg","failed in sending feedback");
	    		 rd.forward(request, response);
	   
	    	}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("ContactUs.jsp");
  		  request.setAttribute("errorMsg","thankyou for giving us the feedback");
  		rd.forward(request, response);
		}


	}
	}


