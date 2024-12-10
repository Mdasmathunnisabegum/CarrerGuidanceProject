package com.klef.jfsd.apms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.apms.model.Mentor;
import com.klef.jfsd.apms.model.MentorTeamMapping;
import com.klef.jfsd.apms.model.Team;

@Repository
public interface MentorTeamMappingRepository extends JpaRepository<MentorTeamMapping, Integer>
{
	
	@Query("SELECT COUNT(mt) FROM MentorTeamMapping mt where mt.m = ?1 and mt.t = ?2")
	public long checkmentorteam(Mentor m, Team t);
	
}
