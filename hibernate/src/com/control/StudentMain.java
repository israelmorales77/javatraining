package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Student.Student;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		Configuration config = new Configuration().configure(); 
		config.addAnnotatedClass(com.Student.Student.class);
		
		StandardServiceRegistryBuilder stdReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		
		SessionFactory mySession = config.buildSessionFactory(stdReg.build());
		
		Session session = mySession.openSession();
		
		Transaction trn = session.beginTransaction();
		
		Student s1 = new Student(1000,"Israel","Morales","izzy@email.com",40);
		Student s2 = new Student(1001,"Jane","Doe","jane@email.com",30);
		Student s3 = new Student(1002,"Billy","Bop","billy@email.com",20);
		Student s4 = new Student(1003,"John","Doe","john@email.com",39);
		Student s5 = new Student(1004,"Rachel","Zane","rachel@email.com",39);
		Student s6 = new Student(1005,"Victoria","Escalane","vicky@email.com",39);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		
		trn.commit();
		
		/*Student selectedItem = session.get(Student.class, 1002);
		System.out.println("Row returned was: "+selectedItem);
		*/
		
		session.close();

	}

}
