package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity

public class vacancy {
	@Column
	String last_date_to_apply;
	@Column
	int no_of_vacancy;
	@Column
	@Id
	int vacancy_id;
	@Column
	float payment_scale;
	@Column
	String experience_requirement;
	@ManyToOne
	Employer emp;
	@ManyToMany
	List<Skills> skills= new ArrayList<Skills>();
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public Employer getEmp() {
		return emp;
	}
	public void setEmp(Employer emp) {
		this.emp = emp;
	}
	@ManyToMany (mappedBy = "van")
	List<Candidate>candidate=new ArrayList<Candidate>();
	
	public List<Candidate> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	@Column(name="openning_date")
	String opening_date;
	
	public String getOpening_date() {
		return opening_date;
	}
	public void setOpening_date(String opening_date) {
		this.opening_date = opening_date;
	}
	@Column(name="last_date_to_apply")
	public String getLast_date_to_apply() {
		return last_date_to_apply;
	}
	public void setLast_date_to_apply(String last_date_to_apply) {
		this.last_date_to_apply = last_date_to_apply;
	}
	@Column(name="no_of_vacancy")
	public int getNo_of_vacancy() {
		return no_of_vacancy;
	}
	public void setNo_of_vaccancy(int no_of_vacancy) {
		this.no_of_vacancy = no_of_vacancy;
	}

	public int getVacancy_id() {
		return vacancy_id;
	}
	public void setVaccancy_id(int vacancy_id) {
		this.vacancy_id = vacancy_id;
	}
	@Column(name="payment_scale")
	public float getPayment_scale() {
		return payment_scale;
	}
	public void setPayment_scale(float payment_scale) {
		this.payment_scale = payment_scale;
	}
	@Column(name="experience_requirement")
	public String getExperience_requirement() {
		return experience_requirement;
	}
	public void setExperience_requirement(String experience_requirement) {
		this.experience_requirement = experience_requirement;
	}
	
    
    
    
}
