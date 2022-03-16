package edu.school.ElektronenBelejnik.models;

import edu.school.ElektronenBelejnik.enums.Rights;

public class User {
	String name;
	Long id;
	String email;
	int phoneNumber;
	String address;
	String password;
	Rights rights;
	
	
	public User(String name, Long id, String email, int phoneNumber, String address, String password, Rights rights) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.rights = rights;
	}
	
	private User() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Rights getRights() {
		return rights;
	}
	public void setRights(Rights rights) {
		this.rights = rights;
	}
	
	

}
