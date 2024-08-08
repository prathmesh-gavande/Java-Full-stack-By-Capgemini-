package com.vaccine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean isValid = false;
        String role = "";

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM hospital WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isValid = true;
                role = "hospital";
            } else {
                ps = con.prepareStatement("SELECT * FROM child WHERE id=? AND parentContact=?");
                ps.setString(1, email);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.next()) {
                    isValid = true;
                    role = "child";
                }
            }

            if (isValid) {
                HttpSession session = request.getSession();
                session.setAttribute("role", role);
                session.setAttribute("email", email);
                if ("hospital".equals(role)) {
                    response.sendRedirect("hospital_dashboard.jsp");
                } else {
                    response.sendRedirect("child_dashboard.jsp");
                }
            } else {
                response.sendRedirect("login.html?error=Invalid Credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.html?error=Server Error");
        }
    }
}