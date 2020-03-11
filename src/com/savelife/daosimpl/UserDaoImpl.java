package com.savelife.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.savelife.daosimpl.*;
import com.savelife.daos.*;
import com.savelife.models.Child;
import com.savelife.models.Donate;
import com.savelife.models.Sponsor;
import com.savelife.models.User;
import com.savelife.utility.ConnectionProvider;


public class UserDaoImpl implements UserDao {

	
	public boolean register(User userobj) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into User_Table values(?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, userobj.getFirstName());
			ps.setString(2,userobj.getLastName());
			ps.setString(3,userobj.getEmailId());
			ps.setString(4,userobj.getPassword());
		    ps.setString(5,userobj.getAddress());
		    ps.setString(6,userobj.getPinCode());
			ps.setString(7,userobj.getCity());
			ps.setString(8,userobj.getState());
			ps.setString(9,userobj.getMobileNo());
			ps.setString(10,userobj.getGender());
			
			PreparedStatement ps1=conn.prepareStatement("insert into Login_Tab values(?,?,'user')");
			ps1.setString(1,userobj.getEmailId());
			ps1.setString(2,userobj.getPassword());
			
			int i =ps.executeUpdate();
			if(i!=0){
				
			}
			 ps1.executeUpdate();
			 return true;
		
		}
	

	        catch (Exception e) {
		      e.printStackTrace();
		      }
	
	        return false;
	}

	@Override
	public User getUser(String email) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select* from User_Table where email=?");
			ps.setString(1,email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String fname=rs.getString(1);
				String lname=rs.getString(2);
			    String em=rs.getString(3);
			    String pa=rs.getString(4);
				String addr=rs.getString(5);
				String pin=rs.getString(6);
                String cit=rs.getString(7);
                String stat=rs.getString(8);
                String mob=rs.getString(9);
                String gen=rs.getString(10);
                
                User u=new User();
				u.setFirstName(fname);
				u.setLastName(lname);
				u.setEmailId(em);
				u.setPassword(pa);
			    u.setAddress(addr);
				u.setPinCode(pin);
				u.setCity(cit);
				u.setState(stat);
				u.setMobileNo(mob);
				u.setGender(gen);
				return u;
				}
			

			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
	

	@Override
	public boolean updateUser(User userobj) {
		try {
		Connection conn=ConnectionProvider.getConnection();
		PreparedStatement ps=conn.prepareStatement("Update User_Table set firstname=?,lastname=?, address=?,pincode=?,city=?,state=?,mobileno=?,gender=? where email=?");
		
		ps.setString(1,userobj.getFirstName());
		ps.setString(2,userobj.getLastName());
		ps.setString(3,userobj.getAddress());
		ps.setString(4,userobj.getPinCode());
		ps.setString(5,userobj.getCity());
		ps.setString(6,userobj.getState());
		ps.setString(7,userobj.getMobileNo());
		ps.setString(8,userobj.getGender());
		ps.setString(9,userobj.getEmailId());
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		else {
			return false;
		}
		}
		catch(Exception e){
			e.printStackTrace();
	}
		return false;
	}

	

	@Override
	public boolean changePassword(String email, String newPassword,String confirmPassword) {
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
	public User validateUser(String email, String pass) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from User_Table where email=? and password=?");
			ps.setString(1,email);
			ps.setString(2,pass);

			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String fname=rs.getString(1);
				String lname=rs.getString(2);
				String em=rs.getString(3);
				String pa=rs.getString(4);
				String addr=rs.getString(5);
				String pin=rs.getString(6);
                String cit=rs.getString(7);
                String stat=rs.getString(8);
                String mob=rs.getString(9);
                String gen=rs.getString(10);

				
				User obj=new User();
				obj.setFirstName(fname);
				obj.setLastName(lname);
				obj.setEmailId(em);
				obj.setPassword(pa);
				obj.setAddress(addr);
				obj.setPinCode(pin);
				obj.setCity(cit);
				obj.setState(stat);
				obj.setMobileNo(mob);
				obj.setGender(gen);
				

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
	public boolean donate(Donate donateobj) {
		try{
			Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps=conn.prepareStatement("insert into Donate_Table values(?,?,?,?,?,?)");
			ps.setString(1,donateobj.getChildId());
			ps.setString(2,donateobj.getUserEmail());
			ps.setInt(3,donateobj.getAmount());
			ps.setInt(4,donateobj.getChequeDdNumber());
			ps.setString(5,donateobj.getBankName());
			ps.setString(6,donateobj.getBranchName());
			int i=ps.executeUpdate();
			if(i!=0)
				return true;
			
			
		}
			catch(Exception e){
				e.printStackTrace();
		}
			return false;
		}

	@Override
	public boolean sponsor(Sponsor sponsorobj) {
		try{
			Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps=conn.prepareStatement("insert into Sponsor_Table values(?,?,?,?,?,?,?)");
			ps.setString(1,sponsorobj.getChildId());
			ps.setString(2,sponsorobj.getUserEmail());
			ps.setString(3,sponsorobj.getSponsorType());
			ps.setInt(4,sponsorobj.getAmount());
			ps.setInt(5,sponsorobj.getChequeDdNumber());
			ps.setString(6,sponsorobj.getBankName());
			ps.setString(7,sponsorobj.getBranchName());
			int i=ps.executeUpdate();
			if(i!=0){
				ChildDao childDao=new ChildDaoImpl();
				Child childObj=childDao.getChildById(Integer.parseInt(sponsorobj.getChildId()));
				childObj.setSponsored("yes");
				childDao.updateChild(childObj);
				return true;
			}
		}
			catch(Exception e){
				e.printStackTrace();
		
			return false;
		}
		return false;

	}

	@Override
	public String getsponsorerUserById(int childId) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select useremail from Sponsor_Table where childid=?");
			ps.setInt(1,childId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String email=rs.getString(1);
				return email;
				}
			

			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
	}



	


		  