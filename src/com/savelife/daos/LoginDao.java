package com.savelife.daos;
import java.util.List;
import com.savelife.models.Events;
import com.savelife.models.Login;

public interface LoginDao {
	public Login validate(String loginId,String pass);
    public boolean eventsOrganise(Events eventObj);
    public boolean updateEvent(Events eventObj);
    public Events getEventById(int eventId);
    public List<Events> getAllEvents();
}
