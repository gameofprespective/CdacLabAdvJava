package training.demo.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckRespHeader extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		//resp.setStatus(resp.SC_TEMPORARY_REDIRECT);
		//resp.setHeader("Location", "http://google.com");
		resp.sendRedirect("http://google.com");
	}

}
