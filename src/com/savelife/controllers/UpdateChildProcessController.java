package com.savelife.controllers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

import com.savelife.daos.ChildDao;
import com.savelife.daosimpl.ChildDaoImpl;
import com.savelife.models.Child;


@WebServlet("/updateChildProcess")
@MultipartConfig(maxFileSize = 16177215)
public class UpdateChildProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("ChildId"));
		String name=request.getParameter("ChildName");
		String a=request.getParameter("age");
		String gen=request.getParameter("gender");
		String edu=request.getParameter("education");
		String bg=request.getParameter("bloodgroup");
		String mp=request.getParameter("medicalPresc");
		String im=request.getParameter("identificationMark");
		String sb=request.getParameter("storyBehind");
		String s=request.getParameter("sponsored");
		Part filePart=request.getPart("photo");	
		

		Child childObj=new Child();
		childObj.setChildId(id);
		childObj.setChildName(name);
		childObj.setAge(a);
		childObj.setGender(gen);
		childObj.setEducation(edu);
		childObj.setBloodGroup(bg);
		childObj.setMedicalPresc(mp);
		childObj.setIdentificationMark(im);
		childObj.setStoryBehind(sb);
		childObj.setSponsored(s);
		childObj.setPhoto(filePart.getSubmittedFileName());
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
		

		ChildDao daoObj=new ChildDaoImpl();
		boolean r=daoObj.updateChild(childObj);
		if(r){
			List<Child> childrenList=daoObj.getAllChildren();

			request.setAttribute("cList",childrenList);

			request.setAttribute("msg","Details of Child Updated Succesfully");
			RequestDispatcher rd=request.getRequestDispatcher("AdminViewChildren.jsp");
			rd.forward(request, response);
		}
		else {

		}


	}
	}


