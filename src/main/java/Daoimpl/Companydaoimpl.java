package Daoimpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

	import java.util.List;

    import Dao.CompanyDao;
	import model.Company;
	

	public class Companydaoimpl implements CompanyDao {

		private HibernateTemplate hTemplate;
		
			
		public HibernateTemplate gethTemplate() {
			return hTemplate;
		}

		public void sethTemplate(HibernateTemplate hTemplate) {
			this.hTemplate = hTemplate;
		}

		public void createCompany(Company c) {
			
			this.hTemplate.save(c);
			
		}

		
		public void deleteCompany(Company c) {
			
		this.hTemplate.delete(c);
		}
	       public List<Company> readAll() {
			
			
			return this.hTemplate.find("from Company");
		}

		public void updateCompany(Company c) {
			
			this.hTemplate.update(c);
			
		}

	

	}


