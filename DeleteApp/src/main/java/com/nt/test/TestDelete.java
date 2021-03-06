package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Employee;
import com.nt.util.HibernateUtil;

public class TestDelete {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSf().openSession();
			tx=ses.beginTransaction();
			Employee e1=new Employee();
			e1.setEmpId(101);
			
			ses.delete(e1);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
		e.printStackTrace();	
		}
		finally {
			if(ses!=null)
				ses.close();
		}
	}

}
