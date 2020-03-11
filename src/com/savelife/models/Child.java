package com.savelife.models;

public class Child {
	private int childId;
	private String childName;
	private String age ;
	private String gender;
	private String education;
	private String bloodGroup;
	private String medicalPresc;
	private String identificationMark;
	private String storyBehind;
	private String sponsored;
	private String photo;
	public int getChildId() {
		return childId;
	}
	public String getSponsored() {
		return sponsored;
	}
	public void setSponsored(String sponsored) {
		this.sponsored = sponsored;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMedicalPresc() {
		return medicalPresc;
	}
	public void setMedicalPresc(String medicalPresc) {
		this.medicalPresc = medicalPresc;
	}
	public String getIdentificationMark() {
		return identificationMark;
	}
	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}
	public String getStoryBehind() {
		return storyBehind;
	}
	public void setStoryBehind(String storyBehind) {
		this.storyBehind = storyBehind;
	}
	
}
