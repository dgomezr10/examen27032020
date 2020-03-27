package paquete_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ExamServlet extends HttpServlet{

	public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
				
		pw.println("<html><body>");
		pw.println("David Gómez Rus");
		pw.println("</body></html>");
		
		pw.close();
	}
}