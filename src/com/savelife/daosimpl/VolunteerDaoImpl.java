package com.savelife.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.ArrayList;
import java.util.List;

import com.savelife.daos.VolunteerDao;
import com.savelife.models.Child;
import com.savelife.models.Volunteer;
import com.savelife.utility.ConnectionProvider;

public class VolunteerDaoImpl implements VolunteerDao{

	@Override
	public boolean register(Volunteer VolunteerObj) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Volunteer_Table values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, VolunteerObj.getName());
			ps.setString(2,VolunteerObj.getEmailId());
			ps.setString(3,VolunteerObj.getPassword());
		    ps.setString(4,VolunteerObj.getAddress());
		    ps.setString(5,VolunteerObj.getCity());
			ps.setString(6,VolunteerObj.getState());
			ps.setString(7,VolunteerObj.getMobileNo());
			ps.setString(8,VolunteerObj.getGender());
			ps.setString(9,VolunteerObj.getQualification());
		    ps.setString(10,VolunteerObj.getJobPost());
		    ps.setString(11,VolunteerObj.getPhoto()); 
		    ps.setString(12,VolunteerObj.getStatus()); 
					
			PreparedStatement ps1=conn.prepareStatement("insert into Login_Tab values(?,?,'volunteer')");
			ps1.setString(1,VolunteerObj.getEmailId());
			ps1.setString(2,VolunteerObj.getPassword());
			
			int i =ps.executeUpdate();
			if(i!=0){
				ps1.executeUpdate();
				return true;
				
				 	
			}
			 
		
	}
		 catch (Exception e) {
		      e.printStackTrace();
		      }
	
	        return false;
	}

	@Override
	public Volunteer getVolunteer(String email) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select* from Volunteer_Table where email=?");
			ps.setString(1,email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String name=rs.getString(1);
				String em=rs.getString(2);
			    String pa=rs.getString(3);
				String addr=rs.getString(4);
                String cit=rs.getString(5);
                String stat=rs.getString(6);
                String mob=rs.getString(7);
                String gen=rs.getString(8);
                String q=rs.getString(9);
                String jp=rs.getString(10);
                String photo=rs.getString(11);
                
                Volunteer v=new Volunteer();
				v.setName(name);
				v.setEmailId(em);
				v.setPassword(pa);
			    v.setAddress(addr);
			    v.setCity(cit);
				v.setState(stat);
			    v.setMobileNo(mob);
			    v.setGender(gen);
				v.setQualification(q);
				v.setJobPost(jp);
				v.setPhoto(photo);
				return v;
				}
			

			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean updateVolunteer(Volunteer VolunteerObj) {
		
		
		String img=VolunteerObj.getPhoto();
		
		try {
			Connection conn=ConnectionProvider.getConnection();
			if(img.length()!=0){
				
				
			PreparedStatement ps=conn.prepareStatement("Update Volunteer_Table set name=?, address=?,city=?,state=?,mobileno=?,gender=?,qualification=?,jobpost=?,photo=? where email=?");
			
			ps.setString(1,VolunteerObj.getName());
			ps.setString(2,VolunteerObj.getAddress());
		    ps.setString(3,VolunteerObj.getCity());
			ps.setString(4,VolunteerObj.getState());
			ps.setString(5,VolunteerObj.getMobileNo());
			ps.setString(6,VolunteerObj.getGender());
			ps.setString(7,VolunteerObj.getQualification());
			ps.setString(8,VolunteerObj.getJobPost());
			ps.setString(9,VolunteerObj.getPhoto());
		    ps.setString(10,VolunteerObj.getEmailId());
			
			int i=ps.executeUpdate();
			if(i!=0)
				return true;
			}
		
			else if(img.length()==0){
				

				
				PreparedStatement ps=conn.prepareStatement("Update Volunteer_Table set name=?, address=?,city=?,state=?,mobileno=?,gender=?,qualification=?,jobpost=? where email=?");
				
				ps.setString(1,VolunteerObj.getName());
				ps.setString(2,VolunteerObj.getAddress());
			    ps.setString(3,VolunteerObj.getCity());
				ps.setString(4,VolunteerObj.getState());
				ps.setString(5,VolunteerObj.getMobileNo());
				ps.setString(6,VolunteerObj.getGender());
				ps.setString(7,VolunteerObj.getQualification());
				ps.setString(8,VolunteerObj.getJobPost());
			     ps.setString(9,VolunteerObj.getEmailId());
				
				int i=ps.executeUpdate();
				if(i!=0)
					return true;
			}
		}
			
			
			
			catch(Exception e){
				e.printStackTrace();
		}
			return false;
	
	}

	@Override
	public Volunteer validateVolunteer(String email, String pass) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Volunteer_Table where email=? and password=?");
			ps.setString(1,email);
			ps.setString(2,pass);

			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String name=rs.getString(1);
		        String em=rs.getString(2);
				String pa=rs.getString(3);
				String addr=rs.getString(4);
				String cit=rs.getString(5);
                String stat=rs.getString(6);
                String mob=rs.getString(7);
                String gen=rs.getString(8);
                String q=rs.getString(9);
                String jp=rs.getString(10);
                String photo=rs.getString(11);
				
				Volunteer obj=new Volunteer();
				obj.setName(name);
			    obj.setEmailId(em);
				obj.setPassword(pa);
				obj.setAddress(addr);
			    obj.setCity(cit);
				obj.setState(stat);
				obj.setMobileNo(mob);
				obj.setGender(gen);
				obj.setQualification(q);
				obj.setJobPost(jp);
				obj.setPhoto(photo);

				return obj;
			}
			else {
				return null;
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}

		return null;
	
	}
	

	@Override
	public boolean changePassword(String email, String newPassword,
			String confirmPassword) {
		try{
			Connection conn=ConnectionProvider.getConnection();
			
	        PreparedStatement ps=conn.prepareStatement("update Login_Tab set password=? where login_id=?");
	        ps.setString(2,email);
	        ps.setString(1,newPassword);
			
			
		
			int i =ps.executeUpdate();
			if(i!=0){
				
			return true;
		}
		else{
			
			return false;
		}
	}
              catch (Exception e) {
		      e.printStackTrace();
		      }
	
	        return false;
	
	}

	@Override
	public List<Volunteer> getAllVolunteer() {
		List<Volunteer> volunteer=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Volunteer_Table");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				String name=rs.getString(1);
				String email=rs.getString(2);
				String add=rs.getString(4);
				String cit=rs.getString(5);
				String state=rs.getString(6);
				String mobno=rs.getString(7);
				String gen=rs.getString(8);
				String qua=rs.getString(9);
				String jp=rs.getString(10);
				String photo=rs.getString(11);
				

				Volunteer vObj=new Volunteer();
				
				vObj.setName(name);
                vObj.setEmailId(email);
				vObj.setAddress(add);
				vObj.setCity(cit);
				vObj.setState(state);
				vObj.setMobileNo(mobno);
				vObj.setGender(gen);
				vObj.setQualification(qua);
				vObj.setJobPost(jp);
				vObj.setPhoto(photo);
				
				
				volunteer.add(vObj);
				
				
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
	
	return volunteer;
	}

	

	@Override
	public List<Volunteer> getActiveVolunteer() {
		
		List<Volunteer> volunteer=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Volunteer_Table where status=?");
			ps.setString(1,"active");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				String name=rs.getString(1);
				String email=rs.getString(2);
				String add=rs.getString(4);
				String cit=rs.getString(5);
				String state=rs.getString(6);
				String mobno=rs.getString(7);
				String gen=rs.getString(8);
				String qua=rs.getString(9);
				String jp=rs.getString(10);
				String photo=rs.getString(11);
				String status=rs.getString(12);
				

				Volunteer vObj=new Volunteer();
				
				vObj.setName(name);
                vObj.setEmailId(email);
				vObj.setAddress(add);
				vObj.setCity(cit);
				vObj.setState(state);
				vObj.setMobileNo(mobno);
				vObj.setGender(gen);
				vObj.setQualification(qua);
				vObj.setJobPost(jp);
				vObj.setPhoto(photo);
				vObj.setStatus(status);
				
				volunteer.add(vObj);
				
				
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
	
	return volunteer;
	}

	@Override
	public boolean rejectVolunteer(String email) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("update Volunteer_Table set status=? where email=?");
			ps.setString(1,"reject");
			ps.setString(2,email);
			int i=ps.executeUpdate();
			if(i!=0)return true;
		}catch(Exception e){
				e.printStackTrace();
			}
	return false;
	}

	@Override
	public List<Volunteer> getRejectedVolunteer() {
		List<Volunteer> volunteer=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Volunteer_Table where status=?");
			ps.setString(1,"reject");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				String name=rs.getString(1);
				String email=rs.getString(2);
				String add=rs.getString(4);
				String cit=rs.getString(5);
				String state=rs.getString(6);
				String mobno=rs.getString(7);
				String gen=rs.getString(8);
				String qua=rs.getString(9);
				String jp=rs.getString(10);
				String photo=rs.getString(11);
				String status=rs.getString(12);
				

				Volunteer vObj=new Volunteer();
				
				vObj.setName(name);
                vObj.setEmailId(email);
				vObj.setAddress(add);
				vObj.setCity(cit);
				vObj.setState(state);
				vObj.setMobileNo(mobno);
				vObj.setGender(gen);
				vObj.setQualification(qua);
				vObj.setJobPost(jp);
				vObj.setPhoto(photo);
				vObj.setStatus(status);
				
				volunteer.add(vObj);
				
				
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
	
	return volunteer;
	}

	

	

	@Override
	public boolean volunteerRejection(String email, String reason) {
		try {
			
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Volunteer_Rejection values (?,?)");
			ps.setString(1,email);
			ps.setString(2,reason);
			int i=ps.executeUpdate();
			if(i!=0)
	           return true;
		}
		
			 catch (Exception e) {
			      e.printStackTrace();
			      }
		
		        return false;
		}
		}
			
		
		
	

	
	

