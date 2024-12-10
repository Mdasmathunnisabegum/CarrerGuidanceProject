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
@Table(name = "mentorteam_table")
public class MentorTeamMapping 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id1")
	private Mentor m;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id2")
	private Team t;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mentor getM() {
		return m;
	}

	public void setM(Mentor m) {
		this.m = m;
	}

	public Team getT() {
		return t;
	}

	public void setT(Team t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "MentorTeamMapping [id=" + id + ", m=" + m + ", t=" + t + "]";
	}
	
	
	
}
