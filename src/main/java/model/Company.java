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
	String Email;
	@Column
	int contact_no;
	@Id
	@Column
	int Registration_no;
	@Column
	String web_address;
	@Column
    String Scale;
	@Column
	String Company_name;
	public String getCompany_name() {
		return Company_name;
	}
	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public int getRegistration_no() {
		return Registration_no;
	}
	public void setRegistration_no(int registration_no) {
		Registration_no = registration_no;
	}
	public String getWeb_address() {
		return web_address;
	}
	public void setWeb_address(String web_address) {
		this.web_address = web_address;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	

	@OneToMany(mappedBy="company")
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
