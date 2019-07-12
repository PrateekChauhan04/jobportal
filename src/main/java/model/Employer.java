package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@OneToMany (mappedBy = "emp")
	List<vaccancy> vaccancies=new ArrayList<vaccancy>();
	
	@ManyToMany(mappedBy = "emp")
    List<candidate> c = new ArrayList<candidate>();
    
	
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