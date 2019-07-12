package Dao;

import java.util.List;

import model.vaccancy;

public interface CompanyDao {

public void createVacancy(vaccancy v);
public void  updateVacancy(vaccancy v);
public void deleteVacancy(vaccancy v);
	
	
public List<Vaccancy> readAll();

public Vaccancy getCompanyById(int Vacancy_id);	

}
