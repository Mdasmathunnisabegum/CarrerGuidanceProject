package com.klef.jfsd.apms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.apms.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	
	@Query("select a from Admin a where a.username = ?1 and a.password = ?2")
	public Admin checkadminlogin(String uname, String pwd);
	
}
