package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import training.demo.service.UserService;


/**
 * Servlet implementation class AutheticationServlet
 */
@WebServlet("/validate")
public class AutheticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	public void init() {
		userService=new UserService();
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String nm=req.getParameter("uname");
		String ps=req.getParameter("pass");
		Boolean status=false;
		try {
			status = userService.validateUser(nm,ps);
			if(status) {
				HttpSession session=req.getSession();
				session.setAttribute("uname", nm);
				RequestDispatcher rd=req.getRequestDispatcher("category");
				rd.forward(req, resp);
			}else {
				RequestDispatcher rd=req.getRequestDispatcher("Login.html");
				out.println("pls reenter credentials");
				rd.include(req,resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
