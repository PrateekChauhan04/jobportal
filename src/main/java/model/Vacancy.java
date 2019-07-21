package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity

public class Vacancy {
	
	@Column
	String openingDate;
	
	@Column
	String lastDateToApply;
	@Column
	int noOfVacancy;
	@Column
	@Id
	int vacancyId;
	@Column
	float paymentScale;
	@Column
	String experienceRequirement;
	@ManyToOne
	Employer employer;
	@ManyToMany
	List<Skills> skills= new ArrayList<Skills>();
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public Employer getEmp() {
		return employer;
	}
	public void setEmp(Employer emp) {
		this.employer = emp;
	}
	@ManyToMany
	List<Candidate>candidate=new ArrayList<Candidate>();
	
	public List<Candidate> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public String getLastDateToApply() {
		return lastDateToApply;
	}
	public void setLastDateToApply(String lastDateToApply) {
		this.lastDateToApply = lastDateToApply;
	}
	public int getNoOfVacancy() {
		return noOfVacancy;
	}
	public void setNoOfVacancy(int noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}
	public int getVacancyId() {
		return vacancyId;
	}
	public void setVacancyId(int vacancyId) {
		this.vacancyId = vacancyId;
	}
	public float getPaymentScale() {
		return paymentScale;
	}
	public void setPaymentScale(float paymentScale) {
		this.paymentScale = paymentScale;
	}
	public String getExperienceRequirement() {
		return experienceRequirement;
	}
	public void setExperienceRequirement(String experienceRequirement) {
		this.experienceRequirement = experienceRequirement;
	}
	
    
    
    
}
