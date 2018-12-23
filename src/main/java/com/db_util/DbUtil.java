package com.db_util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
	public static SessionFactory getSessionFactory() {
		
		return new Configuration().configure().buildSessionFactory();
		
	}

}
