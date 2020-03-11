package com.savelife.daos;

import com.savelife.models.Donate;
import com.savelife.models.Sponsor;
import com.savelife.models.User;

public interface UserDao {
	
	public boolean register(User userobj);
	public User getUser(String email);
	public boolean updateUser(User userobj);
	public User validateUser(String email,String pass);
	public boolean changePassword(String email,String newPassword ,String confirmPassword);
	public boolean donate(Donate donateobj);
	public boolean sponsor(Sponsor sponsorobj);
	public String getsponsorerUserById(int childId);
	
	
}

