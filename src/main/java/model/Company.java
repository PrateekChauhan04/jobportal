package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Column
	String email;
	@Column
	int contactNo;
	@Id
	@Column
	int registrationNo;
	@Column
	String webAddress;
	@Column
    String scale;
	@Column
	String companyName;
	public String getcompanyName() {
		return companyName;
	}
	public void setcompanyName(String companyName) {
		companyName = companyName;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		email = email;
	}
	public int getcontactNo() {
		return contactNo;
	}
	public void setcontactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getregistrationNo() {
		return registrationNo;
	}
	public void setregistrationNo(int registrationNo) {
		registrationNo = registrationNo;
	}
	public String getwebAddress() {
		return webAddress;
	}
	public void setwebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getscale() {
		return scale;
	}
	public void setscale(String scale) {
		scale = scale;
	}
	

	@OneToMany
	List<Employer> Employer = new ArrayList<Employer>();

	@ManyToMany
	List<Admin> admin=new ArrayList<Admin>();
	public List<Employer> getEmployer() {
		return Employer;
	}
	public void setEmployer(List<Employer> employer) {
		Employer = employer;
	}
	public List<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}
	
}
