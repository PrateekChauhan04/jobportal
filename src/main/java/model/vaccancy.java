package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity

public class vaccancy {
	@Column
	String last_date_to_apply;
	@Column
	int no_of_vaccancy;
	@Column
	@Id
	int vaccancy_id;
	@Column
	float payment_scale;
	@Column
	String experience_requirement;
	@ManyToOne
	Employer emp;
	@ManyToMany (mappedBy = "van")
	List<candidate>can=new ArrayList<candidate>();
	
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
	@Column(name="no_of_vaccancy")
	public int getNo_of_vaccancy() {
		return no_of_vaccancy;
	}
	public void setNo_of_vaccancy(int no_of_vaccancy) {
		this.no_of_vaccancy = no_of_vaccancy;
	}

	public int getVaccancy_id() {
		return vaccancy_id;
	}
	public void setVaccancy_id(int vaccancy_id) {
		this.vaccancy_id = vaccancy_id;
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
