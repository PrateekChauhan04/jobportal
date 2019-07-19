package comjobportal.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.AdminDao;
import Dao.CandidateDao;
import Dao.CompanyDao;
import Dao.EmployerDao;
import Dao.SkillsDao;
import Dao.VacancyDao;
import Daoimpl.AdminDaoImpl;
import Daoimpl.CandidateDaoImpl;
import Daoimpl.Companydaoimpl;
import model.Candidate;
import model.Company;
import model.Education;
import model.Employer;
import model.Experience;
import model.Skills;
import model.vacancy;
import model.Admin;

public class App 
{
    public static void main( String[] args )
    {
          ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml"); 
                  
         CandidateDao candidateDao =(CandidateDao)context.getBean("candidatedaoimpl");
         EmployerDao employerDao =(EmployerDao)context.getBean("employerdaoimpl");
         VacancyDao vacancyDao =(VacancyDao)context.getBean("vacancydaoimpl");
         CompanyDao companyDao =(CompanyDao)context.getBean("companydaoimpl");
        AdminDao adminDao =(AdminDao)context.getBean("admindaoimpl");      
        SkillsDao skillsDao =(SkillsDao)context.getBean("skillsdaoimpl");      
        
        
        
        Skills skills  =(Skills)context.getBean("skills");
        Company company  =(Company)context.getBean("company");
       Admin admin  =(Admin)context.getBean("admin");
             
         vacancy vacancy  =(vacancy)context.getBean("vacancy");
        Candidate candidate  =(Candidate)context.getBean("candidate");
        Employer employer =(Employer)context.getBean("employer");
        Education education = new Education();
        Experience experience=new Experience();
        candidate.setName("Gaurav");
        candidate.setAge(20);
        candidate.setCountry("india");
        candidate.setEmail("hiakfhuih");
        candidate.setGender("Male");
        candidate.setMobileNumber("646456");
        candidate.setPassword("asdhfj");
        candidate.setPinCode(6564);
        candidate.setResume("dasf");
        candidate.setState("MP");
        education.setBranch("cs");
        education.setCourse("database");
        experience.setCompany("ikjfahouih");
        experience.setToDate("646");
        experience.setFromDate("65964");
        candidate.getEdu().add(education);
        candidate.getExp().add(experience);
        employer.setCompanyName("asdhj");
        employer.setContactNumber("5886");
        employer.setEId(1);
        employer.setEmail("asdfj");
        employer.setLocation("adshoijf");
        employer.setName("fsad");
        candidate.getEmp().add(employer);
       
       employer.getCandidates().add(candidate);
      skills.setField("fd");
      skills.setSkill_level("wsdh");
      skills.setSkill_name("frds");
      skills.setSkillId(1);
     
        vacancy.setExperience_requirement("58");
        vacancy.setLast_date_to_apply("69");
        vacancy.setNo_of_vaccancy(65);
        vacancy.setOpening_date("564");
        vacancy.setPayment_scale(45.5f);
        vacancy.setVaccancy_id(1);
        vacancy.getCandidate().add(candidate);
        vacancy.setEmp(employer);
        skills.getSkill().add(vacancy);
        vacancy.getSkills().add(skills);
        candidate.getVan().add(vacancy);  
        employer.getVaccancy().add(vacancy);
       company.setCompany_name("dsf");
       company.setContact_no(55);
       company.setEmail("fsaduh");
       company.setRegistration_no(1);
       company.setScale("dfasf");
       company.setWeb_address("fasd");
      admin.setA_id(1);
      admin.setEmail("fadshj");
      admin.setPassword("dfsjh");
      
      company.getAdmin().add(admin);
      company.getEmployer().add(employer);
      admin.getCompany().add(company);
        
        
        candidateDao.createCandidate(candidate);
        employerDao.addEmployer(employer);
        vacancyDao.createVacancy(vacancy);
        
        
        
        
        
        
        
        
    
    
    }
}
