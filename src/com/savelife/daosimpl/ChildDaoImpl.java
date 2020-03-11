package com.savelife.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.savelife.daos.ChildDao;
import com.savelife.models.Child;

import com.savelife.utility.ConnectionProvider;

public class ChildDaoImpl implements ChildDao {

	@Override
	public boolean addChild(Child childObj) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Child_Table values(childseq.nextval,?,?,?,?,?,?,?,?,'no',?)");
			ps.setString(1,childObj.getChildName());
			ps.setString(2,childObj.getAge());
			ps.setString(3,childObj.getGender());
			ps.setString(4,childObj.getEducation());
			ps.setString(5,childObj.getBloodGroup());
			ps.setString(6,childObj.getMedicalPresc());
			ps.setString(7,childObj.getIdentificationMark());
			ps.setString(8,childObj.getStoryBehind());
		    ps.setString(9,childObj.getPhoto());
			
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
	public boolean deleteChild(int childId) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("delete from Child_Table where ChildId=?");
			ps.setInt(1,childId);
			int i=ps.executeUpdate();
			if(i!=0)return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean updateChild(Child childObj) {
		String img=childObj.getPhoto();
		
		try {
			Connection conn=ConnectionProvider.getConnection();
			if(img.length()!=0){
			PreparedStatement ps=conn.prepareStatement
					("update Child_Table set childname=? ,age=?, gender=?,education=?,bloodgroup=?,medical_presc=?,identification_mark=?,story_behind=?,sponsored=?,photo=? where ChildId=?");
			ps.setString(1,childObj.getChildName());
			ps.setString(2,childObj.getAge());
			ps.setString(3,childObj.getGender());
			ps.setString(4,childObj.getEducation());
			ps.setString(5,childObj.getBloodGroup());
			ps.setString(6,childObj.getMedicalPresc());
			ps.setString(7,childObj.getIdentificationMark());
			ps.setString(8,childObj.getStoryBehind());
			ps.setString(9,childObj.getSponsored());
			ps.setString(10,childObj.getPhoto());
			ps.setInt(11,childObj.getChildId());
			int i=ps.executeUpdate();
			if(i!=0)return true;
			}
			else if(img.length()==0){
				PreparedStatement ps=conn.prepareStatement
						("update Child_Table set childname=? ,age=?, gender=?,education=?,bloodgroup=?,medical_presc=?,identification_mark=?,story_behind=?,sponsored=? where ChildId=?");
				ps.setString(1,childObj.getChildName());
				ps.setString(2,childObj.getAge());
				ps.setString(3,childObj.getGender());
				ps.setString(4,childObj.getEducation());
				ps.setString(5,childObj.getBloodGroup());
				ps.setString(6,childObj.getMedicalPresc());
				ps.setString(7,childObj.getIdentificationMark());
				ps.setString(8,childObj.getStoryBehind());
				ps.setString(9,childObj.getSponsored());
			    ps.setInt(10,childObj.getChildId());
				int i=ps.executeUpdate();
				if(i!=0)return true;
			}}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public Child getChildById(int childId) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Child_Table where ChildId=?");
			ps.setInt(1,childId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				String gen=rs.getString(4);
				String edu=rs.getString(5);
				String bg=rs.getString(6);
				String md=rs.getString(7);
				String im=rs.getString(8);
				String sb=rs.getString(9);
				String s=rs.getString(10);
				String p=rs.getString(11);

				Child cObj=new Child();
				cObj.setChildId(id);
				cObj.setChildName(name);
                cObj.setAge(age);
				cObj.setGender(gen);
				cObj.setEducation(edu);
				cObj.setBloodGroup(bg);
				cObj.setMedicalPresc(md);
				cObj.setIdentificationMark(im);
				cObj.setStoryBehind(sb);
				cObj.setSponsored(s);
				cObj.setPhoto(p);
				return cObj;
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
		
	}

	@Override
	public List<Child> getAllChildren() {
		List<Child> children=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Child_Table");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				String gen=rs.getString(4);
				String edu=rs.getString(5);
				String bg=rs.getString(6);
				String mp=rs.getString(7);
				String im=rs.getString(8);
				String sb=rs.getString(9);
				String s=rs.getString(10);
				String p=rs.getString(11);

				Child cObj=new Child();
				cObj.setChildId(id);
				cObj.setChildName(name);
                cObj.setAge(age);
				cObj.setGender(gen);
				cObj.setEducation(edu);
				cObj.setBloodGroup(bg);
				cObj.setMedicalPresc(mp);
				cObj.setIdentificationMark(im);
				cObj.setStoryBehind(sb);
				cObj.setSponsored(s);
				cObj.setPhoto(p);
				
				children.add(cObj);

			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return children;
	}

	@Override
	public List<Child> getSponsoredChildren() {
		List<Child> children=new ArrayList<>();
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Child_Table where sponsored=?");
			ps.setString(1,"yes");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				String gen=rs.getString(4);
				String edu=rs.getString(5);
				String bg=rs.getString(6);
				String mp=rs.getString(7);
				String im=rs.getString(8);
				String sb=rs.getString(9);
				String s=rs.getString(10);
				String p=rs.getString(11);

				Child cObj=new Child();
				cObj.setChildId(id);
				cObj.setChildName(name);
                cObj.setAge(age);
				cObj.setGender(gen);
				cObj.setEducation(edu);
				cObj.setBloodGroup(bg);
				cObj.setMedicalPresc(mp);
				cObj.setIdentificationMark(im);
				cObj.setStoryBehind(sb);
				cObj.setSponsored(s);
				cObj.setPhoto(p);
				
				children.add(cObj);

			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return children;
	

		
	}

	
	}

	