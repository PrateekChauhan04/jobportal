package Dao;

import java.util.List;

import model.admin;

public interface adminDao {
	
	public void createadmin(admin a);
	public void updateadmin(admin a);
	public void deleteadmin(admin a);
	
	List<admin> readall();

}