package com.klef.jfsd.apms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private int id;
	@Column(name="sname",nullable=false,length = 50)
	private String name;
	@Column(name="sgender",nullable=false,length = 10)
	private String gender;
	@Column(name="sdob",nullable=false,length = 20)
	private String dateofbirth;
	@Column(name="sdepartment",nullable=false,length = 20)
	private String department;
	@Column(name="semail",nullable=false,unique = true,length = 30)
	private String email;
	@Column(name="spassword",nullable=false,length = 30)
	private String password;
	@Column(name="scontact",nullable=false,unique = true)
	private String contact;
	@Column(name="sactive",nullable=false)
	private boolean active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Student id : " + id + "\nStudent name : " + name + "\nStudent gender : " + gender + "\nStudent dateofbirth : " + dateofbirth
				+ "\nStudent department : " + department + "\nStudent email : " + email + "\nStudent contact=" + contact;
	}
	
}
