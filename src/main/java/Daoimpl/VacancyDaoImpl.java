package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;




import model.Vacancy;

import Dao.VacancyDao;
import model.Vacancy;
public class VacancyDaoImpl implements VacancyDao{

	HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void createVacancy(Vacancy vacancy) {
		// TODO Auto-generated method stub
	 this.hTemplate.save(vacancy);
		
	}

	public void updateVacancy(Vacancy vacancy) {
		// TODO Auto-generated method stub
        this.hTemplate.update(vacancy);
	}

	public void viewVacancy(Vacancy vacancy) {
		// TODO Auto-generated method stub
		
	}

	public void deleteVacancy(Vacancy vacancy) {
		// TODO Auto-generated method stub
		this.hTemplate.delete(vacancy);
	}

	public List<Vacancy> readAll() {
		// TODO Auto-generated method stub
		return this.hTemplate.find("from Vacancy");
	}

	
	

	
}
