package com.digitalizador.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class HibernateUtil {
	
	  private static SessionFactory sessionFactory = buildSessionFactory();
	  private static ServiceRegistry serviceRegistry;
	  
	  private static SessionFactory buildSessionFactory() {
	    try {
	    	
	      // Create the SessionFactory from hibernate.cfg.xml
	    	Configuration configuration = new  Configuration();
	    	configuration.configure();
	    	serviceRegistry = new ServiceRegistryBuilder().applySettings(
	    		configuration.getProperties()).buildServiceRegistry();
	    		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    	return sessionFactory;
	    } catch (Throwable ex) {
	      // Make sure you log the exception, as it might be swallowed
	      System.err.println("Initial SessionFactory creation failed." + ex);
	      throw new ExceptionInInitializerError(ex);
	    }
	  }
	  
	  public static SessionFactory getSessionFactory() {
	    return sessionFactory;
	  }
	  
	  public static void save (Object pojo) {
		 Transaction trns = null;
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  
		  try {
			  trns = session.beginTransaction();
			  session.saveOrUpdate(pojo);
			  session.getTransaction().commit();
		  } catch (RuntimeException e) {
			  if (trns != null) {
				  trns.rollback();
			  }
			  
			  e.printStackTrace();
			  
			  } finally {
			  session.flush();
			  session.close();
		  }
	  }
	}