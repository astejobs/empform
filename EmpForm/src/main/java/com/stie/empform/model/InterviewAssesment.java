package com.stie.empform.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InterviewAssesment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	LocalDate interviewDate;
	
	String communication;
	
	String communicationRemarks;
	
	String knowledge;
	
	String knowledgeRemarks;
	
	String response;
	
	String responseRemarks;
	
	String attitude;
	
	String attitudeRemarks;
	
	String initiative;
	
	String initiativeRemarks;
	
	String personality;
	
	String personalityRemarks;
	
	String leadership;
	
	String leadershipRemarks;
	
	String teamwork;
	
	String teamworkRemarks;
	
	String appearance;
	
	String appearanceRemarks;
	
	String overall;
	
	String overallRemarks;
	
	String generalComments;
	
	String recommended;
	
	String interviewer1;
	
	String interviewer2;
	
	String approvedBy;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
	}

	public String getCommunicationRemarks() {
		return communicationRemarks;
	}

	public void setCommunicationRemarks(String communicationRemarks) {
		this.communicationRemarks = communicationRemarks;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

	public String getKnowledgeRemarks() {
		return knowledgeRemarks;
	}

	public void setKnowledgeRemarks(String knowledgeRemarks) {
		this.knowledgeRemarks = knowledgeRemarks;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponseRemarks() {
		return responseRemarks;
	}

	public void setResponseRemarks(String responseRemarks) {
		this.responseRemarks = responseRemarks;
	}

	public String getAttitude() {
		return attitude;
	}

	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	public String getAttitudeRemarks() {
		return attitudeRemarks;
	}

	public void setAttitudeRemarks(String attitudeRemarks) {
		this.attitudeRemarks = attitudeRemarks;
	}

	public String getInitiative() {
		return initiative;
	}

	public void setInitiative(String initiative) {
		this.initiative = initiative;
	}

	public String getInitiativeRemarks() {
		return initiativeRemarks;
	}

	public void setInitiativeRemarks(String initiativeRemarks) {
		this.initiativeRemarks = initiativeRemarks;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getPersonalityRemarks() {
		return personalityRemarks;
	}

	public void setPersonalityRemarks(String personalityRemarks) {
		this.personalityRemarks = personalityRemarks;
	}

	public String getLeadership() {
		return leadership;
	}

	public void setLeadership(String leadership) {
		this.leadership = leadership;
	}

	public String getLeadershipRemarks() {
		return leadershipRemarks;
	}

	public void setLeadershipRemarks(String leadershipRemarks) {
		this.leadershipRemarks = leadershipRemarks;
	}

	public String getTeamwork() {
		return teamwork;
	}

	public void setTeamwork(String teamwork) {
		this.teamwork = teamwork;
	}

	public String getTeamworkRemarks() {
		return teamworkRemarks;
	}

	public void setTeamworkRemarks(String teamworkRemarks) {
		this.teamworkRemarks = teamworkRemarks;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getAppearanceRemarks() {
		return appearanceRemarks;
	}

	public void setAppearanceRemarks(String appearanceRemarks) {
		this.appearanceRemarks = appearanceRemarks;
	}

	public String getOverall() {
		return overall;
	}

	public void setOverall(String overall) {
		this.overall = overall;
	}

	public String getOverallRemarks() {
		return overallRemarks;
	}

	public void setOverallRemarks(String overallRemarks) {
		this.overallRemarks = overallRemarks;
	}

	public String getGeneralComments() {
		return generalComments;
	}

	public void setGeneralComments(String generalComments) {
		this.generalComments = generalComments;
	}

	public String getRecommended() {
		return recommended;
	}

	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}

	public String getInterviewer1() {
		return interviewer1;
	}

	public void setInterviewer1(String interviewer1) {
		this.interviewer1 = interviewer1;
	}

	public String getInterviewer2() {
		return interviewer2;
	}

	public void setInterviewer2(String interviewer2) {
		this.interviewer2 = interviewer2;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	
}
