package com.savelife.daosimpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.savelife.daos.LoginDao;

import com.savelife.models.Events;
import com.savelife.models.Login;
import com.savelife.utility.ConnectionProvider;



public class LoginDaoImpl implements LoginDao {
	public Login validate(String loginId, String pass) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Login_Tab where login_id=? and password=?");
			ps.setString(1,loginId);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				
				Login obj=new Login();
				obj.setLoginId(s1);
				obj.setPassword(s2);
				obj.setRole(s3);
				
				System.out.println(obj.getLoginId()+"  "+obj.getPassword()+" "+obj.getRole());
				 
				return obj;
				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean eventsOrganise(Events eventObj) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Events_Table values(eventseq.nextval,?,?,?,?,?,?,?,?)");
			ps.setString(1,eventObj.getEventName());
			ps.setString(2,eventObj.getPlace());
			ps.setString(3,eventObj.getDateTime());
			ps.setString(4,eventObj.getDuration());
			ps.setString(5,eventObj.getChiefGuestName());
			ps.setString(6,eventObj.getChiefGuestProfession());
			ps.setString(7,eventObj.getEventDesc());
			ps.setString(8,eventObj.getPhoto());
			
			/*Converting java.util.Date into java.sql.Date
			Date date=(Date) eventObj.getDate();
			long l=date.getTime();
			java.sql.Date d=new java.sql.Date(l);
			ps.setDate(3,d);*/
			
			
			
			
			int i=ps.executeUpdate();
			if(i!=0){
				return true;
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public List<Events> getAllEvents() {
		List<Events> event=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Events_Table");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String place=rs.getString(3);
				String dt=rs.getString(4);
				String duration=rs.getString(5);
				String cgname=rs.getString(6);
				String cgprofession=rs.getString(7);
				String eventdesc=rs.getString(8);
				String p=rs.getString(9);
				
				Events eventObj=new Events();
				eventObj.setEventId(id);
				 eventObj.setEventName(name);
				 eventObj.setPlace(place);
				 eventObj.setDateTime(dt);
				  eventObj.setDuration(duration);
				 eventObj.setChiefGuestName(cgname);
				 eventObj.setChiefGuestProfession(cgprofession);
				 eventObj.setEventDesc(eventdesc);
				 eventObj.setPhoto(p);
				 
				event.add(eventObj);

			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return event;
	}

	@Override
	public boolean updateEvent(Events eventObj) {
     String img=eventObj.getPhoto();
		
		try {
			Connection conn=ConnectionProvider.getConnection();
			if(img.length()!=0){
			PreparedStatement ps=conn.prepareStatement
					("update Events_Table set eventname=?,place=?, date_time=?,duration=?, chiefguestname=?,chiefguestprofession=?,eventdesc=?,photo=? where eventid=?");
			ps.setString(1,eventObj.getEventName());
			ps.setString(2,eventObj.getPlace());
			ps.setString(3,eventObj.getDateTime());
			ps.setString(4,eventObj.getDuration());
			ps.setString(5,eventObj.getChiefGuestName());
			ps.setString(6,eventObj.getChiefGuestProfession());
			ps.setString(7,eventObj.getEventDesc());
			ps.setString(8,eventObj.getPhoto());
			ps.setInt(9,eventObj.getEventId());
			
			int i=ps.executeUpdate();
			if(i!=0)return true;
			}
			else if(img.length()==0){
				PreparedStatement ps=conn.prepareStatement
						("update Events_Table set eventname=? ,place=?, date_time=?,duration=?, chiefguestname=?,chiefguestprofession=?,eventdesc=? where eventid=?");
				ps.setString(1,eventObj.getEventName());
				ps.setString(2,eventObj.getPlace());
				ps.setString(3,eventObj.getDateTime());
				ps.setString(4,eventObj.getDuration());
				ps.setString(5,eventObj.getChiefGuestName());
				ps.setString(6,eventObj.getChiefGuestProfession());
				ps.setString(7,eventObj.getEventDesc());
				ps.setInt(8,eventObj.getEventId());
				int i=ps.executeUpdate();
				if(i!=0)return true;
			}}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public Events getEventById(int eventId) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Events_Table where eventid=?");
			ps.setInt(1,eventId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String place=rs.getString(3);
				String dt=rs.getString(4);
				String duration=rs.getString(5);
				String cgname=rs.getString(6);
				String cgprofession=rs.getString(7);
				String eventdesc=rs.getString(8);
			    String p=rs.getString(9);

				Events eventObj=new Events();
				eventObj.setEventId(id);
				 eventObj.setEventName(name);
				 eventObj.setPlace(place);
				 eventObj.setDateTime(dt);
				  eventObj.setDuration(duration);
				 eventObj.setChiefGuestName(cgname);
				 eventObj.setChiefGuestProfession(cgprofession);
				 eventObj.setEventDesc(eventdesc);
				 eventObj.setPhoto(p);
				return eventObj;
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
		
		
	}
		
	}
	

