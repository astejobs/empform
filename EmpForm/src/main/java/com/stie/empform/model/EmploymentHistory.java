package com.stie.empform.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmploymentHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column(name="from_date")
	LocalDate from;
	
	@Column(name="to_date")
	LocalDate to;
	
	String employerInfo;
	
	String salaryInfo;
	
	String jobDescription;
	
	String reasonForLeaving;
	
	@JsonIgnore
	@ManyToOne
	CandidateInfo candidateInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	public String getEmployerInfo() {
		return employerInfo;
	}

	public void setEmployerInfo(String employerInfo) {
		this.employerInfo = employerInfo;
	}

	public String getSalaryInfo() {
		return salaryInfo;
	}

	public void setSalaryInfo(String salaryInfo) {
		this.salaryInfo = salaryInfo;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getReasonForLeaving() {
		return reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}

	public CandidateInfo getCandidateInfo() {
		return candidateInfo;
	}

	public void setCandidateInfo(CandidateInfo candidateInfo) {
		this.candidateInfo = candidateInfo;
	}
	
	
}
