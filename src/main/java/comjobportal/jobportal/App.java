package comjobportal.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Daoimpl.AdminDaoImpl;
import Daoimpl.CandidateDaoImpl;
import Daoimpl.Companydaoimpl;
import model.Candidate;
import model.Company;
import model.Education;
import model.Experience;
import model.Admin;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
  CandidateDaoImpl t=(CandidateDaoImpl)context.getBean("candidatedaoimpl");
 Candidate can=new Candidate();
can.setMobileNumber("2");
t.createCandidate(can);
  Experience ex=new Experience();
  ex.setCompany("apple");
  ex.setFromDate("1/1/1");
  ex.setToDate("1/1/1"); 
  Education edu=new Education();
  t.addEducation(can, edu);
    	 t.addExperience(can, ex);
    	 Companydaoimpl cdimpl =(Companydaoimpl)context.getBean("companydaoimpl");
    	Company c1=new Company();
    	  cdimpl.createCompany(c1);
    	AdminDaoImpl adminimpl=(AdminDaoImpl)context.getBean("admindaoimpl");
    	Admin ad1=new Admin();
    	adminimpl.createadmin(ad1);
    }
}
