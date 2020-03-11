package com.savelife.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.savelife.daos.FeedbackDao;
import com.savelife.models.Feedback;
import com.savelife.utility.ConnectionProvider;



public class FeedbackDaoImpl implements FeedbackDao {

	@Override
	public boolean feedback(Feedback feedObj) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Feedback_Table values(?,?,?,?)");
			ps.setString(1,feedObj.getName());
			ps.setString(2,feedObj.getEmail());
			ps.setString(3,feedObj.getMobileNo());
			ps.setString(4,feedObj.getFeedback());
			
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
	
	}

	
	


