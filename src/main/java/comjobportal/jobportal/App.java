package comjobportal.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Daoimpl.CandidateDaoImpl;
import Daoimpl.Companydaoimpl;
import model.Candidate;
import model.Company;
import model.Education;
import model.Experience;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
  CandidateDaoImpl t=(CandidateDaoImpl)c.getBean("candidatedaoimpl");
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
    	 Companydaoimpl cdimpl =(Companydaoimpl)c.getBean("companydaoimpl");
    	
    	 Company c1=new Company();
    	 
    	 cdimpl.createCompany(c1);
    	
    }
}
