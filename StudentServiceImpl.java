package com.klef.jfsd.apms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.MentorTeamMapping;
import com.klef.jfsd.apms.model.Project;
import com.klef.jfsd.apms.model.Student;
import com.klef.jfsd.apms.model.Team;
import com.klef.jfsd.apms.repository.MentorRepository;
import com.klef.jfsd.apms.repository.MentorTeamMappingRepository;
import com.klef.jfsd.apms.repository.ProjectRepository;
import com.klef.jfsd.apms.repository.StudentRepository;
import com.klef.jfsd.apms.repository.TeamRepository;

@Service
public class StudentServiceImpl implements StudentService
{
		
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private MentorTeamMappingRepository teamMappingRepository;

	@Override
	public Student checkstudentlogin(String email, String pwd) 
	{
		
		return studentRepository.checkstudentlogin(email, pwd);
		
	}

	@Override
	public String updatestudent(Student s) 
	{
		Student s1 = studentRepository.findById(s.getId()).get();
		
		s1.setName(s.getName());
		s1.setGender(s.getGender());
		s1.setDepartment(s.getDepartment());
		s1.setDateofbirth(s.getDateofbirth());
		s1.setEmail(s.getEmail());
		s1.setContact(s.getContact());
		s1.setPassword(s.getPassword());
		s1.setActive(s.isActive());
		
		studentRepository.save(s1);
		
		return "Profile Updated Successfully";
		
	}

	@Override
	public long checkteam(Student s1, Student s2, Student s3) 
	{
		
		return teamRepository.checkteam(s1, s2, s3);

	}

	@Override
	public String formteam(Team t) 
	{
		teamRepository.save(t);
		return "Mapping Done";
	}

	@Override
	public List<Student> viewallstudents()
	{
		
		return studentRepository.findAll();
		
	}

	@Override
	public String selectmentor(MentorTeamMapping mt) 
	{	
		// TODO Auto-generated method stub
		teamMappingRepository.save(mt);
		return null;
	}

	@Override
	public long checkmentorselection(Mentor m, Team t) 
	{
		return teamMappingRepository.checkmentorteam(m, t);
	}

}
