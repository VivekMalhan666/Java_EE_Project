package com.savelife.models;



public class Events {
	private int eventId;
	private String eventName;
	private String place ;
	private String dateTime;
	private String duration;
	private String chiefGuestName;
	private String chiefGuestProfession;
	private String eventDesc;
	private String photo;
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getPlace() {
		return place;
	}
	public String getChiefGuestName() {
		return chiefGuestName;
	}
	public void setChiefGuestName(String chiefGuestName) {
		this.chiefGuestName = chiefGuestName;
	}
	public String getChiefGuestProfession() {
		return chiefGuestProfession;
	}
	public void setChiefGuestProfession(String chiefGuestProfession) {
		this.chiefGuestProfession = chiefGuestProfession;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	
	
}