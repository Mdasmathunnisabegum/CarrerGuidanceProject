package com.klef.jfsd.apms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.apms.model.Admin;
import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.Project;
import com.klef.jfsd.apms.model.Student;
import com.klef.jfsd.apms.repository.AdminRepository;
import com.klef.jfsd.apms.repository.MentorRepository;
import com.klef.jfsd.apms.repository.ProjectRepository;
import com.klef.jfsd.apms.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private MentorRepository mentorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	
	@Override
	public String insertmentor(Mentor m) 
	{
		
		mentorRepository.save(m);
		return "Mentor Added Successfully";
		
	}

	@Override
	public List<Mentor> viewallmentors() 
	{
		
		return mentorRepository.findAll();
		
	}

	@Override
	public Mentor viewmentorbyid(int eid)
	{
		
		Optional<Mentor> obj = mentorRepository.findById(eid);
		if(obj.isPresent())
		{
			
			Mentor m = obj.get();
			return m;
		
		}
		else
		{
			
			return null;
			
		}
		
	}

	@Override
	public String deletementor(int eid) 
	{
		
		Optional<Mentor> obj = mentorRepository.findById(eid);
		String msg = null;
		if(obj.isPresent())
		{
			
			Mentor m = obj.get();
			mentorRepository.delete(m);
			msg = "Mentor Deleted Successfully";
		
		}
		else
		{
			
			msg = "Mentor ID not found";
			
		}
		
		return msg;
		
	}

	@Override
	public long mentorcount() 
	{
		
		return mentorRepository.count();
		
	}
	
	
	@Override
	public String insertstudent(Student s) 
	{
		
		studentRepository.save(s);
		return "Student Inserted Successfully";
	}
	

	@Override
	public List<Student> viewallstudents()
	{
		
		return studentRepository.findAll();
		
	}

	@Override
	public Student viewstudentbyid(int sid) 
	{
		
		Optional<Student> obj = studentRepository.findById(sid);
		if(obj.isPresent())
		{
			
			Student s = obj.get();
			return s;
		
		}
		else
		{
			
			return null;
			
		}
		
	}

	@Override
	public String deletestudent(int sid)
	{
		
		Optional<Student> obj = studentRepository.findById(sid);
		String msg = null;
		if(obj.isPresent())
		{
			
			Student s = obj.get();
			studentRepository.delete(s);
			msg = "Student Deleted Successfully";
		
		}
		else
		{
			
			msg = "Student ID not found";
			
		}
		
		return msg;
		
	}

	@Override
	public long studentcount() 
	{
		
		return studentRepository.count();
		
	}
	
	
	@Override
	public String insertproject(Project p) 
	{
		projectRepository.save(p);
		return "Project Inserted Successfully";
	}
	

	@Override
	public List<Project> viewallprojects() 
	{
		
		return projectRepository.findAll();
		
	}

	@Override
	public Project viewprojectbyid(int pid)
	{
		Optional<Project> obj = projectRepository.findById(pid);
		if(obj.isPresent())
		{
			
			Project p = obj.get();
			return p;
		
		}
		else
		{
			
			return null;
			
		}
	}

	@Override
	public String deleteproject(int pid) 
	{
		
		Optional<Project> obj = projectRepository.findById(pid);
		String msg = null;
		if(obj.isPresent())
		{
			
			Project p = obj.get();
			projectRepository.delete(p);
			msg = "Project Deleted Successfully";
		
		}
		else
		{
			
			msg = "Project ID not found";
			
		}
		
		return msg;
		
	}

	@Override
	public long projectcount()
	{
		
		return projectRepository.count();
		
	}

	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		
		return adminRepository.checkadminlogin(uname, pwd);
		
	}
	
	
	
}
