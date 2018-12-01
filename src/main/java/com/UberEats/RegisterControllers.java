package com.UberEats;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.uber.employeePojos.Employee;

@Controller
public class RegisterControllers {

	static SessionFactory sf;
	static {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerController(Employee employee) {
		System.out.println("UberEater Triggered");
		
		//validation logic starts here
		if(employee.getName()==null || employee.getName().isEmpty()) {
			//m.addAttribute("message", "name should not be null");	
			return "Register";
		}
		if(employee.getMob()==null || employee.getMob().isEmpty()) {
			//m.addAttribute("message", "Mobile Number should not be null");	
			return "Register";
		}
		if(employee.getMail()==null || employee.getMail().isEmpty()) {
			//m.addAttribute("message", "Mail should not be null");	
			return "Register";
		}
		if(employee.getPwd()==null || employee.getPwd().isEmpty()) {
			//m.addAttribute("message", "Password should not be null");	
			return "Register";
		}
		//validation logic ends here

		try {
			Session session = sf.openSession();
			session.save(employee);
			session.beginTransaction().commit();
			session.close();
		} catch (ConstraintViolationException e) {

			//m.addAttribute("message", "already this mail used please try with new one");
			return "Register";
		} catch (Exception e) {
			//m.addAttribute("message", "please try after sometime!!Somthing went wrong");
			return "Register";
		}

		//m.addAttribute("message", "Registered Successfully");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Loginuser(Model m, @RequestParam("email") String UserName, @RequestParam("pwd") String Pword) {
		System.out.println("login Triggered");
		m.addAttribute("UserName", UserName);
		m.addAttribute("Pword", Pword);

		Session session = sf.openSession();
		Query query = session.createQuery("from Employee where mail =? and pwd=?");
		query.setString(0, UserName);
		query.setString(1, Pword);
		List<Employee> list = query.list();
		if (list.isEmpty()) {
			m.addAttribute("message", "please enter with valid credentials");
			return "login";
		} else {
			m.addAttribute("message", "successfully logined");
			return "profile";
		}
	}

	@RequestMapping(value = "/DeleteUser", method = RequestMethod.POST)
	public String DeleteEmployee(Model m, @RequestParam("MailID") String email) {
		System.out.println("DeleteUser Triggered");
		System.out.println(email);

		Session session = sf.openSession();
		Query query = session.createQuery("delete FROM Employee where mail=?");
		query.setString(0, email);
		query.executeUpdate();

		Query query1 = session.createQuery("from Employee ");

		List<Employee> list = query1.list();
		m.addAttribute("Emplist", list);

		session.beginTransaction().commit();
		session.close();
		return "ShowAllList";
	}

	@RequestMapping(value = "/EditView", method = RequestMethod.POST)
	public String EditView(Model m, @RequestParam("MailID") String email) {
		System.out.println("EditView Triggered");

		Session session = sf.openSession();

		Query query1 = session.createQuery("from Employee where mail=? ");
		query1.setString(0, email);

		List<Employee> list = query1.list();
		m.addAttribute("emp", list.get(0));

		session.beginTransaction().commit();
		session.close();
		return "UpdateUser";
	}

	@RequestMapping(value = "/UpdateUser", method = RequestMethod.POST)
	public String UpdateUserMethod(Model m, Employee emp) {
		System.out.println("UpdateUserMethod Triggered");

		Session session = sf.openSession();
		session.update(emp);
		session.beginTransaction().commit();

		Query query1 = session.createQuery("from Employee ");

		List<Employee> list = query1.list();
		m.addAttribute("Emplist", list);

		session.close();
		return "ShowAllList";
	}
}