package comjobportal.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Daoimpl.candidateDaoImpl;
import model.candidate;
import model.education;
import model.experience;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
  candidateDaoImpl t=(candidateDaoImpl)c.getBean("candidatedaoimpl");
 candidate can=new candidate();
can.setMobileNumber("2");
t.createCandidate(can);
  experience ex=new experience();
  ex.setCompany("apple");
  ex.setFromDate("1/1/1");
  ex.setToDate("1/1/1"); 
  education edu=new education();
  t.addEducation(can, edu);
    	 t.addExperience(can, ex);
    	 
    	
    }
}
