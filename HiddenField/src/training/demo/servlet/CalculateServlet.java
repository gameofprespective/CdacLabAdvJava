package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/calc")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String> al=null;
	public void init() {
		
		al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
	}
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String ans=req.getParameter("ans");
		String marks=req.getParameter("marks");
		
		if(marks==null) {
			marks="0";
		}
		if(al.contains(ans)) {
			marks=String.valueOf(Integer.parseInt(marks)+1);
		}
		System.out.println("Marks  "+marks);
		out.println("<form action='calc' method='get'>");
		out.println("Ans : <input type='text' name='ans'><br>");
		out.println("<input type='hidden' name='marks' value='"+marks+"'>"); 
		out.println("<input type='submit' name='btn' value='submit'>");
		out.println("</form>");
		
		
	}

}
