package com.klef.jfsd.apms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.apms.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>
{

}
