package org.control;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class dao {
private static SessionFactory sf=null;
static {
	try {
		sf = new Configuration().configure("org/bean/hibernate.cfg.xml").buildSessionFactory();
			}catch(HibernateException exp) {
				System.out.println("error : "+exp);
			}
}
public static SessionFactory getSessionFactory() {
	return sf;
}
}
