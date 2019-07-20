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
	private int empId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String contactNo;
	@Column
	private String location;
	@Column
	private String companyName;
	
	@OneToMany (mappedBy = "emp")
	List<vacancy> vaccancy=new ArrayList<vacancy>();
	
	public List<vacancy> getVaccancy() {
		return vaccancy;
	}
	public void setVaccancy(List<vacancy> vaccancy) {
		this.vaccancy = vaccancy;
	}
	
	public Company getCompany1() {
		return company1;
	}
	public void setCompany1(Company company1) {
		this.company1 = company1;
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
	Company company1;
	
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
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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