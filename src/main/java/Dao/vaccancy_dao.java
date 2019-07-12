package Dao;



import java.util.List;

import model.vacancy;



public interface vaccancy_dao {
	
	public void addVacancy (vacancy v);
	
	public void updateVacancy (vacancy v);
	
	public void viewVacancy (vacancy v);
	
	
	public void deleteVacancy (vacancy v);
	
	public List<vacancy> readAll();
	
}
