package Daoimpl;



	import java.util.List;


	import org.springframework.*;
    import org.springframework.orm.hibernate3.HibernateTemplate;

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

		public void saveOrupdateComapany(Company c) {

			hTemplate.update( c);
	                      
		}

		public void deleteComany(Company c) {
			
		hTemplate.delete(c);
		}
	       public List<Company> readAll() {
			
			
			return this.hTemplate.find("from Company");
		}

		public void updateCompany(Company c) {
			// TODO Auto-generated method stub
			
		}

		public void deleteCompany(Company c) {
			// TODO Auto-generated method stub
			
		}
		

		


	}


