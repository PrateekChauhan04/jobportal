package Dao;

import java.util.List;

import model.Admin;

public interface AdminDao {
	
	public void createadmin(Admin a);
	public void updateadmin(Admin a);
	public void deleteadmin(Admin a);
	
	public List<Admin> readall();

}