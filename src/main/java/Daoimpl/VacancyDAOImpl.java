package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.VacancyDao;
import model.vacancy;
public class VacancyDAOImpl implements VacancyDao{
	HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void createVacancy(vacancy vacancy) {
		// TODO Auto-generated method stub
	 this.hTemplate.save(vacancy);
		
	}

	public void updateVacancy(vacancy vacancy) {
		// TODO Auto-generated method stub
        this.hTemplate.update(vacancy);
	}

	public void viewVacancy(vacancy vacancy) {
		// TODO Auto-generated method stub
		
	}

	public void deleteVacancy(vacancy vacancy) {
		// TODO Auto-generated method stub
		this.hTemplate.delete(vacancy);
	}

	public List<vacancy> readAll() {
		// TODO Auto-generated method stub
		return this.hTemplate.find("from Vacancy");
	}

	
	

	
}
