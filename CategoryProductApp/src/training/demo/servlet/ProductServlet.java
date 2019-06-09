package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		
		String[] v=req.getParameterValues("cat");
		for(String data :v) {
			out.println("Value selected : "+data);
			
		}
	}

}
