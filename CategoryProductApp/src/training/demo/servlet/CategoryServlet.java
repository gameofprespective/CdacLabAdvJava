package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CategoryServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String[] arr= {"Shoes","shirts","bags"};
		PrintWriter out=resp.getWriter();
		out.println("In Category Servlet");
		out.print("<form action='product' method='get'>");
		for(String s:arr) {
			
			out.println("<input type='checkbox' name='cat' value='"+s+"'>"+s+"<br>");
		}
		out.println("<input type='submit' name='btn' value='Submit'>");
		out.print("</form>");
		System.out.println("Method : "+req.getMethod());
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		doPost(req,resp);
		
	}

}
