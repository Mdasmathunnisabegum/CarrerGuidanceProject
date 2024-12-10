package com.klef.jfsd.apms.service;

import com.klef.jfsd.apms.model.Mentor;

public interface MentorService 
{

	public Mentor checkmentorlogin(String email, String pwd);
	public String updatementor(Mentor m);

}
