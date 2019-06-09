package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutheticationServlet extends HttpServlet{
	private HashMap<String,String> hm=new HashMap();
	public void init() {
		hm.put("aaaa", "aaaa");
		hm.put("bbbb", "bbbb");
		hm.put("cccc", "cccc");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
			PrintWriter out=resp.getWriter();
			String nm=req.getParameter("uname");
			String ps=req.getParameter("pass");
			if(hm.containsKey(nm) && hm.get(nm).equals(ps)) {
				RequestDispatcher rd=req.getRequestDispatcher("category");
				rd.forward(req, resp);
			}else {
				RequestDispatcher rd=req.getRequestDispatcher("Login.html");
				out.println("Pls reneter the details");
				rd.include(req, resp);
				out.println("Below form");
				
			}
		
	}

}
