package training.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		int cnt=Integer.parseInt(req.getParameter("count"));
		PrintWriter out=resp.getWriter();
		cnt=cnt+1;
		String str="<a href='counter?count="+cnt+"'>clickme</a>";
		System.out.println(str);
		out.println(str);
		out.println("Counter : "+cnt);
	}

}
