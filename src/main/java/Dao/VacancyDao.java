package Dao;



import java.util.List;

import model.vacancy;



public interface VacancyDao {
	
	public void createVacancy (vacancy v);
	
	public void updateVacancy (vacancy v);
	
	public void viewVacancy (vacancy v);
	
	
	public void deleteVacancy (vacancy v);
	
	public List<vacancy> readAll();
	
}
