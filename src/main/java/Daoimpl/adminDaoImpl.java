package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.adminDao;
import model.admin;

public class adminDaoImpl implements adminDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public void createadmin(admin a) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(a);
	}

	public void updateadmin(admin a) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.saveOrUpdate(a);
	}

	public void deleteadmin(admin a) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(a);
	}

	public List<admin> readall() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Student");
	}
	
	

}

