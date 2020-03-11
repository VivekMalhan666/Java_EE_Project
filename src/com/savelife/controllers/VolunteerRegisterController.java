package com.savelife.controllers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.savelife.daos.VolunteerDao;
import com.savelife.daosimpl.VolunteerDaoImpl;
import com.savelife.models.Volunteer;


@WebServlet("/VolunteerRegisterController")
@MultipartConfig(maxFileSize = 16177215)
public class VolunteerRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out= response.getWriter();
			String s1=request.getParameter("name");
			String s2=request.getParameter("email");
			String s3=request.getParameter("password");
			String s4=request.getParameter("address");
			String s5=request.getParameter("City");
			String s6=request.getParameter("State");
			String s7=request.getParameter("mobileno");
			String s8=request.getParameter("gender");
			String s9=request.getParameter("qualification");
			String s10=request.getParameter("jobpost");
			Part filePart=request.getPart("photo");	
			
		   Volunteer ur = new Volunteer();
		    ur.setName(s1);
		    ur.setEmailId(s2);
		    ur.setPassword(s3);
		    ur.setAddress(s4);
		    ur.setCity(s5);
		    ur.setState(s6);
		    ur.setMobileNo(s7);
		    ur.setGender(s8);
		    ur.setQualification(s9);
		    ur.setJobPost(s10);
		    ur.setStatus("active");
		    ur.setPhoto(filePart.getSubmittedFileName());
			String fileName=filePart.getSubmittedFileName();
			System.out.println("File Name : "+fileName);

			HttpSession session=request.getSession();
			String serverLocation=session.getServletContext().getRealPath("/");
			System.out.println(serverLocation);

			String filePath=serverLocation+"\\images";
			System.out.println("filePath : "+filePath);

			File fileObj=new File(filePath);
			if(!fileObj.exists()){
				fileObj.createNewFile();
			}

			InputStream is=filePart.getInputStream();
			BufferedInputStream bis=new BufferedInputStream(is);

			FileOutputStream fos=new FileOutputStream(filePath+"/"+fileName+".jpg");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			int ch;
			while((ch=bis.read())!=-1){
				bos.write(ch);
			}

			bos.close();
			fos.close();
			

			
			VolunteerDao urd=new VolunteerDaoImpl();
			 boolean obj=urd.register(ur);
			 if(obj==false){
				     RequestDispatcher rd=request.getRequestDispatcher("Volunteer.jsp");
				     request.setAttribute("errorMsg","failed");
		    		 rd.forward(request, response);
		   
		    	}
		    	else {
		    		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		    		  request.setAttribute("errorMsg","Successfull");
		    		rd.forward(request, response);
			 
	}			 
			 
}
	}


