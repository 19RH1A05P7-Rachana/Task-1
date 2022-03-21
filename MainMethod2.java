package com.motivity;
import java.util.List;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Iterator;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
public class MainMethod2 {
	public static void main(String[] args){
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hib2.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Query qr=session.createQuery("select e.employee_name,e.mobile,er.employer_name from EmployerNew er INNER JOIN EmployeeNew e on er.employer_id=e.employerNew");
		List<Object[]> list =qr.list();
		Iterator it=list.iterator();	
		while(it.hasNext()) {
			Object ob[]=(Object[])it.next();
			
			System.out.println(ob[0]+" "+ob[1]+" "+ob[2]);
		}
		/*List<Object[]> list=qr.list();
		for(Object[] arr:list) {
			System.out.println(Arrays.toString(arr));
		}*/
		
		EmployerNew empr1=new EmployerNew();
		empr1.setEmployer_id(1);
		empr1.setEmployer_name("Ramesh");
		empr1.setMobile(9006165074l);
		empr1.setDepartment("HR");
		EmployerNew empr2=new EmployerNew();
		empr2.setEmployer_id(2);
		empr2.setEmployer_name("Suresh");
		empr2.setMobile(8396165074l);
		empr2.setDepartment("Finance");
		EmployerNew empr3=new EmployerNew();
		empr3.setEmployer_id(3);
		empr3.setEmployer_name("Rajesh");
		empr3.setMobile(9696165074l);
		empr3.setDepartment("Assistance");
		EmployeeNew emp1=new EmployeeNew();
		emp1.setEmployee_id(4);
		emp1.setEmployee_name("karthik");
		emp1.setMobile(9912143935l);
		emp1.setAddress("delhi");
		emp1.setEmployerNew(empr1);
		EmployeeNew emp2=new EmployeeNew();
		emp2.setEmployee_id(5);
		emp2.setEmployee_name("Sathvik");
		emp2.setMobile(8022143235l);
		emp2.setAddress("Bhopal");
		emp2.setEmployerNew(empr2);
		EmployeeNew emp3=new EmployeeNew();
		emp3.setEmployee_id(6);
		emp3.setEmployee_name("kethak");
		emp3.setMobile(9912143235l);
		emp3.setAddress("Hyderabad");
		emp3.setEmployerNew(empr3);
		EmployeeNew emp4=new EmployeeNew();
		emp4.setEmployee_id(7);
		emp4.setEmployee_name("Rachana");
		emp4.setMobile(9912343335l);
		emp4.setAddress("Medchal");
		emp4.setEmployerNew(empr1);
		EmployeeNew emp5=new EmployeeNew();
		emp5.setEmployee_id(8);
		emp5.setEmployee_name("Shreya");
		emp5.setMobile(9912143235l);
		emp5.setAddress("Maisammaguda");
		emp5.setEmployerNew(empr2);
		List<EmployeeNew> al1=new ArrayList<EmployeeNew>();
		al1.add(emp1);
		al1.add(emp4);
		List<EmployeeNew> al2=new ArrayList<EmployeeNew>();
		al2.add(emp2);
		al2.add(emp5);
		List<EmployeeNew> al3=new ArrayList<EmployeeNew>();
		al3.add(emp3);
		empr1.setEmployeeNew(al1);
		empr2.setEmployeeNew(al2);
		empr3.setEmployeeNew(al3);
		session.save(empr1);
		session.save(empr2);	
		session.save(empr3);
		session.save(emp1);	
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		t.commit();
		session.close();
	}

}
