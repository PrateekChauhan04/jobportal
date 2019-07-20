package Dao;



import java.util.List;

import model.Vacancy;



public interface VacancyDao {
	
	public void createVacancy (Vacancy vacancy);
	
	public void updateVacancy (Vacancy vacancy);
	
	public void viewVacancy (Vacancy vacancy);
	
	
	public void deleteVacancy (Vacancy vacancy);
	
	public List<Vacancy> readAll();
	
}
