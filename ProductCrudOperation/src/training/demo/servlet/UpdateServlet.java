package training.demo.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.demo.service.ProductService;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		ResultSet rs=ProductService.getProductById(pid);
		request.setAttribute("rs",rs);
		RequestDispatcher rd=request.getRequestDispatcher("EditProduct.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
