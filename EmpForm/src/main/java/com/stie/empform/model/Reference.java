package com.stie.empform.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reference {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	String name;
	
	String position;
	
	String company;
	
	String yearsKnown;
	
	String conatct;
	
	@ManyToOne
	CandidateInfo candidateInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getYearsKnown() {
		return yearsKnown;
	}

	public void setYearsKnown(String yearsKnown) {
		this.yearsKnown = yearsKnown;
	}

	public String getConatct() {
		return conatct;
	}

	public void setConatct(String conatct) {
		this.conatct = conatct;
	}

	public CandidateInfo getCandidateInfo() {
		return candidateInfo;
	}

	public void setCandidateInfo(CandidateInfo candidateInfo) {
		this.candidateInfo = candidateInfo;
	}
	
	
	
	
}
