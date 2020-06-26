package com.stie.empform.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonalDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	String fullName;
	
	String image;
	
	String nricOrPassportNumber;
	
	String gender;
	
	String maritalStatus;
	
	String citizenship;
	
	boolean pr;
	
	LocalDate sprDate;
	
	String placeOfBirth;
	
	LocalDate dateOfBirth;
	
	int age;
	
	String race;
	
	String religion;
	
	String email;
	
	String nsRank;
	
	String medicalCondition;
	
	String currentAddress;
	
	String overseasAddress;
	
	String mobileContact;
	
	String homeContact;
	
	String officeContact;
	
	String strength;

	String weakness;
	
	String objective;

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNricOrPassportNumber() {
		return nricOrPassportNumber;
	}

	public void setNricOrPassportNumber(String nricOrPassportNumber) {
		this.nricOrPassportNumber = nricOrPassportNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public boolean isPr() {
		return pr;
	}

	public void setPr(boolean pr) {
		this.pr = pr;
	}

	public LocalDate getSprDate() {
		return sprDate;
	}

	public void setSprDate(LocalDate sprDate) {
		this.sprDate = sprDate;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNsRank() {
		return nsRank;
	}

	public void setNsRank(String nsRank) {
		this.nsRank = nsRank;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getOverseasAddress() {
		return overseasAddress;
	}

	public void setOverseasAddress(String overseasAddress) {
		this.overseasAddress = overseasAddress;
	}

	public String getMobileContact() {
		return mobileContact;
	}

	public void setMobileContact(String mobileContact) {
		this.mobileContact = mobileContact;
	}

	public String getHomeContact() {
		return homeContact;
	}

	public void setHomeContact(String homeContact) {
		this.homeContact = homeContact;
	}

	public String getOfficeContact() {
		return officeContact;
	}

	public void setOfficeContact(String officeContact) {
		this.officeContact = officeContact;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
