package com.task17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

	public static String saveEmp(InsertModel model) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(model);
		tr.commit();
		session.close();
		return "saved";
	}

	public static InsertModel searchEmp(InsertModel s) {
		int empid = s.getEmpId();
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		InsertModel emp = (InsertModel) session.get(InsertModel.class, empid);
		session.close();
		return emp;

	}
	
	public static void deleteEmp(InsertModel s) {
		int empid = s.getEmpId();
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		InsertModel emp = (InsertModel) session.get(InsertModel.class, empid);
		Transaction tr = session.beginTransaction();		
		session.delete(emp);
		tr.commit();
		session.close();
	}
	
	public static InsertModel updateEmp(InsertModel s) {
		int empid = s.getEmpId();
		System.out.println(empid);
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		InsertModel emp = (InsertModel) session.get(InsertModel.class, empid);
		Transaction tr = session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();
		return emp;
	} 
	
}