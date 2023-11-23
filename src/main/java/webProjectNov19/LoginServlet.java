package webProjectNov19;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		String password = req.getParameter("pswd");
        if("Bickey".equalsIgnoreCase(username)&&"Manandhar".equalsIgnoreCase(password)) {
        	//resp.getWriter().print("<h1>Login Successful");
			req.setAttribute("uName", username);
			req.setAttribute("msg", "Congratulations you have successfully signed in");

			req.getRequestDispatcher("Success.jsp").forward(req, resp);

        }
        else
        	//resp.getWriter().print("<h1>Login NOT Successful");
        req.setAttribute("uName", username);
		req.getRequestDispatcher("Fail.jsp").forward(req, resp);
	}
	
}
