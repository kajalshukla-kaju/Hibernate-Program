package org.control;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.customer.Customers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@WebServlet(urlPatterns = "/record")
public class record extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int AccNo = new Random().nextInt(320);
		String FirstName = req.getParameter("fn");
		String MiddleName = req.getParameter("mn");
		String LastName = req.getParameter("ln");
		String Gender = req.getParameter("gen");
		String Email = req.getParameter("email");
		String Mobile = req.getParameter("mobile");
		String Password = req.getParameter("pass");
		String Address = req.getParameter("add");
		String DOB = req.getParameter("dob");
		Customers c = new Customers();

		
		c.setAccNo(AccNo);
		c.setFirstName(FirstName);
		c.setMiddleName(MiddleName);
		c.setLastName(LastName);
		c.setGender(Gender);
		c.setEmail(Email);
		c.setMobile(Mobile);
		c.setPassword(Password);
		c.setAddress(Address);
		c.setDOB(DOB);
		
			SessionFactory sf = dao.getSessionFactory();
			try {
				Session session = sf.openSession();
				session.beginTransaction();
				session.save(c);
				session.getTransaction().commit();
				
				resp.getWriter().println("<html><body><h1>Registration Done</h1></body></html>");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.include(req, resp);
			}catch(Exception exp) {
				System.err.println("Problem : "+exp);	
		}

	}

}
