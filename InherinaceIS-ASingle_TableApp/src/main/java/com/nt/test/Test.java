package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Employee;
import com.nt.model.Person;
import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try (ses) {
			tx = ses.beginTransaction();
			Person pob = new Person();
			pob.setPerId(10);
			pob.setPerName("A");

			Employee eob = new Employee();
			eob.setPerId(11);
			eob.setPerName("B");
			eob.setEmpSal(2.2);
			eob.setEmpDept("DEV");

			Student sob = new Student();
			sob.setPerId(12);
			sob.setPerName("C");
			sob.setStdFee(9.7);
			sob.setStdGrd("A");

			ses.save(pob);
			ses.save(eob);
			ses.save(sob);

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
