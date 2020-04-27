package com.email;

public class Email {
	private String company = "google";
	private String firstName;
	private String lastName;
	private String password;
	private int mailCapacity;
	private String department;
	private String altMail;
	String characters = "ABCEDFGHIJKLMNOPQRSTUVWXYZ@!abcdefghikjlmnopqrstuvwxyz";
		
	public Email() {
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setAltMail(String mail) {
		this.altMail = mail;
	}

	public String getEmail() {
		return firstName + "." + lastName + "@" + department + "." + company + ".com";
	}

	public String getName() {
		return firstName + " " +  lastName;
	}

	public int getMailCapacity() {
		return mailCapacity;
	}
	
	public String getPassword() {
		StringBuilder pass = new StringBuilder();
		for(int i = 0; i < 8; i++) {
			int random = (int)Math.abs((Math.random()*100)-47);
			pass.append(characters.charAt(random));
		}
		return pass.toString();
	}
}