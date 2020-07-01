package com.stie.empform.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HrReview {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	String position;
	
	LocalDate commencementDate;
	
	String project;
	
	String status;
	
	String salaryOffer;
	
	String salaryTerm;

	LocalDate date;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getCommencementDate() {
		return commencementDate;
	}

	public void setCommencementDate(LocalDate commencementDate) {
		this.commencementDate = commencementDate;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSalaryOffer() {
		return salaryOffer;
	}

	public void setSalaryOffer(String salaryOffer) {
		this.salaryOffer = salaryOffer;
	}

	public String getSalaryTerm() {
		return salaryTerm;
	}

	public void setSalaryTerm(String salaryTerm) {
		this.salaryTerm = salaryTerm;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	
}
