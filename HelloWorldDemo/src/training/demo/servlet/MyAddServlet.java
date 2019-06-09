package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyAddServlet extends HttpServlet {
	private int slab1;
	private int slab2;
	public void init(ServletConfig config) throws ServletException {
		 super.init(config);
		 slab1= Integer.parseInt(config.getInitParameter("s1"));
		 slab2=Integer.parseInt(config.getInitParameter("s2"));
		 Enumeration<String> e=config.getInitParameterNames();
		 while(e.hasMoreElements()) {
			 String s=e.nextElement();
			 System.out.println(s+"---->"+config.getInitParameter(s));
		 }
		 ServletContext cxt=getServletContext();
		 System.out.println(cxt.getInitParameter("c1"));
		 System.out.println(cxt.getInitParameter("c2"));
		
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int sum=num1+num2+slab1*slab2;
		out.println("<h1>sum : "+ sum+"</h1>");
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		doGet(req,resp);
		
	}
	
	
	

}
