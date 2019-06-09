package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.demo.service.ProdService;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		try {
			ResultSet rs=ProdService.getCategories();
			out.println("<form action='product'method='post'>");
			while(rs.next()) {
			    out.println("<input type='checkbox' name='cat' value='"+rs.getString(1)+"'>"+rs.getString(2)+"<br>");
			}
			out.println("<input type='submit' name='btn' value='Submit'>");
			out.println("</form>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			doGet(req,resp);
		}
	


}
