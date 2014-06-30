package Util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 *
 * @author lsantana
 */
public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (HibernateException e) {
			System.out.println("Criacao do objeto SessionFactory falhou." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
    /**
     *
     * @return
     */
    public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}   
