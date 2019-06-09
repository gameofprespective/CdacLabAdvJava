package training.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String nm=request.getParameter("nm");
		String[] hobbies=request.getParameterValues("hobbies");
		HttpSession session=request.getSession();
		session.setAttribute("name",nm);
		session.setAttribute("hobbies", hobbies);
		RequestDispatcher rd=request.getRequestDispatcher("myjsp.jsp");
		rd.forward(request,response);
		
	}
	

}
