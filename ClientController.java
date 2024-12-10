package com.klef.jfsd.apms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.apms.model.Admin;
import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.Project;
import com.klef.jfsd.apms.model.Student;
import com.klef.jfsd.apms.model.Team;
import com.klef.jfsd.apms.service.AdminService;
import com.klef.jfsd.apms.service.MentorService;
import com.klef.jfsd.apms.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientController 
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private MentorService mentorService;
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String main()
	{
		
		return "home";
	
	}
	
	@GetMapping("login")
	public String login()
	{
		
		return "login";
		
	}

	@GetMapping("contact")
	public String contact()
	{
		
		return "contact";
		
	}
	
	@GetMapping("about")
	public String about()
	{
		
		return "about";
		
	}
	
	@GetMapping("developers")
	public String developers()
	{
		
		return "developers";
		
	}
	
	@GetMapping("adminlogin")
	public ModelAndView adminlogin()
	{
		
		ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
		
	}
	
	@PostMapping("checkadminlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		Admin a = adminService.checkadminlogin(uname, pwd);
		if(a!=null)
		{
			mv.addObject("uname", uname);
			mv.setViewName("adminhome");
		}
		else
		{
			mv.addObject("message", "Incorrect Combination of Username and Password");
			mv.setViewName("showerror");
		}
		
		return mv;
		
	}
	
	@GetMapping("adminhome")
	public ModelAndView adminhome()
	{
		
		ModelAndView mv = new ModelAndView("adminhome");
		return mv;
		
	}
	
	@GetMapping("addmentor")
	public ModelAndView addmentor()
	{
		
		ModelAndView mv = new ModelAndView("addmentor");
		return mv;
		
	}
	
	@PostMapping("insertmentor")
	public ModelAndView insertmentor(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String msg = null;
		try
		{
			String eid = request.getParameter("id");
			int id = Integer.parseInt(eid);
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String dob = request.getParameter("dob");
			String dept = request.getParameter("dept");
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			String contact = request.getParameter("contact");
			
			Mentor m = new Mentor();
			m.setId(id);
	        m.setName(name);
	        m.setGender(gender);
	        m.setDateofbirth(dob);
	        m.setDepartment(dept);
	        m.setEmail(email);
	        m.setPassword(pwd);
	        m.setContact(contact);
	        m.setActive(true);
	        
	        msg = adminService.insertmentor(m);
	        mv.setViewName("addmentor");
	        mv.addObject("message", msg);
			
			
			
		}
		catch (Exception e) 
		{
			
			// TODO: handle exception
			mv.setViewName("showerror");
			
			msg = e.getMessage();
			
			mv.addObject("message", msg);
			
		}
		return mv;
		
	}
	
	@GetMapping("mentorlogin")
	public ModelAndView mentorlogin()
	{
		
		ModelAndView mv = new ModelAndView("mentorlogin");
		return mv;
		
	}
	
	@PostMapping("checkmentorlogin")
	public ModelAndView checkmentorlogin(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		Mentor m = mentorService.checkmentorlogin(email, pwd);
		if(m!=null)
		{
			mv.addObject("eid", m.getId());
			mv.setViewName("mentorhome");
		}
		else
		{
			mv.addObject("message", "Incorrect Combination of Email and Password");
			mv.setViewName("showerror");
		}
		
		return mv;
		
	}
	
	
	
	@GetMapping("mentorhome")
	public ModelAndView mentorhome()
	{
		
		ModelAndView mv = new ModelAndView("mentorhome");
		return mv;
		
	}
	
	
	@GetMapping("viewallmentors")
	public ModelAndView viewallmentors()
	{
		
		ModelAndView mv = new ModelAndView("viewallmentors");
		List<Mentor> mlist = adminService.viewallmentors();
		mv.addObject("mentorlist", mlist);
		
		return mv;
		
	}
	
	

	@GetMapping("addstudent")
	public ModelAndView addstudent()
	{
		
		ModelAndView mv = new ModelAndView("addstudent");
		return mv;
		
	}
	
	@PostMapping("insertstudent")
	public ModelAndView insertstudent(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String msg = null;
		try
		{
			String eid = request.getParameter("id");
			int id = Integer.parseInt(eid);
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String dob = request.getParameter("dob");
			String dept = request.getParameter("dept");
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			String contact = request.getParameter("contact");
			
			Student s = new Student();
			s.setId(id);
	        s.setName(name);
	        s.setGender(gender);
	        s.setDateofbirth(dob);
	        s.setDepartment(dept);
	        s.setEmail(email);
	        s.setPassword(pwd);
	        s.setContact(contact);
	        s.setActive(true);
	        
	        msg = adminService.insertstudent(s);
	        mv.setViewName("addstudent");
	        mv.addObject("message", msg);
			
			
			
		}
		catch (Exception e) 
		{
			
			// TODO: handle exception
			mv.setViewName("showerror");
			
			msg = e.getMessage();
			
			mv.addObject("message", msg);
			
		}
		return mv;
		
	}
	
	
	
	@GetMapping("studentlogin")
	public ModelAndView studentlogin()
	{
		
		ModelAndView mv = new ModelAndView("studentlogin");
		return mv;
		
	}
	
	@PostMapping("checkstudentlogin")
	public ModelAndView checkstudentlogin(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		Student s = studentService.checkstudentlogin(email, pwd);
		if(s!=null)
		{
			mv.addObject("sid", s.getId());
			mv.setViewName("studenthome");
		}
		else
		{
			mv.addObject("message", "Incorrect Combination of Email and Password");
			mv.setViewName("showerror");
		}
		
		return mv;
		
	}
	
	@GetMapping("studenthome")
	public String studenthome()
	{
		return "studenthome";
	}
	
	
	@GetMapping("viewallstudents")
	public ModelAndView viewallstudents()
	{
		
		ModelAndView mv = new ModelAndView("viewallstudents");
		List<Student> slist = adminService.viewallstudents();
		mv.addObject("studentlist", slist);
		
		return mv;
		
	}
	
	
	@GetMapping("addproject")
	public ModelAndView addproject()
	{
		
		ModelAndView mv = new ModelAndView("addproject");
		return mv;
		
	}
	
	@PostMapping("insertproject")
	public ModelAndView insertproject(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String msg = null;
		try
		{
			
			String pid = request.getParameter("id");
			int id = Integer.parseInt(pid);
			String name = request.getParameter("name");
			String description = request.getParameter("description");
			
			
			Project p = new Project();
	        p.setId(id);
	        p.setName(name);
	        p.setDescription(description);
	        
	        msg = adminService.insertproject(p);
	        mv.setViewName("addproject");
	        mv.addObject("message", msg);
			
			
			
		}
		catch (Exception e) 
		{
			
			// TODO: handle exception
			mv.setViewName("showerror");
			
			msg = e.getMessage();
			
			mv.addObject("message", msg);
			
		}
		return mv;
		
	}
	
	
	@GetMapping("viewallprojects")
	public ModelAndView viewallprojects()
	{
		
		ModelAndView mv = new ModelAndView("viewallprojects");
		List<Project> plist = adminService.viewallprojects();
		mv.addObject("projectlist", plist);
		
		
		return mv;
		
	}
	
	
	@GetMapping("formteam")
	public ModelAndView formteam()
	{
		
		ModelAndView mv = new ModelAndView("formteam");
		List<Student> slist = studentService.viewallstudents();
		
		mv.addObject("slist",slist);

		return mv;
		
	}
	
	@PostMapping("insertteam")
	public ModelAndView insertteam(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String msg = null;
		try
		{
			
			String student1 = request.getParameter("student1");
			int s1 = Integer.parseInt(student1);
			String student2 = request.getParameter("student2");
			int s2 = Integer.parseInt(student2);
			String student3 = request.getParameter("student3");
			int s3 = Integer.parseInt(student3);
			
			
			long n = studentService.checkteam(adminService.viewstudentbyid(s1), adminService.viewstudentbyid(s2), adminService.viewstudentbyid(s3));
			
			
			if(n>0)
			{
				msg = "mapping already done";
			}
			else
			{
				Team t = new Team();
				t.setS1(adminService.viewstudentbyid(s1));
				t.setS2(adminService.viewstudentbyid(s2));
				t.setS3(adminService.viewstudentbyid(s3));
				
				msg = studentService.formteam(t);
				
			}
			
			
			
		}
		catch (Exception e) 
		{
			
			// TODO: handle exception
			mv.setViewName("showerror");
			
			msg = e.getMessage();
			
			mv.addObject("message", msg);
			
		}
		return mv;
		
	}
	
	@GetMapping("selectmentor")
	public ModelAndView selectmentor()
	{
		
		ModelAndView mv = new ModelAndView("selectmentor");
		List<Mentor> mlist = adminService.viewallmentors();
		
		mv.addObject("mlist",mlist);

		return mv;
		
	}
	
	@PostMapping("insertselectedmentor")
	public ModelAndView insertselectedmentor(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView();
		String msg = null;
		try
		{
			
			String student1 = request.getParameter("student1");
			int s1 = Integer.parseInt(student1);
			String student2 = request.getParameter("student2");
			int s2 = Integer.parseInt(student2);
			String student3 = request.getParameter("student3");
			int s3 = Integer.parseInt(student3);
			
			
			long n = studentService.checkteam(adminService.viewstudentbyid(s1), adminService.viewstudentbyid(s2), adminService.viewstudentbyid(s3));
			
			
			if(n>0)
			{
				msg = "mapping already done";
			}
			else
			{
				Team t = new Team();
				t.setS1(adminService.viewstudentbyid(s1));
				t.setS2(adminService.viewstudentbyid(s2));
				t.setS3(adminService.viewstudentbyid(s3));
				
				msg = studentService.formteam(t);
				
			}
			
			
			
		}
		catch (Exception e) 
		{
			
			// TODO: handle exception
			mv.setViewName("showerror");
			
			msg = e.getMessage();
			
			mv.addObject("message", msg);
			
		}
		return mv;
		
	}
	
		
	
}
