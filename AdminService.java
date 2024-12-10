package com.klef.jfsd.apms.service;

import java.util.List;

import com.klef.jfsd.apms.model.Admin;
import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.Project;
import com.klef.jfsd.apms.model.Student;

public interface AdminService 
{
	
	public Admin checkadminlogin(String uname, String pwd);
	// Mentors
	public String insertmentor(Mentor m);
	public List<Mentor> viewallmentors();
	public Mentor viewmentorbyid(int eid);
	public String deletementor(int eid);
	public long mentorcount();
	// Students
	public String insertstudent(Student s);
	public List<Student> viewallstudents();
	public Student viewstudentbyid(int sid);
	public String deletestudent(int sid);
	public long studentcount();
	// Projects
	public String insertproject(Project p);
	public List<Project> viewallprojects();
	public Project viewprojectbyid(int pid);
	public String deleteproject(int pid);
	public long projectcount();
	
}
