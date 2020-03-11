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


@WebServlet("/UpdateVolunteerController")
@MultipartConfig(maxFileSize = 16177215)
public class UpdateVolunteerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		String s1=request.getParameter("name");
		String s2=request.getParameter("email");
	    String s3=request.getParameter("address");
		String s4=request.getParameter("City");
		String s5=request.getParameter("State");
		String s6=request.getParameter("mobileno");
		String s7=request.getParameter("gender");
		String s8=request.getParameter("qualification");
		String s9=request.getParameter("jobpost");
		Part filePart=request.getPart("photo");	
		
	   Volunteer v = new Volunteer();
	    v.setName(s1);
	    v.setEmailId(s2);
	    v.setAddress(s3);
	    v.setCity(s4);
	    v.setState(s5);
	    v.setMobileNo(s6);
	    v.setGender(s7);
	    v.setQualification(s8);
	    v.setJobPost(s9);
	    v.setPhoto(filePart.getSubmittedFileName());
		
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
		

	    
	    VolunteerDao dao=new VolunteerDaoImpl();
	   boolean r=dao.updateVolunteer(v);
	 if(r){
 		
		 
 		session.setAttribute("volunteer",dao.getVolunteer(v.getEmailId()));
 		request.setAttribute("msg", "Volunteer Updated Succesfully");
 	
 		RequestDispatcher rd=request.getRequestDispatcher("VolunteerViewProfile.jsp");
 		rd.forward(request, response);
 	}
 	else {
 		RequestDispatcher rd=request.getRequestDispatcher("VolunteerUpdateProfile.jsp");
 		rd.forward(request, response);

 	}

	}
}
