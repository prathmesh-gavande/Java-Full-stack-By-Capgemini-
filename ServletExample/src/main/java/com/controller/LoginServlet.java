package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u=request.getParameter("username");
		String p=request.getParameter("password");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		if("Prathmesh".equals(u) && "1234".equals(p)) {
			HttpSession session=(HttpSession) request.getSession();
			session.setAttribute("username", u);
			session.setAttribute("password", p);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("error.jsp?error=invalid");
		}
	}

	

}
