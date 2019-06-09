package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import training.demo.service.UserService;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	boolean check=UserService.validateUser(uname,pass);
	if(check)
	{
		HttpSession session=request.getSession();
		session.setAttribute("uname", uname);
		RequestDispatcher rd=request.getRequestDispatcher("product");
		rd.forward(request, response);
	}
	else
	{
		out.println("Please re-enter credentials");
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request, response);
	}
	
	
	}

}
