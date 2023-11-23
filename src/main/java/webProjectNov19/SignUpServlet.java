package webProjectNov19;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signupservlet")
public class SignUpServlet extends HttpServlet {
	
       List<UserDTO> list = new ArrayList<UserDTO>();
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   	String username = req.getParameter("username");
   	String password = req.getParameter("password");
   	String email = req.getParameter("email");
   	String gender = req.getParameter("gender");
   	
   	req.setAttribute("uName", username);
   	req.setAttribute("pswd", password);
   	req.setAttribute("email", email);
   	req.setAttribute("gender", gender);
   	UserDTO userDTO= new UserDTO(username, password, email,gender);
   	list.add(userDTO);
   	System.out.println(list);
   	req.getRequestDispatcher("UserInfo.jsp").forward(req, resp);

    //git change


}
}
