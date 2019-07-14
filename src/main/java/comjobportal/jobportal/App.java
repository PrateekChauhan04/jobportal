package comjobportal.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.candidateDao;
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
    	 
    	
    }
}
