import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.customer.Customers;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@WebServlet(urlPatterns ="/record")
public class Record extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String AccNo =""+new Random().nextInt(320);
String FirstName = req.getParameter("fn");
String MiddleName = req.getParameter("mn");
  String LastName = req.getParameter("ln");
  String Gender = req.getParameter("Gen");
  String Email = req.getParameter("Email");
  String Mobile = req.getParameter("Mobile") ;
  String Password = req.getParameter("Pass");
  String Address = req.getParameter("Add");
  String DOB = req.getParameter("DOB");
 Customers c1 = new Customers("id", "fn","mn","ln","Gen","Email","Mobile","Pass","Add" );
SessionFactory sf =	Hibernate.getSessionFactory();
try {
	Session session = sf.openSession();
	session.beginTransaction();
	session.save(c1);
	session.getTransaction();
	
	resp.getWriter().println("<html><body><h1>Welcome To RBI</h1></body></html>");
	RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
	rd.include(req, resp);
	}catch(Exception exp) {
		System.out.println("Problem = "+exp );
		
	}
	
	
	
	}


}
