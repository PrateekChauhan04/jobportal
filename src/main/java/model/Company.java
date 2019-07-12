package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Company {
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
}
