package com.klef.jfsd.apms.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_table")
public class Team 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id1")
	private Student s1;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id2")
	private Student s2;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id3")
	private Student s3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public Student getS3() {
		return s3;
	}

	public void setS3(Student s3) {
		this.s3 = s3;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}
	
	
}
