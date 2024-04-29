package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.Serie;
import com.hibernate.util.HibernateUtil;



public class SerieDAO {

	public void insertSerie (Serie s) {
		Transaction transaction=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			session.persist(s);
			transaction.commit();

		}catch(Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
	
	}
	
	
	public void updateSerie (Serie s) {
		Transaction transaction=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			session.merge(s);
			transaction.commit();

		}catch(Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
	
	}
	
	public void deleteSerie (int id) {
		Transaction transaction=null;
		Serie s=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			session.remove(s);
			transaction.commit();

		}catch(Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			
		}
	
	}
	
	public Serie selectPersonaById(int id) {
		Transaction transaction=null;
		Serie s=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			s=session.get(Serie.class, id);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
		}
	}
	return s;
}
	
	

