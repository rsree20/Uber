package com.dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
	public static SessionFactory dbUse() {
		System.out.println("done db util");
	
		return new Configuration().configure().buildSessionFactory();
	
	}
	

}