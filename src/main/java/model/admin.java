package model;

@Entity
public class admin {
	
	@Id
	private int A_id;
	@column
	private String email;
	@column
	private String password;
	
	
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
