package it.synclab.stage.cogeweb.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import it.synclab.stage.cogeweb.entities.Commessa;
import it.synclab.stage.cogeweb.entities.Company;
import it.synclab.stage.cogeweb.entities.Department;
import it.synclab.stage.cogeweb.entities.Employee;

public class TestUtil {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		List<Employee> employees=null;
		Session session=sessionFactory.openSession();
		Commessa commessa =new Commessa(5, new Company("piva5", "INTESA SAN PAOLO"), 36	, "MILANO");
     // Session session = HibernateUtil.getSessionFactory().getCurrentSession();
      Employee employee=new Employee("ABC", "ABC", "ABESOLO", "SOLO", "ING", new GregorianCalendar(1980, 5, 4), "miln", 1600, "INT", new Department(1l, "ing"), commessa	, "M");
     session.beginTransaction();
     // Query<Commessa> commessa=session.createQuery("select c from Commessa c");
    	  
    	 // System.out.println(session.createQuery("select c from Commessa c").list().get(0));
		session.save(employee);
		//employees = session.createQuery("select p from Employee p").list();
	     
      session.getTransaction().commit();
      //printGenericCollection(employees);
      session.close();
	}
	public static   void printGenericCollection(List<Employee> listEmployee){
		String header ="CF \t"+"MATRICULE   \t"+"ID_COMMESSA \t"+"DEPARTMENT \t"+"NAM \t"+"       SURNAME\t"+"ROLL \t"+"PARTNER \t"+"SALARY \t"+"BIRTHDAY \t"+"RESIDENCE \t";
		System.out.println(header+"\n");
		for(Employee employee:listEmployee){			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date =employee.getBirthday().getTime();
			String dateformat =dateFormat.format(date);
			System.out.println(employee.getCf()+"\t"+employee.getMatricule()+"\t         "+employee.getCommessa()+"\t        "+employee.getDepartment()+"\t        "+employee.getNam()+"    \t"+employee.getSurname()+"\t"+employee.getRoll()+"\t"+
					employee.getPartner()+"\t         "+employee.getSalary()+"\t"+dateformat+"\t"+employee.getResidence()+"\n");
			
		}	
	}

}
