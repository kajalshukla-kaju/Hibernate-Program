package org.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.customer.Customers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@WebServlet(urlPatterns = "/log")
public class login extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int AccNo = Integer.parseInt(req.getParameter("acc"));
		String password = req.getParameter("pass");
	System.out.println(AccNo+"::"+password);
	SessionFactory sf = dao .getSessionFactory();
	try {
		Session session = sf.openSession();
		session.beginTransaction();
		Query c = session.createQuery("select from Customers where AccNo =:acc and "+"Password=:pass");
		c.setInteger(1, AccNo);
		c.setString(2, password);
		List<Customers> data=c.list();
		RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
		
		rd.include(req, resp);
	}catch(Exception e) {
		System.out.println("mistake ="+e);
	}	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	
	}
	

}

