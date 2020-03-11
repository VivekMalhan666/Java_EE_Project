package com.savelife.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.savelife.daos.UserDao;
import com.savelife.daosimpl.UserDaoImpl;

import com.savelife.models.Sponsor;


@WebServlet("/UserSponsorController")
public class UserSponsorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao daoObj=new UserDaoImpl();
		String s1=request.getParameter("ChildId");
		String s2=request.getParameter("Useremail");
		String s3=request.getParameter("sponsortype");
		
		String s4=request.getParameter("amount");
		String s5=request.getParameter("cheque");
		
		String s6=request.getParameter("bankname");
		String s7=request.getParameter("branchname");
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7);
		
		Sponsor sponsorObj=new Sponsor();
		sponsorObj.setChildId(s1);
		sponsorObj.setUserEmail(s2);
		sponsorObj.setSponsorType(s3);
		sponsorObj.setAmount(Integer.parseInt(s4));
		sponsorObj.setChequeDdNumber(Integer.parseInt(s5));
		sponsorObj.setBankName(s6);
		sponsorObj.setBranchName(s7);
		
		
		
		
		 boolean obj=daoObj.sponsor(sponsorObj);
		 if(obj==false){
			     RequestDispatcher rd=request.getRequestDispatcher("ChildSponsorForm.jsp");
			     request.setAttribute("errorMsg","failed");
	    		 rd.forward(request, response);
	   
	    	}
	    	else {
	    		RequestDispatcher rd=request.getRequestDispatcher("UserSponsor.jsp");
	    		  request.setAttribute("errorMsg","Successfull");
	    		rd.forward(request, response);
		 
}			 
}
	}


