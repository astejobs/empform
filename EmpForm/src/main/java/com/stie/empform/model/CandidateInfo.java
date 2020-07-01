package com.stie.empform.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CandidateInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	String postAppliedFor;
	
	String company;
	
	String projectSite;
	
	String infoAboutPosition;
	
	boolean referral; 
	
	@ManyToOne(cascade=CascadeType.ALL)
	ReferralEmployee referralEmployee;
	
	@ManyToOne(cascade=CascadeType.ALL)
	PersonalDetails personalDetails;
	
	String accountNumber;
	
	String bank;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<FamilyDetail> familyDetails;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<Education> educations;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<EmploymentHistory> employmentHistories;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<Language> languages;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<ComputerProficiency> computerProficiencies;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<Membership> memberships;
	
	@OneToMany(mappedBy="candidateInfo",cascade=CascadeType.ALL)
	List<Reference> references;
	
	String expectedSalary;
	
	String currentSalary;
	
	String bonus;
	
	String allowance;
	
	String noticePeriod;
	
	LocalDate availableDate;
	
	boolean declaration1;
	
	boolean declaration2;

	boolean declaration3;

	boolean declaration4;

	boolean declaration5;

	boolean declaration6;
	
	boolean declaration7;
	
	boolean declaration8;
	
	boolean declaration9;	
	
	boolean singaporean;
	
	@ManyToOne(cascade=CascadeType.ALL)
	RatingQuestions ratingQuestions;
	
	@ManyToOne(cascade=CascadeType.ALL)
	InterviewAssesment interviewAssesment;
	
	@ManyToOne(cascade=CascadeType.ALL)
	HrReview hrReview;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostAppliedFor() {
		return postAppliedFor;
	}

	public void setPostAppliedFor(String postAppliedFor) {
		this.postAppliedFor = postAppliedFor;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProjectSite() {
		return projectSite;
	}

	public void setProjectSite(String projectSite) {
		this.projectSite = projectSite;
	}

	public String getInfoAboutPosition() {
		return infoAboutPosition;
	}

	public void setInfoAboutPosition(String infoAboutPosition) {
		this.infoAboutPosition = infoAboutPosition;
	}

	public boolean isReferral() {
		return referral;
	}

	public void setReferral(boolean referral) {
		this.referral = referral;
	}

	public ReferralEmployee getReferralEmployee() {
		return referralEmployee;
	}

	public void setReferralEmployee(ReferralEmployee referralEmployee) {
		this.referralEmployee = referralEmployee;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public List<FamilyDetail> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<FamilyDetail> familyDetails) {
		this.familyDetails = familyDetails;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<EmploymentHistory> getEmploymentHistories() {
		return employmentHistories;
	}

	public void setEmploymentHistories(List<EmploymentHistory> employmentHistories) {
		this.employmentHistories = employmentHistories;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<ComputerProficiency> getComputerProficiencies() {
		return computerProficiencies;
	}

	public void setComputerProficiencies(List<ComputerProficiency> computerProficiencies) {
		this.computerProficiencies = computerProficiencies;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public List<Reference> getReferences() {
		return references;
	}

	public void setReferences(List<Reference> references) {
		this.references = references;
	}

	public String getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(String currentSalary) {
		this.currentSalary = currentSalary;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public LocalDate getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}

	public boolean isDeclaration1() {
		return declaration1;
	}

	public void setDeclaration1(boolean declaration1) {
		this.declaration1 = declaration1;
	}

	public boolean isDeclaration2() {
		return declaration2;
	}

	public void setDeclaration2(boolean declaration2) {
		this.declaration2 = declaration2;
	}

	public boolean isDeclaration3() {
		return declaration3;
	}

	public void setDeclaration3(boolean declaration3) {
		this.declaration3 = declaration3;
	}

	public boolean isDeclaration4() {
		return declaration4;
	}

	public void setDeclaration4(boolean declaration4) {
		this.declaration4 = declaration4;
	}

	public boolean isDeclaration5() {
		return declaration5;
	}

	public void setDeclaration5(boolean declaration5) {
		this.declaration5 = declaration5;
	}

	public boolean isDeclaration6() {
		return declaration6;
	}

	public void setDeclaration6(boolean declaration6) {
		this.declaration6 = declaration6;
	}

	public boolean isDeclaration7() {
		return declaration7;
	}

	public void setDeclaration7(boolean declaration7) {
		this.declaration7 = declaration7;
	}

	public boolean isDeclaration8() {
		return declaration8;
	}

	public void setDeclaration8(boolean declaration8) {
		this.declaration8 = declaration8;
	}

	public boolean isDeclaration9() {
		return declaration9;
	}

	public void setDeclaration9(boolean declaration9) {
		this.declaration9 = declaration9;
	}

	public boolean isSingaporean() {
		return singaporean;
	}

	public void setSingaporean(boolean singaporean) {
		this.singaporean = singaporean;
	}

	public RatingQuestions getRatingQuestions() {
		return ratingQuestions;
	}

	public void setRatingQuestions(RatingQuestions ratingQuestions) {
		this.ratingQuestions = ratingQuestions;
	}

	public InterviewAssesment getInterviewAssesment() {
		return interviewAssesment;
	}

	public void setInterviewAssesment(InterviewAssesment interviewAssesment) {
		this.interviewAssesment = interviewAssesment;
	}

	public HrReview getHrReview() {
		return hrReview;
	}

	public void setHrReview(HrReview hrReview) {
		this.hrReview = hrReview;
	}
	
	
}
