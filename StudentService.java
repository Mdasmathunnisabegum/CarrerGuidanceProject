package com.klef.jfsd.apms.service;

import java.util.List;

import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.MentorTeamMapping;
import com.klef.jfsd.apms.model.Student;
import com.klef.jfsd.apms.model.Team;

public interface StudentService 
{
	
	public Student checkstudentlogin(String email, String pwd);
	public String updatestudent(Student s);
	public List<Student> viewallstudents();
	public String formteam(Team t);
	public long checkteam(Student s1,Student s2,Student s3);
	public String selectmentor(MentorTeamMapping mt);
	public long checkmentorselection(Mentor m, Team t);
	
}
