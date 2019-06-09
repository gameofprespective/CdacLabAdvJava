package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHelloServlet extends HttpServlet {
	public void init() {
		//ServletConfig c=this.getServletConfig();
		System.out.println("In init method");
				
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		resp.setHeader("refresh", "10;URL=http://google.com");
		resp.setStatus(200);
		
		Enumeration<String> e=req.getHeaderNames();
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			out.println("s : "+ s+"------> value : "+req.getHeader(s));
		}
		
		resp.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Hello World!!</h1>");
		out.println(new Date());
		out.println("</body></html>");
	}
	public void destroy() {
		System.out.println("In destroy method");
	}

}
