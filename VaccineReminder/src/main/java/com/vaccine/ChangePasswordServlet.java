package com.vaccine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/change_password")
public class ChangePasswordServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPassword = request.getParameter("currentPassword");
        String newPassword = request.getParameter("newPassword");
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        String role = (String) session.getAttribute("role");

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps;
            if ("hospital".equals(role)) {
                ps = con.prepareStatement("UPDATE hospital SET password=? WHERE email=? AND password=?");
                ps.setString(1, newPassword);
                ps.setString(2, email);
                ps.setString(3, currentPassword);
            } else {
                ps = con.prepareStatement("UPDATE child SET parentContact=? WHERE id=? AND parentContact=?");
                ps.setString(1, newPassword);
                ps.setString(2, email);
                ps.setString(3, currentPassword);
            }
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                response.sendRedirect("login.html?message=Password changed successfully");
            } else {
                response.sendRedirect("change_password.jsp?error=Current password is incorrect");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("change_password.jsp?error=Server Error");
        }
    }
}
