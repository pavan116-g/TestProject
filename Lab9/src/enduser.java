import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class enduser 
{
		public static void main(String args[])
		  {
			  Configuration cg=new Configuration();
			  cg.configure("hibernate.cfg.xml");
			  SessionFactory sf=cg.buildSessionFactory();
			  Session s=sf.openSession();
			  Scanner sc=new Scanner(System.in);
			  employee emp=new employee();
			  /*System.out.println("Enter id of the employee");
			  emp.setId(sc.nextInt());
			  System.out.println("Enter name  of the employee");
			  emp.setName(sc.next());
			  System.out.println("Enter salary of the employee");
			  emp.setSalary(sc.nextInt());
			  System.out.println("Enter address of the employee");
			  emp.setAddress(sc.next());
			  */
			  
			  
			  /*Query qry=s.createQuery("update employee set name=? ,salary=? where eid=?");
			  qry.setString(0, "naruto");
			  qry.setDouble(1,34000.04);
			  qry.setInteger(2, 3);
			  int n=qry.executeUpdate();
			  System.out.println("updated");*/
			  
			  
			  /*
			  Query qry=s.createQuery("from employee where eid=?");
			  qry.setInteger(0,1);
			  int n=qry.executeUpdate();
			  System.out.println(emp.getId()+","+emp.getName()+","+emp.getSalary()+","+emp.getAddress());
			  */
			  
			  /*
			  Query qry=s.createQuery("delete from employee where eid=?");
			  qry.setInteger(0, 2);
			  int n=qry.executeUpdate();
			  System.out.println("Deleted");
			  */
			  
			  
			  Transaction txt=s.beginTransaction();
			  
			  
			  
			  //System.out.println("Inserted");
			  txt.commit();
			  s.close();
			  sf.close();
			  

			  
		  }
}