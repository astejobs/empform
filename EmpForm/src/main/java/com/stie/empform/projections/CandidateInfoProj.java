package com.stie.empform.projections;

public interface CandidateInfoProj {
	long getId();
	String  getPostAppliedFor();
	String  getCompany();
	String getProjectSite();
	PersonalDetailsProj getPersonalDetails();
	InterviewAssessmentProj getInterviewAssesment();
}


 