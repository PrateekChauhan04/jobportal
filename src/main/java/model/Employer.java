package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employer {
	@Id
	@Column
	private int EId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String contactNumber;
	@Column
	private String location;
	@Column
	private String companyName;
	
	@OneToMany (mappedBy = "employer")
	List<Vacancy> vaccancy=new ArrayList<Vacancy>();
	
	public List<Vacancy> getVaccancy() {
		return vaccancy;
	}
	public void setVaccancy(List<Vacancy> vaccancy) {
		this.vaccancy = vaccancy;
	}
	
	public Company getCompany1() {
		return company;
	}
	public void setCompany1(Company company1) {
		this.company = company1;
	}

	@ManyToMany
    List<Candidate> candidates = new ArrayList<Candidate>();
    
	public List<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	@ManyToOne
	Company company;
	
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}