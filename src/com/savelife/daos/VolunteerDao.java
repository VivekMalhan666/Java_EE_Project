package com.savelife.daos;

import java.util.List;


import com.savelife.models.Volunteer;

public interface VolunteerDao {
	public boolean register(Volunteer VolunteerObj);
	public Volunteer getVolunteer(String email);
	public boolean updateVolunteer(Volunteer VolunteerObj);
	public Volunteer validateVolunteer(String email,String pass);
	public boolean changePassword(String email,String newPassword ,String confirmPassword);
	public boolean volunteerRejection(String email,String reason);
	public boolean rejectVolunteer(String email);
	public List<Volunteer> getAllVolunteer();
	public List<Volunteer> getActiveVolunteer();
	public List<Volunteer> getRejectedVolunteer();
}

