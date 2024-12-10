package com.klef.jfsd.apms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.Project;
import com.klef.jfsd.apms.model.Student;
import com.klef.jfsd.apms.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>
{
	
	@Query("SELECT COUNT(t) FROM Team t where t.s1 = ?1 and t.s2 = ?2 and t.s3 = ?3")
	public long checkteam(Student s1, Student s2, Student s3);
	
}
