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
import com.savelife.models.Donate;
import com.savelife.models.Sponsor;


@WebServlet("/UserDonateController")
public class UserDonateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
			//PrintWriter out=response.getWriter();

		    UserDao urd=new UserDaoImpl();
			String id=request.getParameter("ChildId");
			String uem=request.getParameter("Useremail");
			int am=Integer.parseInt(request.getParameter("amount"));
			int ch=Integer.parseInt(request.getParameter("cheque"));
			String bankname=request.getParameter("bankname");
			String branchname=request.getParameter("branchname");
			
			Donate donateObj=new Donate();
		    donateObj.setChildId(id);
			donateObj.setUserEmail(uem);
			donateObj.setAmount(am);
			donateObj.setChequeDdNumber(ch);
			donateObj.setBankName(bankname);
			donateObj.setBranchName(branchname);
			
			
			 boolean obj=urd.donate(donateObj);
			 if(obj==false){
				     RequestDispatcher rd=request.getRequestDispatcher("DonationForm.jsp");
				     request.setAttribute("errorMsg","failed");
		    		 rd.forward(request, response);
		   
		    	}
		    	else {
		    		RequestDispatcher rd=request.getRequestDispatcher("UserDonate.jsp");
		    		  request.setAttribute("errorMsg","Successfull");
		    		rd.forward(request, response);
			 
	}			 
	}

}
