package com.springcodeioc.ioc1proj;


public class student {

	String name;
	String email;
	String studentId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getstudentId() {
		return studentId;
	}
	public void setstudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public student(String name, String email, String studentId) {
		super();
		this.name = name;
		this.email = email;
		this.studentId = studentId;
	}
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", email=" + email + ", studentId=" + studentId + "]";
	}	
	
	
	
}
