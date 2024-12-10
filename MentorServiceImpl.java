package com.klef.jfsd.apms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.repository.MentorRepository;
import com.klef.jfsd.apms.repository.ProjectRepository;
import com.klef.jfsd.apms.repository.StudentRepository;

@Service
public class MentorServiceImpl implements MentorService
{
	
	@Autowired
	private MentorRepository mentorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Mentor checkmentorlogin(String email, String pwd) 
	{
		
		return mentorRepository.checkmentorlogin(email, pwd);
		
	}

	@Override
	public String updatementor(Mentor m) 
	{
		
		Mentor m1 = mentorRepository.findById(m.getId()).get();
		
		m1.setName(m.getName());
		m1.setGender(m.getGender());
		m1.setDepartment(m.getDepartment());
		m1.setDateofbirth(m.getDateofbirth());
		m1.setEmail(m.getEmail());
		m1.setContact(m.getContact());
		m1.setPassword(m.getPassword());
		m1.setActive(m.isActive());
		
		mentorRepository.save(m1);
		
		return "Profile Updated Successfully";
		
	}
	
	
	
	
}
