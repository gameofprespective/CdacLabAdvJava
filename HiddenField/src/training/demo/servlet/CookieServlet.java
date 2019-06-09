package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookiedemo")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		String btn=req.getParameter("btn");
		 RequestDispatcher rd=req.getRequestDispatcher("cookie.html");
		if(btn.equals("Add Cookie")) {
			String c=req.getParameter("ans");	
		    Cookie cookie=new Cookie(c, c);
		    resp.addCookie(cookie);
		    out.println("Added cookie");
		    rd.include(req, resp);
		}else {
			if(btn.equals("Show Cookie")) {
				Cookie[] arr=req.getCookies();
				for(Cookie c1:arr) {
					out.println(c1.getName()+"--->"+c1.getValue());
				}
			    rd.include(req, resp);
			}else {
				String c=req.getParameter("ans");
				Cookie[] arr=req.getCookies();
				Cookie c2=null;
				for( Cookie c1:arr) {
					if(c1.getName().equals(c)) {
						c2=c1;
						c2.setMaxAge(0);
						break;
					}
				}
				resp.addCookie(c2);
				out.println("cookie deleted");
				rd.include(req, resp);
				
			}
			
		}
		
		
	}

}
