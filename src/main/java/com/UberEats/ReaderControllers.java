package com.UberEats;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReaderControllers {

	static SessionFactory sf;
	static {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	@RequestMapping(value= "/ShowAllOther")
	public String getEmployees(Model m) {
		Session session = sf.openSession();
		Query query = session.createQuery("from Employee");
		List emp = query.list();
		m.addAttribute("Emplist", emp);
		session.beginTransaction().commit();
		session.close();
		
		
		return"ShowAllList";
		
		
	}
}
