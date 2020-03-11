package com.savelife.controllers;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.io.PrintWriter;
//import java.util.Date;
//import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

//import java.text.ParseException;

import com.savelife.daos.LoginDao;
import com.savelife.daosimpl.LoginDaoImpl;
import com.savelife.models.Events;


@WebServlet("/eventOrganise")
@MultipartConfig(maxFileSize = 16177215)
public class EventOrganiseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		String name=request.getParameter("eventname");
		String place=request.getParameter("place");
		String dt=request.getParameter("datetime");
	    String duration=request.getParameter("duration");
		String cgname=request.getParameter("chiefguestname");
		String cgprofession=request.getParameter("chiefguestprofession");
		String eventdesc=request.getParameter("eventdesc");
		Part filePart=request.getPart("photo");	
		
		/*converting String into java.util.Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try{
			date=sdf.parse(d);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}*/

		Events eventObj=new Events();
		eventObj.setEventName(name);
		eventObj.setPlace(place);
		eventObj.setDateTime(dt);
		eventObj.setDuration(duration);
		eventObj.setChiefGuestName(cgname);
		eventObj.setChiefGuestProfession(cgprofession);
		eventObj.setEventDesc(eventdesc);
        eventObj.setPhoto(filePart.getSubmittedFileName());
		
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
		
		
		LoginDao daoObj=new LoginDaoImpl();
		boolean r=daoObj.eventsOrganise(eventObj);
		 if(r){
			 List<Events> eventList=daoObj.getAllEvents();
			 request.setAttribute("eList",eventList);
				request.setAttribute("msg","Details of Event Added Succesfully");
				RequestDispatcher rd=request.getRequestDispatcher("AdminViewEvents.jsp");
				rd.forward(request, response);
			}
			else {
				
			}

	 
}


	}
	


