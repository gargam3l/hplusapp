package com.test.hplus.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	private int id;
	@Size(min=6, message= "{username.cannot.be.less.than.six.characters}")
	private String username;
	@Pattern(regexp = "((?=.*[A-Z]).{6,10})", message = "Password must have one upper case, one lower case and should be between 6 and 10 characters.")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@NotNull(message = "Activity can't be left empty")
	private String activity;
	
	@NotEmpty(message = "First name can't be left empty")
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
